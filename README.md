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
 
 增加一个文件上传下载的功能
 所以导航栏中的功能还有待实现：2020年3月1日
   1. 文件上传和下载（前端对于我来说有点困难）
   2. 邮件：需要明确角色的分配，和发送邮件的入口，以及阅读邮件的页面（又是前端）
   3. 任务和完成度：创建任务的接口，是否需要上下级之间的任务分配
   4. 消息：发送消息的入口，详细阅读消息的页面（前端）》》》：
   5. 系统测试（配置）退出登录
 
 
 这些功能先暂停一下，我要花4天时间补充一下前端的知识，从2020年3月3日，开始commit ForeEnd_Base repository.
 
 使用了7天的时间（2020年3月3日-2020年3月9日）研究了一下《JQuery高级编程》，并将对应的实例代码放置到Repo：https://github.com/Little-Jelly/ForeEnd_Base中
 
 从现在开始（2002年3月10日）继续进行CRM的学习、研究，事例的完善。
 
 完成了文件上传的Controller
 
 
 
 