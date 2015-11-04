
val list0 = List(0)
val list1 = List(1, 2, 3, 4, 5)
val list2 = List(4, 5, 6, 7, 8)
val list3 = List(6, 7, 8, 9, 10)

list1.length
list1.head
list1.last

list3.init
list3.init(1)
list3(1)

list2.take(3)
list2.drop(2)
list2(0)
list2.head

0 :: list1
list1.::(0)
list1 :: list0
list0.::(list1)
list0 ++ list1
list1 ++ list3
list0 ++ list1 ++ list3
list0 ::: list1
list1 ::: list3
list0 ::: list1 ::: list3


def removeAt[T](xs: List[T], x: Int): List[T] = {
  xs.take(x) ++ xs.drop(x + 1)
}

//removeAt[Char](1, List('a', 'b', 'c', 'd'))
removeAt(List(1, 2, 3, 4, 5), 1)

var resVal: List[Any] = List()

//def flatten(xs: List[Any]): List[Any] = {
//  xs.flatMap(x => flat(x))
//}
//
//def flat(x: Int) = x
//
//flatten(List(List(1, 1), 2, List(3, List(5, 8))))


val l = List(List(1, 2), List(3, 4))
val l2 = l.flatMap(identity)
val l3 = l.flatMap(x => x)
for (list <- l; x <- list) yield x
for (list <- l; x <- list) yield list
