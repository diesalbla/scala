// This package object is empty, but must be present to reproduce the problem.
// Also, if it is moved after the `package foo { ... }` block below,
// the problem disappears.
package foo {
  final case class Foo[A](value: A) extends AnyVal
}

package object foo {}

object Test extends App {
  import foo._

  List(Foo(5)) == List(Foo(5))
}