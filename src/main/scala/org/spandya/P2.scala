package org.spandya

//Find the penultimate element in a list
class P2[T] {

  def penultimate(list: Array[T]) : T = {
    if(list.length <= 1){
      throw new NoSuchElementException
    }
    if(list.length > 2) {
      penultimate(list.tail)
    }
    else list(0)
  }

}
