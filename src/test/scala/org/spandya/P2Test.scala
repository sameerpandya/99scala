package org.spandya

import org.scalatest.FunSuite

import scala.collection.immutable.List


class P2Test extends FunSuite {

  val testObj = new P2[String]

  test("An empty array will return an exception") {
    val emptyArray = List[String]()
    assertThrows[NoSuchElementException](testObj.penultimate(emptyArray))
  }

  test("An array with one element can not have a penultimate element so it returns an exception") {
    val singleElementArray = List[String]("first")
    assertThrows[NoSuchElementException](testObj.penultimate(singleElementArray))
  }

  test("An array with two elements will return the first element") {
    val expected = "first"
    val twoElementArray = List[String](expected, "second")
    assert(expected.equals(testObj.penultimate(twoElementArray)))
  }

  test("An array with more than two elements will return the penultimate element") {
    val expected = "first"
    val twoElementArray = List[String]("zeroth", expected, "second")
    assert(expected.equals(testObj.penultimate(twoElementArray)))
  }
}
