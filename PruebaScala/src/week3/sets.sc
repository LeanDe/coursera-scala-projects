package week3

object sets {
  type Set = Int => Boolean
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: Int => Boolean, elem: Int)Boolean
  def singletonSet(elem: Int): Set = { x => x == elem }
                                                  //> singletonSet: (elem: Int)Int => Boolean
  def union(s: Set, t: Set): Set = { x => contains(s, x) || contains(t, x) }
                                                  //> union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean

  def set1 = singletonSet(2)                      //> set1: => Int => Boolean
  def set2 = singletonSet(4)                      //> set2: => Int => Boolean
  def set_union = union(set1, set2)               //> set_union: => Int => Boolean

  contains(set1, 3)                               //> res0: Boolean = false
  contains(set1, 2)                               //> res1: Boolean = true
  
  contains(set_union, 3)                          //> res2: Boolean = false
  contains(set_union, 2)                          //> res3: Boolean = true
  contains(set_union, 4)                          //> res4: Boolean = true
}