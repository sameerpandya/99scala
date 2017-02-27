
object P1 {

  //Find the last element in a list
  def lastInList(list : Array[Any]) : Any = {
    if(list.length == 0) {
      throw new NoSuchElementException
    }
    else if (list.length > 1) {
      lastInList(list.tail)
    }
    else list(0)
  }
}
