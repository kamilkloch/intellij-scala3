import scala.compiletime.ops.int.+

// https://youtrack.jetbrains.com/issue/SCL-24021#focus=Comments-27-12208538.0-0
object MatchTypes {
  type IndexOf[Labels <: Tuple, Label <: String] <: Int = Labels match {
    case Label *: _ => 0
    case _ *: t2 => 1 + IndexOf[t2, Label]
  }
}
