[TOC]



# java_web_book

用java_web写的书城项目

视频来源：https://www.bilibili.com/video/BV1Y7411K7zz?from=search&seid=7532834575613313460

## 1.书城的三层架构
- 数据访问层
  
   Dao：采用面向接口编程的思想，定义操作数据库的接口，如对数据库进行增删改查，先创建接口，再实现类，供service层调用
   
   数据库：创建 t_book, t_order, t_order_item, t_user表
   
   | ![t_book](https://github.com/xyming108/java_web_book/blob/master/t_book.png) |
   | ------------------------------------------------------------ |
   | ![t_orde](https://github.com/xyming108/java_web_book/blob/master/t_order.png) |
   | ![t_order_item](https://github.com/xyming108/java_web_book/blob/master/t_order_item.png) |
   | ![t_user](https://github.com/xyming108/java_web_book/blob/master/t_user.png) |
   
- 业务逻辑层
   Service：调用数据访问层处理业务逻辑，采用面向接口编程的思想，先定义接口，再创建实现类

- 表现层
   HTML、jsp、javascript... ：显示页面，比如登录注册

   Servlet...：调用业务逻辑层处理用户请求，显示处理结果，如检测用户账号是否存在，如果存在则重定向到登录成功页面，如果不存在则转发到登录页面

