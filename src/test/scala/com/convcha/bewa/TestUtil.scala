package com.convcha.bewa

import cats.effect.IO
import org.http4s.{Response, Status}

object TestUtil {

  def check(actual: IO[Response[IO]], expectedStatus: Status): Boolean = {
    val actualResp = actual.unsafeRunSync()
    val statusCheck = actualResp.status == expectedStatus
    statusCheck
  }

}
