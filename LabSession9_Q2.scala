object LabSession9_Q2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational2(3, 4)
    val y = new Rational2(5, 8)
    val z = new Rational2(2, 7)

    println(s"x: $x")
    println(s"y: $y")
    println(s"z: $z")
    println(s"\n")

    val result1 = x.sub(y)
    val result2 = y.sub(z)
    val result3 = x.sub(z)
    val result4 = x.sub(y).sub(z)

    println(s"x - y: $result1")
    println(s"y - z: $result2")
    println(s"x - z: $result3")
    println(s"x - y - z: $result4")
  }
}
