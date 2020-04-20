# 宠物分享平台的社区部分

## 技术栈
1. 后端
    - 后端主要使用SpringBoot2.2 + Mybatis构建基础后端服务 
2. 缓存
    - 缓存部分主要使用Redis做存储方案
    - 另外社区中的点赞、关注功能等也均使用Redis实现
3. 消息队列
    - 消息队列部分主要使用Kafka
4. 搜索引擎
    - 搜索引擎上选择了ElasticSearch代替MySQL做模糊关键字匹配
    
5. 前端页面
    - 主要是由thymeleaf实现
    - 后续可往React等前端框架迁移