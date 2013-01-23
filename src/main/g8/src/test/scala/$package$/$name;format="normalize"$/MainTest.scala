package $package$.$name;format="normalize"$

import org.scalatest.FunSuite
import spray.routing.HttpService
import spray.testkit.ScalatestRouteTest

class MainServiceTest extends FunSuite with ScalatestRouteTest {
  lazy val service = new MainService() with HttpService {
    def actorRefFactory = system
  }
  lazy val routes = service.routeForRequests

  test("GET / => unhandled") {
    Get("/") ~> routes ~> check {
      assert(!handled, "unexpectedly handled!")
    }
  }
}
