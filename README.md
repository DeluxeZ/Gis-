# kurumi
## GIS后端项目
### version 1.0
搭建了基础框架，连接了MySQL数据库，实现了实体名为UserInfo的测试，通过postman进行请求。

并添加了代码生成器，通过generator从数据库生成dao层，mapper的xml，model。
### version 2.0 (2019-10-21)
添加了police_info, case_info, district_info三个实体类，从各层进行了完善，并实现了各表的按主键查询。

### version 2.1 (2019-10-23)
在user_info方法类中实现了insert与delete语句，语句内容与返回值过程原理与原来的select有所区别。
