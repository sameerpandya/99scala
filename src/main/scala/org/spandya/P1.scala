package org.spandya

//Find the last element in a list
class P1[T] {

  def lastInList(list : Array[T]) : T = {
    if(list.length == 0) {
      throw new NoSuchElementException
    }
    else if (list.length > 1) {
      lastInList(list.tail)
    }
    else list(0)
  }
}
