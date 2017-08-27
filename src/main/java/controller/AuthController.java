package controller;

import com.jfinal.core.Controller;
import modal.User;

import java.util.ArrayList;
import java.util.List;

public class AuthController extends Controller{
    public void index() {
        String e1 = getPara("email");
        String e2 = getPara("password");
        List<User> userList = User.dao.findByNameAndPwd(getPara("email"), getPara("password"));
        if (userList.size() > 0) {
            setSessionAttr("isloginned","yes");
            setSessionAttr("userInfo", userList.get(0));
            setAttr("user",userList.get(0));
            Object o = getSessionAttr("userInfo");
            String foodlist = ((User) o).getStr("foodlist");
            String[] fl = (foodlist.split(","));
            setAttr("fl", fl);
            render("/app.html");
        } else {
            setAttr("msg", "用户名或密码错误！");
            redirect("/login");
        }
    }
}
