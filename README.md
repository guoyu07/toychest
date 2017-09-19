# toychest

A website with some useful tools developed with jFinal web framework. 一个使用jFinal的web框架的小工具网站。

- This is **ONLY** my assignment for database course, **NOT** for pratical usage.
- 这**仅**是我数据库课的一项作业，**并不**具有实际用途。

## Compile 编译

### Using IntelliJ IDEA

1.  Clone this project. 克隆这个项目。
2.  Update jars in maven pom.xml. 在Maven中更新jar包。
3.  Find the class starter.Starter. 找到starter.Starter类。
4.  Run or debug this class (you can change the port in the JFinal.start method). 运行或调试该类（你可以在JFinal.start方法中更改端口）。
5.  Checkout in your browser! (localhost:port) 在你的浏览器中查看（localhost:port）

### Using Eclipse/MyEclipse

1.  Follow the previous five steps from using IDEA above. 参照之上IDEA中的五步操作。
2.  **Additionally**, you need to add another parameter in step 4 into JFinal.start method. **另外**，你需要在第四步中，向JFinal.start方法增加一个参数。

    <code>JFinal.start("src/main/webapp", 80, "/",5);</code> (int)5 is added as the last parameter. (int)5被添加为最后一个参数。

### Tomcat

If you want to use Tomcat instead of Jetty bundled with JFinal, you might remove the jetty-server dependency before compiling.

如果你想用Tomcat替代jFinal中自带的Jetty服务器，你需要将jetty-server的包依赖去除。

### Database 数据库

Not uploaded yet.

暂未上传。

## JFinal Web Framework

- https://github.com/jfinal/jfinal (Simplified Chinese 简体中文)
- www.JFinal.com (Simplified Chinese 简体中文)
