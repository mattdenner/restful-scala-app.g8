package $package$.$name;format="normalize"$

object Boot extends App with spray.can.server.SprayCanHttpServerApp {
  val service = system.actorOf(akka.actor.Props[Main], "$name;format="normalize"$")
  newHttpServer(service) ! Bind(interface = "0.0.0.0", port = util.Properties.envOrElse("PORT","8080").toInt)
}
