object Questions extends App {

  // Question 2

  var k, i, j: Int = 2
  var m, n: Int = 5
  var f: Float = 12.0f
  var g: Float = 4.0f
  var c: Char = 'X'

  //Question 3

  println {
    "a) k + 12 * m  = " + (k + 12 * m)
  }
  println {
    "b) m / j       = " + (m / j)
  }
  println {
    "c) n % j       = " + (n % j)
  }
  println {
    "d) m / j * j   = " + (m / j * j)
  }
  println {
    "e) f + 10*5 +g = " + (f + 10 * 5 + g)
  }

  i += 1 //increment ++does not work with scala
  println {
    "f) ++i * n     = " + (+i * n)
  }


  //Compare the Java and Scala programming languages.
  //Scala is a relatively new language when compared to Java.
  // It is an object-oriented language,
  // whereas Java is a machine-compiled language.
  // A multi-core work architectural environment is made possible by Scala,
  // which also improves readability and conciseness of the code.
  //Comparing Scala to Java, less lines of code are required.

  var a: Int = 2
  var b: Int = 3
  var c2: Int = 4
  var d: Int = 5
  var k2: Float = 4.3f

  println()
  //increment ++ & decremnt -- operators will not work with scala
  b -= 1
  println {
    "a) --b * a+ c * d--       = " + (b * a + c * d)
  }
  d -= 1
  a += 1
  println {
    "b) a++                    = " + (a)
  }
  println {
    "c) (–2 * (g–k2) + c2)    = " + (-2 * (g - k2) + c2)
  }
  println {
    "d) c2++                   = " + (c2)
  }
  c2 = c2 + 1

  c2 += 1
  println {
    "e) c=++c*a++              = " + (c2 * a)
  }
  a += 1

}



