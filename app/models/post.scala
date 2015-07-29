package models

case class Post(title: String, content: String) {
  require(title != null && !title.isEmpty, "Post must have a title")
  require(content != null && !content.isEmpty, "Post must have a content")
}

