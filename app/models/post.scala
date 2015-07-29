package models

case class Post(title: String, content: String) {
  require(title != null && !title.isEmpty, "Post must have a title")
}

