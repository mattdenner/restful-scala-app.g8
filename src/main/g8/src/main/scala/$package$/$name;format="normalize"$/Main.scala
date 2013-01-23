package $package$.$name;format="normalize"$

class Main extends akka.actor.Actor with MainService {
  def actorRefFactory = context
  def receive         = runRoute(routeForRequests)
}

trait MainService extends spray.routing.HttpService {
  val routeForRequests = {
    // TODO: Write your routing rules here
    path("") {
      get {
        reject
      }
    }
  }
}
