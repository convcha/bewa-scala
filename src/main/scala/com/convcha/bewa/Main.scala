package com.convcha.bewa

import cats.data.Kleisli
import cats.effect._
import org.http4s.dsl.io._
import org.http4s.implicits._
import org.http4s.server.blaze._
import org.http4s.{HttpRoutes, Request, Response}

import scala.concurrent.ExecutionContext.global

object Main extends IOApp {

  val helloWorldService: Kleisli[IO, Request[IO], Response[IO]] = HttpRoutes
    .of[IO] {
      case GET -> Root / "hello" / name =>
        Ok(s"Hello, $name.")
    }
    .orNotFound

  override def run(args: List[String]): IO[ExitCode] =
    BlazeServerBuilder[IO](global)
      .bindHttp(8080, "localhost")
      .withHttpApp(helloWorldService)
      .serve
      .compile
      .drain
      .as(ExitCode.Success)

}
