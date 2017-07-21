package org.spandya

import scala.collection.immutable.List

/**
  * Created by sameer on 3/5/17.
  */
class P3[T] {
  // get nth element of list with zero-indexing.
  def nth(n: Integer, list: List[T]): T ={
    if(list.length - 1 < n) {
      throw new IndexOutOfBoundsException
    }
    if(n < 0) {
      throw new IllegalArgumentException
    }

    if(n == 0) {
      return list.head
    }
    else {
      nth(n-1, list.tail)
    }
  }
}
