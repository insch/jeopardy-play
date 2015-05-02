package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(authentication.render());
    }

    public static Result register() {
        return ok(registration.render());
    }

}
