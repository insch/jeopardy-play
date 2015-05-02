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

    public static Result game() {
        return ok(registration.render());
    }

    public static Result loadQuestions(){return ok();}

    public static Result question() { return ok();}

    public static Result login() {return ok(); }

    public static Result logout() {return ok(); }

    public static Result winner() {return ok(); }



}
