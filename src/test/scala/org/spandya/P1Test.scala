package org.spandya

import org.scalatest.FunSuite

import scala.collection.immutable.List


class P1Test extends FunSuite{
  val testObj = new P1[String]

  test("An Empty Set will throw an exception") {

    val emptyArray = List[String]()

    assertThrows[NoSuchElementException] {
      testObj.lastInList(emptyArray)
    }

  }

  test("A set of 1 element will return itself") {
    val expectedString = "last"
    val singleElementArray = List[String](expectedString)

    assert(expectedString.equals(testObj.lastInList(singleElementArray)))
  }

  test("A set of multiple elements will return the last one") {
    val expectedString = "last"
    val multipleElementArray = List[String]("one", "two", expectedString)

    assert(expectedString.equals(testObj.lastInList(multipleElementArray)))
  }
}
