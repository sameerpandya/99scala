package org.spandya

import org.scalatest.FunSuite

import scala.collection.immutable.List

class P4Test extends FunSuite{

  val testObj = new P4[Any]

  test("Given an empty array return 0") {
    val emptyList = List[Any]()
    assert(Integer.valueOf(0).equals(testObj.numberOfElements(emptyList)))
  }

  test("Given an array of size 1, return 1") {
    val set = List[Any](false)
    assert(Integer.valueOf(1).equals(testObj.numberOfElements(set)))
  }

  test("Given an array of size K, return K, where K = 4") {
    val set = List[Any](1, false, 3.5d, "string")
    assert(Integer.valueOf(4).equals(testObj.numberOfElements(set)))
  }


}
