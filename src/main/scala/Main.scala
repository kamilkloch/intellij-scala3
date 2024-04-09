import besom.*
import besom.api.docker

@main def main(): Unit = Pulumi.run {
  val network = docker.Network("network")

  Stack(network)
}
