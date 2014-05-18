package week3

object sets {
  type Set = Int => Boolean;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(110); 
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: Int => Boolean, elem: Int)Boolean""");$skip(56); 
  def singletonSet(elem: Int): Set = { x => x == elem };System.out.println("""singletonSet: (elem: Int)Int => Boolean""");$skip(77); 
  def union(s: Set, t: Set): Set = { x => contains(s, x) || contains(t, x) };System.out.println("""union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(31); 

  def set1 = singletonSet(2);System.out.println("""set1: => Int => Boolean""");$skip(29); 
  def set2 = singletonSet(4);System.out.println("""set2: => Int => Boolean""");$skip(36); 
  def set_union = union(set1, set2);System.out.println("""set_union: => Int => Boolean""");$skip(22); val res$0 = 

  contains(set1, 3);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(20); val res$1 = 
  contains(set1, 2);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(28); val res$2 = 
  
  contains(set_union, 3);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(25); val res$3 = 
  contains(set_union, 2);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(25); val res$4 = 
  contains(set_union, 4);System.out.println("""res4: Boolean = """ + $show(res$4))}
}
