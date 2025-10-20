import cats.effect.{IO, IOApp}

object IOParSequence extends IOApp.Simple {

  def run: IO[Unit] = {
    val io = IO.parSequenceN(10)(List.fill(10)(IO(1)))
    
    IO.unit
  }
}