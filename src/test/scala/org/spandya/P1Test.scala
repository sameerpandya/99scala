package test.scala.org.spandya

import org.scalatest.FunSuite
import org.spandya.P1


class P1Test extends FunSuite{
  val testobj = new P1[String]

  test("An Empty Set will throw an exception") {

    val emptyArray = new Array[String](0)

    assertThrows[NoSuchElementException] {
      testobj.lastInList(emptyArray)
    }

  }

  test("A set of 1 element will return itself") {
    val expectedString = "last"
    val singleElementArray = Array[String](expectedString)

    assert(expectedString.equals(testobj.lastInList(singleElementArray)))
  }

  test("A set of multiple elements will return the last one") {
    val expectedString = "last"
    val multipleElementArray = Array[String]("one", "two", expectedString)

    assert(expectedString.equals(testobj.lastInList(multipleElementArray)))
  }
}
