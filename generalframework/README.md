####睿图java通用框架
睿图java通用框架，以springboot2.0.6+mybatisplus+pageHelper作为基础集成框架和数据查询框架，集成rt自封装库和第三方
其他类库，最终集成而来，期间付出了不少心血和实践，希望大家认真研究,熟极而流。
> 启动
1. 大家初次启动，大家导入工程，jdk要求使用公司统一的jdk8版本；
2. 使用统一的maven仓库，仓库地址见公司统一版本的maven；
3. 修改数据库链接，运行demo时，由于集成了liquibase，初次运行会在数据库自动创建dict_org和dict_dept表;如不想生成表，可在配置文件关闭，spring.liquibase.enabled: false；
> 注意事项
1. 实体
- entity实体必须和数据字段一致；
- dto继承entity;
2. mapper层
- 通过代码生成器生成，单表增删改查无需写sql,复杂查询需要自定sql
3. service层
- 如代码所示,当当前实体为数据库映射类的service，而非纯逻辑service时，需要实现IBaseService,并实现
insertSelective,deleteByPrimaryKey,updateByPrimaryKeySelective,selectByPrimaryKey,getList,getListAll
- 分页方式利用pageHelper插件实现，详情看service getPageList方法
4. web层(controller) 
- 接口文档统一通过showdoc生成
- 结合公司规范，学会使用controller层常用参数校验，参数加密，系统日志，用户行为日志等注解的使用。
5. 配置文件
- 日志配置：服务日志目录统一/logs/+项目名，日志配置文件logback-spring.xml中
- yml文件配置：application.yml文件存放的是极少修改或不修改的内容，经常需要修改的内容放入application-dev/prod/test.yml中
- pom文件中，jar包排列一般顺序：com.rt的jar坐标放在最前面，其次数据连接驱动、spring相关包、第三方其他包
