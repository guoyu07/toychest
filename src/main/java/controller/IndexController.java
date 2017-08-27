package controller;

import com.jfinal.core.Controller;
import modal.User;

import java.util.ArrayList;

public class IndexController extends Controller {
    public void index() {

        setAttr("user",getSessionAttr("userInfo"));
        render("/app.html");
    }
}
