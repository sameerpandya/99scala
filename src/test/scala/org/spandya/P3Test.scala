package org.spandya

import org.scalatest.FunSuite

class P3Test extends FunSuite{

  val testObj = new P3[Any]

  test("Given a number K and a list, if K < 0, then throw exception") {
    val emptyList = new Array[Any](0)
    assertThrows[IllegalArgumentException](testObj.nth(Integer.valueOf(-1), emptyList))
  }

  test("Given a number K and a list of length < K, then throw exception") {
    val n = Integer.valueOf(1)
    val singleElementList = Array[Any](true)
    assertThrows[IndexOutOfBoundsException](testObj.nth(n, singleElementList))
  }

  test("Given n=0 and a list of length >= 1, then return first element of list") {
    val n = Integer.valueOf(0)
    val expectedValue = false
    val list = Array[Any](expectedValue, 1, 3.5d, "hello")

    assert(expectedValue.equals(testObj.nth(n, list)))
  }

  test("Given n=1 and a list of length >= 2, then return second element of list") {
    val n = Integer.valueOf(1)
    val expectedValue = Integer.valueOf(1)
    val list = Array[Any](false, expectedValue, 3.5d, "hello")

    assert(expectedValue.equals(testObj.nth(n, list)))
  }

  test("Given n=3 and a list of length >= 4, then return fourth element of list") {
    val n = Integer.valueOf(3)
    val expectedValue = "hello"
    val list = Array[Any](false, 1, 3.5d, expectedValue)

    assert(expectedValue.equals(testObj.nth(n, list)))
  }

}
