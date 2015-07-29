package models

case class Post(title: String, content: String) {
  require(title != null, "Post must have a title")
}

