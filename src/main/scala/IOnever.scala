import cats.effect.*
import cats.implicits.* // comment out to heal presentation compiler.

object IOnever extends IOApp.Simple {
  def run: IO[Unit] = IO.never[Unit]
}
