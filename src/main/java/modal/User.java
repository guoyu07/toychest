package modal;

import com.jfinal.plugin.activerecord.Model;

import java.util.List;

public class User extends Model<User> {
    public static final User dao = new User().dao();
    public List<User> findByNameAndPwd(String email, String password){
        return find("select * from user where account='" + email + "' and password='" + password + "'");
    }
}
