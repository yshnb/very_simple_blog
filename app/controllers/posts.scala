package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Post

class Posts extends Controller {
  def index = Action { implicit request =>
    Ok("Some data")
  }
}
