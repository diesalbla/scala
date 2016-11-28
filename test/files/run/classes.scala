package pack

case class A(x: Int)
case class B(x: Int) extends AnyVal

package x {
  case class C(x: Int)
  case class D(x: Int) extends AnyVal
}
package object x

package object y
package y {
  case class E(x: Int)
  case class F(x: Int) extends AnyVal
}

