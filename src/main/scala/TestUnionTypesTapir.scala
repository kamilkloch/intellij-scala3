import io.circe.{Codec, Decoder, Encoder}
import sttp.tapir.Schema
import sttp.tapir.generic.auto.*

object TestUnionTypesTapir extends App {

  type T1 = Int
  type T2 = String

  case class A(x: Either[T1, T2]) derives Schema

  object A {
    private given Schema[T1 | T2] = Schema.derivedUnion
  }

  println(summon[Schema[A]])

  given Decoder[Either[T1, T2]] = summon[Decoder[T1]] either summon[Decoder[T2]]

  // uncomment to see the sluggishness of the IDE.
//  given Encoder[Either[T1, T2]] = Encoder.
    
    

}
