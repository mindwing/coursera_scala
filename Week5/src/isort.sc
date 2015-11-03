object isort {
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }

  var list = List(0, -5, 1, 3, 7, 2, 10)
  var res = isort(list)
  res.reverse
  "reverse function: " + reverse(res)


  def reverse(_these: List[Int]): List[Int] = {
    var result: List[Int] = Nil
    var these = _these
    while (these.nonEmpty) {
      print((these.head :: result) + ", ")
//      result = these.head :: result
      result = result.::(these.head)
      these = these.tail
    }
    result
  }
}
