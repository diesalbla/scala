package object foo {}

package foo {
  case class Bar(value: Int) extends AnyVal
}

object Test extends App {
  import foo._
  Bar(5).equals( Bar(5) )
}