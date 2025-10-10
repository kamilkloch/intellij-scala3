import scala.util.chaining.*

object TupleApply {
  val namedTuple: (a: Int, b: String) = (1, "a")

  case class A(x: Int, y: String)

  namedTuple.pipe[A](x => A.apply.tupled(x))
}
