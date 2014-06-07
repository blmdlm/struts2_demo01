struts2_demo01
==============

a simple struts2 project

1.一个使用struts2框架技术的简单的登录系统

2.在web.xml中配置核心控制器FilterDispatcher

3.编写视图组件（jsp页面）

4.编写登录页面对应的业务逻辑组件javaBean

5.编写业务控制器Action

6.在struts.xml中配置Action

7.部署、运行

======================

个人遇到的一些问题：

1.struts.xml开头报错，加入<include file="struts-default.xml"></include>解决

2.本人采用的是eclipse+tomcat构建的该程序，运行报错，找不到过滤器

所有要求的包都已经导入，web.xml也已经配置，最后发现是在WEB-INF/lib下建立了子文件夹，tomcat不能将这些子文件夹中的包导入，所以
不要使用子文件夹就解决了
