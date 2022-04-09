package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class DefaultController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def index() = Action { implicit request: Request[AnyContent] =>
      Ok(views.html.index())
  }

  // curl localhost:9000/message
  def getMessage(): Action[AnyContent] = Action {
    Ok("hello world")
  }

  // curl localhost:9000/{name}
  def getParamMessage(name: String): Action[AnyContent] = Action {
    Ok(s"${name}, hello world")
  }
}
