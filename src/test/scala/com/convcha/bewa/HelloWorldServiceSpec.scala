package com.convcha.bewa

import com.convcha.bewa.Main.helloWorldService
import org.http4s.implicits.http4sLiteralsSyntax
import org.http4s.{Method, Request, Status}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloWorldServiceSpec extends AnyFlatSpec with Matchers {
  "The Hello World service" should "return 200" in {
    val response = helloWorldService.run(
      Request(method = Method.GET, uri = uri"/hello/John")
    )
    TestUtil.check(response, Status.Ok) shouldBe true
  }
}
