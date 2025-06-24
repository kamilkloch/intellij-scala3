import cats.effect.cps.*
import cats.effect.{IO, IOApp}

object AsyncAwait extends IOApp.Simple {
  
  case class A(x: Int)
  
  def run: IO[Unit] = async[IO] {
    println(IO(A(1)).await.x)
  }
}
