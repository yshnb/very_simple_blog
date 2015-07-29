package models

case class Post(title: String, content: String) {
  require(title != null && !title.isEmpty, "Post must have a title")
  require(content != null && !content.isEmpty, "Post must have a content")
}

object Post {
  private var posts = Set(
      Post("Cats", "Cats are nice"),
      Post("Elephants", "Elephants are too big")
    )

  def add(post: Post) = (posts = posts + post)
  def findAll = posts.toList
}
