package org.spandya

import org.scalatest.FunSuite

class P3Test extends FunSuite{

  val testObj = new P3[Any]

  test("Given K, if K < 0, then throw exception") {
    assertThrows[IllegalArgumentException](testObj.nth(Integer.valueOf(-1)))
  }
}
