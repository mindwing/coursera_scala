object pack {
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs.span(y => x == y)
      first :: pack(rest)
  }

  pack(List("a", "a", "a", "b", "c", "c", "a"))

  def encode[T](xs: List[T]): List[(T, Int)] = {
    pack(xs).map(ys => (ys.head, ys.length))
  }

  encode(List("a", "a", "a", "b", "c", "c", "a"))
}
