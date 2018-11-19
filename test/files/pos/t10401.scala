trait A {
  protected def foo(): Unit 
}
trait B extends A 
object B {
  class Config
  implicit val default = new Config
  implicit def AtoB(a: A)(implicit config: Config): B = ???
}

object C {
  import B._
  def fili(x: A): Unit = x.foo()
}
