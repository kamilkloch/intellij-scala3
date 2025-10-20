import cats.effect.*
import fs2.Stream
import scala.concurrent.duration.*

object StreamDuration extends IOApp.Simple {
  override def run: IO[Unit] = {
//    Stream.duration.foreach(_ => IO.sleep(1.second)).compile.drain
    Stream.duration[IO].foreach(_ => IO.sleep(1.second)).compile.drain
  }
}
