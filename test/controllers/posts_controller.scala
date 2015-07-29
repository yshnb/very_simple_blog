import play.api._
import play.api.mvc._
import org.scalatest._
import play.api.test._
import play.api.test.Helpers._
import org.scalatestplus.play._
import play.api.data._
import play.api.data.Forms._
import controllers.Posts

import models.Post

class PostsControllerSpec extends PlaySpec {
  val controller = new Posts

  "index action" must {
    "return 200" in {
      val result = controller.index().apply(FakeRequest())
      status(result) mustBe 200
    }
  }
  
  "Add action" must {
    "when data is ok: add a post and redirect" in {
      val count = Post.findAll.length
      val result = controller.add().apply(FakeRequest().
        withFormUrlEncodedBody("title" -> "Roses",
                            "content" -> "Roses are ii nioi"))
      status(result) mustBe 303
      Post.findAll.length mustBe (count + 1) // 1つデータが追加されてる
    }

    "when data is not ok: add a post and redirect" in {
      val count = Post.findAll.length
      val result = controller.add().apply(FakeRequest().
        withFormUrlEncodedBody("title" -> null,
                            "content" -> "Roses are ii nioi"))
      status(result) mustBe 303
      Post.findAll.length mustBe count // 追加されてない
    }
  }
}

