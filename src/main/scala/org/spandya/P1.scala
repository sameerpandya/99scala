package org.spandya

class P1[T] {
  //Find the last element in a list
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
