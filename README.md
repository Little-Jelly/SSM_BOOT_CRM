需要解决两个问题：
jstl的自定义标签怎么用？
——在costomer.jsp中，使用自定义标签有问题

事务管理怎用？
——没有理解到位。

如何使用EL表达式？
——没有使用过
EL表达式用来取值，${}


熟悉使用jsp

如果重构前端：时间车成本略高，所以考虑后面再重构

提交用户查询时遇到错误信息，无法访问controller：
“Request processing failed; nested exception is java.lang.ClassCastException: 
class java.lang.String cannot be cast to class com.yyf.po.User 
(java.lang.String is in module java.base of loader 'bootstrap';
 com.yyf.po.User is in unnamed module of loader org.apache.catalina.loader.ParallelWebappClassLoader @4da549ca)”
 问题已经解决：
 是登录之后，加入到Session的内容有错误，应该是User对象，而加入的是一个字符串，改正即可。