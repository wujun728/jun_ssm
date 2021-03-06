


![active4j](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/logo.png "active4j")


Active4j-Boot是基于SpingBoot2.0轻量级的java快速开发框架。以Spring Framework为核心容器，Spring MVC为模型视图控制器，Mybatis Plus为数据访问层， Apache Shiro为权限授权层, Redis为分布式缓存，Quartz为分布式集群调度，beetl为模版引擎，layui作为前端框架的开源框架。



------------

# 项目介绍
 - Active4j-Boot是基于SpingBoot2.0轻量级的java快速开发框架。以Spring Framework为核心容器，Spring MVC为模型视图控制器，Mybatis Plus为数据访问层， Apache Shiro为权限授权层, Redis为分布式缓存，Quartz为分布式集群调度，beetl为模版引擎，layui作为前端框架的开源框架。
 - Active4j-Boot目前内置了部门管理、用户管理、角色管理、菜单管理、数据数据字典、定时任务、常用系统监控等基础功能，并内置了文件上传下载、导入导出、微信支付、支付宝支付、短信功能、邮件发送等常用工具，整合了layui前端常用组件。
 - Active4j-Boot定位于企业快速开发平台建设，代码全部开源，持续更新，共同维护。Active4j可以应用在任何J2EE的项目开发中，尤其适合企业信息管理系统（MIS），企业办公系统（OA），客户关系管理系统（CRM），内容管理系统（CMS）等。

# 技术文档
- 讨论加群：qq群①：203802692   qq群②：773872959
- 演示地址：[http://www.active4j.com:9001/boot](http://www.active4j.com:9001/boot "http://www.active4j.com:9001/boot")
- 官方网站：[www.active4j.com](http://www.active4j.com "www.active4j.com")
- 文档地址：[http://www.active4j.com/doc.html](http://www.active4j.com/doc.html "http://www.active4j.com/doc.html")

# 生态系统
|  版本 |  地址 |
| ------------ | ------------ |
|  前后端分离版本github |  [https://github.com/yunchaoyun/active4j](https://github.com/yunchaoyun/active4j "https://github.com/yunchaoyun/active4j") |
| 前后端分离版本gitee  |  [https://gitee.com/active4j/active4j](https://gitee.com/active4j/active4j "https://gitee.com/active4j/active4j") |
|  boot单体版本github | [https://github.com/yunchaoyun/active4j-boot](https://github.com/yunchaoyun/active4j-boot "https://github.com/yunchaoyun/active4j-boot")  |
| boot单体版本gitee  | [https://gitee.com/active4j/active4j-boot](https://gitee.com/active4j/active4j-boot "https://gitee.com/active4j/active4j-boot") |
|jsp版本github|[https://github.com/yunchaoyun/active4j-jsp](https://github.com/yunchaoyun/active4j-jsp "https://github.com/yunchaoyun/active4j-jsp")|
|jsp版本gitee|[https://gitee.com/active4j/active4j-jsp](https://gitee.com/active4j/active4j-jsp "https://gitee.com/active4j/active4j-jsp")|
| 工作流版本github | [https://github.com/yunchaoyun/active4j-flow](https://github.com/yunchaoyun/active4j-flow "https://github.com/yunchaoyun/active4j-flow") |
| 工作流版本gitee | [https://gitee.com/active4j/active4j-flow](https://gitee.com/active4j/active4j-flow "https://gitee.com/active4j/active4j-flow")|
| OA办公系统github|[https://github.com/yunchaoyun/active4j-oa](https://github.com/yunchaoyun/active4j-oa "https://github.com/yunchaoyun/active4j-oa")|
|OA办公系统gitee|[https://gitee.com/active4j/active4j-oa](https://gitee.com/active4j/active4j-oa "https://gitee.com/active4j/active4j-oa")|

# 案例展示
买我 小程序
![买我小程序](https://zh-card-1251505225.cos.ap-shanghai.myqcloud.com/%E4%B9%B0%E6%88%91%E5%B0%8F%E7%A8%8B%E5%BA%8F.jpg "买我小程序")
买我 ios版
<img src="https://zh-card-1251505225.cos.ap-shanghai.myqcloud.com/IOS%E7%9B%B4%E5%85%85%E4%BA%8C%E7%BB%B4%E7%A0%81.png" width=256 height=256 />

# 项目特点
- 开箱即用，节省开发时间，提高开发效率
- 代码全部开源，持续更新，共同维护
- 基于SpringBoot，简化了大量项目配置和maven依赖，让您更专注于业务开发
- 使用分层设计，分为dao，service，Controller，view层，层次清楚，低耦合，高内聚
- 友好的代码结构及注释，便于阅读及二次开发
- 支持分布式部署，session集成了redis
- 灵活的权限控制, 整合shiro，可控制到页面或按钮，满足绝大部分的权限需求,优化权限注解方便权限配置
- 日志记录采用aop(LogAop类)方式，可对用户所有操作进行记录
- 引入quartz定时任务，可动态完成任务的添加、修改、删除、暂停、恢复及日志查看等功能
- 数据统计报表：丰富的报表统计功能
- 集成积木报表。jimureport
- 利用beetl模板引擎对前台页面进行封装和拆分，使代码变得简洁，更加易维护
- 前端组件丰富，集成layuiadmin，基本涵盖了所有前端开发需求
- 前端页面简洁优美，支持移动端
- 支持多种浏览器: Google, 火狐, IE,360等

# 组织结构

     com.zhonghe.active4j
        •	com.zhonghe.active4j.common -- 通用代码
        •	com.zhonghe.active4j.core -- 核心功能（redis、线程池、缓存、shiro等）
        •	com.zhonghe.active4j.demo -- 示例
        •	com.zhonghe.active4j.func -- 常用功能
        •	com.zhonghe.active4j.func.captcha -- 验证码
        •	com.zhonghe.active4j.func.email -- 邮件发送
        •	com.zhonghe.active4j.func.export -- 导入导出
        •	com.zhonghe.active4j.func.layedit -- 富文本编辑器
        •	com.zhonghe.active4j.func.message -- 系统消息
        •	com.zhonghe.active4j.func.pay -- 支付功能
        •	com.zhonghe.active4j.func.report -- 集成积木报表
        •	com.zhonghe.active4j.func.sms -- 短信发送
        •	com.zhonghe.active4j.func.timer -- 定时任务
        •	com.zhonghe.active4j.func.upload -- 上传下载
        •	com.zhonghe.active4j.monitor -- 系统监控/在线用户
        •	com.zhonghe.active4j.system -- 系统管理

# 技术选型
### 服务端
| 技术 | 说明 | 官网  |
| ------------ | ------------ | ------------ |
|Spring Boot2|核心框架|[https://spring.io/projects/spring-boot/](https://spring.io/projects/spring-boot/ "https://spring.io/projects/spring-boot/")|
|Spring MVC|视图框架|[http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#mvc](http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#mvc "http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#mvc")|
|Apache Shiro|权限框架|[http://shiro.apache.org/](http://shiro.apache.org/ "http://shiro.apache.org/")|
|MyBatis|持久层框架|[http://www.mybatis.org/mybatis-3/zh/index.html](http://www.mybatis.org/mybatis-3/zh/index.html "http://www.mybatis.org/mybatis-3/zh/index.html")|
|MyBatis-Plus|MyBatis增强工具|[https://mp.baomidou.com/](https://mp.baomidou.com/ "https://mp.baomidou.com/")|
|Alibaba Druid|数据库连接池|[https://github.com/alibaba/druid](https://github.com/alibaba/druid "https://github.com/alibaba/druid")|
|Redis|分布式缓存数据库|[https://redis.io/](https://redis.io/ "https://redis.io/")|
|Quartz|作业调度框架|[http://www.quartz-scheduler.org/](http://www.quartz-scheduler.org/ "http://www.quartz-scheduler.org/")|
|ActiveMQ|消息队列|[http://activemq.apache.org/](http://activemq.apache.org/ "http://activemq.apache.org/")|
|SLF4J|日志组件|[http://www.slf4j.org/](http://www.slf4j.org/ "http://www.slf4j.org/")|
|QcloudCOS|腾讯云存储|[https://www.qcloud.com/product/cos](https://www.qcloud.com/product/cos "https://www.qcloud.com/product/cos")|
|Maven|项目构建管理|[http://maven.apache.org/](http://maven.apache.org/ "http://maven.apache.org/")|
|Beetl|模版引擎|[http://ibeetl.com/](http://ibeetl.com/ "http://ibeetl.com/")|
|Apache Commons|工具类|[http://commons.apache.org/](http://commons.apache.org/ "http://commons.apache.org/")|
|fastjson|JSON解析库|[https://github.com/alibaba/fastjson](https://github.com/alibaba/fastjson "https://github.com/alibaba/fastjson")|
### 前端
|技术|名称|官网|
| ------------ | ------------ | ------------ |
|jQuery|js库|[http://jquery.com/](http://jquery.com/ "http://jquery.com/")|
|layui.table|数据表格|[https://www.layui.com/doc/modules/table.html](https://www.layui.com/doc/modules/table.html "https://www.layui.com/doc/modules/table.html")|
|bootstrap-treeview|树形结构|[http://www.treejs.cn/v3/](http://www.treejs.cn/v3/ "http://www.treejs.cn/v3/")|
|layui|前端框架|[https://www.layui.com/](https://www.layui.com/ "https://www.layui.com/")|
|layui.layer|弹出组件|[https://www.layui.com/doc/modules/layer.html](https://www.layui.com/doc/modules/layer.html "https://www.layui.com/doc/modules/layer.html")|
|layui.treeTable|树形表格|[https://fly.layui.com/jie/30625/](https://fly.layui.com/jie/30625/ "https://fly.layui.com/jie/30625/")|

# 功能列表
```html
- 项目主页：介绍项目简介、技术介绍、更新日志等信息
    ○ 示例主页一
    ○ 示例主页二
    ○ 示例主页三
- 系统管理
    ○ 用户管理：用于管理后台系统的用户，可进行增删改查等操作
    ○ 部门管理：通过不同的部门来管理和区分用户
    ○ 菜单管理：维护系统菜单，操作权限，按钮权限
    ○ 角色管理：维护系统角色信息，以角色为单位分配系统权限
    ○ 数据字段管理：对系统中经常使用的一些较为固定的数据进行维护，如：是否、男女、类别、级别等
    ○ 日志管理：系统正常操作日志记录和查询；系统异常信息日志记录和查询
- 系统监控
    ○ Druid连接池监控：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈
    ○ 服务器监控：显示服务器内存信息、CPU信息、磁盘信息、JVM信息等性能指标
    ○ 在线用户列表：显示在线用户信息
- 常用功能
    ○ 邮件发送：集成邮件发送功能，富文本编辑器支持，发送普通文本，HTML文本等
    ○ 微信支付：集成微信native支付功能
    ○ 支付宝支付：集成支付宝网站二维码支付功能
    ○ 报表插件：集成JimuReport,积木报表
    ○ 短信服务
        •阿里云短信：集成阿里云短信SDK
        •腾讯云短信：集成腾讯云短信SDK
        •云潮云短信：集成云潮云短信SDK
    ○ 定时任务：支持注解配置定时任务，支持动态维护定时任务，引入Quartz分布式定时调度
    ○ 富文本编辑器：集成layui社区的layedit、kz.layedit、tinymce编辑器
    ○ 上传下载：集成普通文件上传、图片上传、多文件上传、拖动上传、腾讯云COS存储等功能
    ○ 导入导出：引入POI工具，整合excel等导入导出功能
    ○ 系统消息：支持发送系统消息
    ○ 验证码：集成google验证码插件，支持算术验证码、动态验证码
- 前端实例组件
    ○ 格栅
    ○ 按钮
    ○ 表单
    ○ 导航
    ○ 选项卡
    ○ 进度条
    ○ 面板
    ○ 徽章
    ○ 时间线
    ○ 动画
    ○ 辅助
    ○ 通用弹出层
    ○ 上传
    ○ 时间日期
    ○ 数据表格
    ○ 分页
    ○ 滑块
    ○ 评分
    ○ 轮播
    ○ 流加载
    ○ 工具
    ○ 代码修饰
    ○ 颜色选择器
```

# 更新日志
## 2020-3-12 active4jboot版本发布
# 版权声明
Active4j使用 MIT License 协议.

# 演示截图
![active4j-boot-01](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-1.png "active4j-boot-01")![active4j-boot-02](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-2.png "active4j-boot-02")![active4j-boot-03](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-3.png "active4j-boot-03")![active4j-boot-04](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-4.png "active4j-boot-04")![active4j-boot-05](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-5.png "active4j-boot-05")![active4j-boot-06](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-6.png "active4j-boot-06")![active4j-boot-07](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-7.png "active4j-boot-07")![active4j-boot-08](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-8.png "active4j-boot-08")![active4j-boot-09](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-9.png "active4j-boot-09")![active4j-boot-10](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-10.png "active4j-boot-10")![active4j-boot-11](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-11.png "active4j-boot-11")![active4j-boot-12](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-12.png "active4j-boot-12")![active4j-boot-13](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-13.png "active4j-boot-13")![active4j-boot-14](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-14.png "active4j-boot-14")![active4j-boot-15](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-15.png "active4j-boot-15")![active4j-boot-16](https://zh-active4j-1251505225.cos.ap-shanghai.myqcloud.com/active4jboot/boot-16.png "active4j-boot-16")