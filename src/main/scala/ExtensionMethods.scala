import besom.*
import besom.api.docker
import besom.api.docker.{Container, RemoteImage}
import besom.api.docker.inputs.*

object ExtensionMethods {
  Pulumi.run {
    val msImage: Output[RemoteImage] = docker.RemoteImage(
      "msImage",
      docker.RemoteImageArgs(
        name = s"ubuntu",
        keepLocally = true
      )
    )

    val msContainer: Output[Container] = docker.Container(
      "msContainer",
      docker.ContainerArgs(
        image = msImage.imageId
      )
    )

    Stack(msContainer)

  }
}

