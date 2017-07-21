package org.spandya

/**
  * Created by sameer on 7/19/17.
  */
class P4[T] {

  def numberOfElements(list: Array[T]): Integer = {
    if(list.length == 0)
      return 0
    return 1 + numberOfElements(list.tail)
  }

}
