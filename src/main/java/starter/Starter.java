package starter;

import com.jfinal.core.JFinal;

public class Starter {
    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 3002, "/");
    }
}
