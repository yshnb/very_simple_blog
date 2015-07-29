import org.scalatest._
import play.api.test._
import play.api.test.Helpers._
import org.scalatestplus.play._

import models.Post

class PostSpec extends PlaySpec {
  "A Post" must {
    "be created" in {
      val post = Post("Melonpan",
                      "Melonpan is very nice.")
      post.title mustBe "Melonpan"
      post.content mustBe "Melonpn is very nice"
    }
  }
}

