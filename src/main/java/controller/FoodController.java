package controller;

import com.jfinal.core.Controller;
import modal.User;

import java.util.ArrayList;
import java.util.List;

public class FoodController extends Controller {
    public void index() {
        String food = getPara("food");
        String account = getPara("email");
        String password = getPara("password");
        List<User> user = User.dao.findByNameAndPwd(account,password);
        if (user.size() > 0) {
            User u = user.get(0);
            String foodList = u.getStr("foodlist");
            foodList = foodList +  "," + food;
            u.set("foodlist", foodList);
            u.update();
        }
        renderNull();
    }
    public void del() {
        int index = Integer.parseInt(getPara("index"));
        String account = getPara("email");
        String password = getPara("password");
        List<User> user = User.dao.findByNameAndPwd(account,password);
        if (user.size() > 0) {
            User u = user.get(0);
            String foodList = u.getStr("foodlist");
            String[] fll = foodList.split(",");
            ArrayList<String> fl = new ArrayList<String>();
            for (String s : fll
                 ) {
                fl.add(s);
            }
            fl.remove(index-1);
            String toReturn = "";
            for (String s : fl
                 ) {
                toReturn = toReturn + s + ",";
            }
            toReturn = toReturn.substring(0, toReturn.length() - 1);
            u.set("foodlist", toReturn);
            u.update();
        }
        renderNull();
    }
}
