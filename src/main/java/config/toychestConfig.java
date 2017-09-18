package config;

import com.jfinal.config.*;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;
import controller.*;
import modal.User;

public class toychestConfig extends JFinalConfig {

    public void configConstant(Constants constants) {
        PropKit.use("toyChest.txt");
        constants.setDevMode(true);
    }

    public void configRoute(Routes routes) {
        routes.add("/", LoginController.class);
        routes.add("/register", RegisterController.class);
        routes.add("/login", LoginController.class);
        routes.add("/user", IndexController.class);
        routes.add("/auth", AuthController.class);
        routes.add("/food", FoodController.class);
    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins plugins) {
        PropKit.use("toyChest.txt");
        String mysqlHost = PropKit.get("host");
        String mysqlRoot = PropKit.get("root");
        String mysqlPassword = PropKit.get("password");

        DruidPlugin dp = new DruidPlugin(mysqlHost,mysqlRoot,mysqlPassword);
        plugins.add(dp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        plugins.add(arp);

        arp.addMapping("user", User.class);
    }

    public void configInterceptor(Interceptors interceptors) {

    }

    public void configHandler(Handlers handlers) {

    }
}
