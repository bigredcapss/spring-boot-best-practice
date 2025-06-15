# Spring Boot 最佳实践项目

<div align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.5.x-brightgreen" alt="Spring Boot Version"/>
  <img src="https://img.shields.io/badge/Java-8+-blue" alt="Java Version"/>
  <img src="https://img.shields.io/badge/License-MIT-green" alt="License"/>
</div>

## 📖 项目介绍
本项目是一个基于 Spring Boot 3.5.x 的企业级应用开发最佳实践集合，旨在帮助开发者快速掌握 Spring Boot 在企业级开发中的各种实用技术和最佳实践。通过本项目的学习，你将能够掌握 Spring Boot 在企业级应用开发中的核心技能和常用工具的使用方法。

## 🎯 为什么要学习本项目？
1. **企业级开发必备技能**：项目涵盖了企业级开发中最常用的技术组件和工具
2. **最佳实践指导**：每个模块都包含了实际开发中的最佳实践和常见问题解决方案
3. **完整的示例代码**：提供可直接运行的示例代码，便于学习和实践
4. **技术栈全面**：覆盖了从数据访问、缓存、消息队列到性能优化等多个方面
5. **持续更新**：项目会持续更新，保持与最新技术趋势同步

## 🛠️ 技术栈
- **核心框架**：Spring Boot 3.5.x
- **数据访问**：Spring Data JPA, MyBatis-Plus
- **缓存方案**：Redis, Caffeine, EhCache
- **消息队列**：Kafka, RocketMQ
- **搜索引擎**：Elasticsearch
- **工具库**：Guava, MapStruct, HttpClient
- **批处理**：Spring Batch
- **容错机制**：Resilience4j, Spring Retry
- **分布式任务**：XXL-Job
- **数据库中间件**：ShardingSphere
- **大数据存储**：HBase, ClickHouse

## 📦 项目模块说明

### 1. 数据访问层
- **spring-boot-jpa**: Spring Data JPA 的最佳实践，包含复杂查询、事务管理等
- **spring-boot-mybatis**: MyBatis 的基础使用和最佳实践
- **spring-boot-mybatis-plus**: MyBatis-Plus 的高级特性和最佳实践
- **spring-boot-mapstruct**: 对象映射工具的使用，提高开发效率

### 2. 缓存解决方案
- **spring-boot-redis**: Redis 分布式缓存的使用和最佳实践
- **spring-boot-caffeine**: 本地缓存的使用场景和性能优化
- **spring-boot-ehcache**: 企业级缓存框架的应用

### 3. 消息队列
- **spring-boot-kafka**: Kafka 消息队列的使用，包含生产者和消费者的最佳实践
- **spring-boot-rocketmq**: RocketMQ 消息队列的集成和使用

### 4. 搜索服务
- **spring-boot-elasticsearch**: Elasticsearch 搜索引擎的集成和使用

### 5. 工具类库
- **spring-boot-guava**: Google Guava 工具库的常用功能
- **spring-boot-httpclient**: HTTP 客户端的封装和使用
- **spring-boot-emoji**: Emoji 表情处理工具

### 6. 批处理
- **spring-boot-batch**: Spring Batch 批处理框架的使用

### 7. 容错和重试
- **spring-boot-resilience4j**: 服务容错和重试机制
- **spring-boot-retry**: Spring Retry 的使用

### 8. 分布式解决方案
- **spring-boot-xxl-job**: 分布式任务调度平台
- **spring-boot-sharding-sphere**: 数据库分库分表解决方案
- **spring-boot-hbase**: HBase 大数据存储
- **spring-boot-clickhouse**: ClickHouse 列式数据库

## 🚀 快速开始

### 环境要求
- JDK 8+
- Maven 3.6+
- IDE (推荐使用 IntelliJ IDEA)

### 运行步骤
1. 克隆项目到本地
```bash
git clone https://github.com/yourusername/spring-boot-best-practice.git
```

2. 进入项目目录
```bash
cd spring-boot-best-practice
```

3. 编译项目
```bash
mvn clean install
```

4. 进入具体模块目录运行示例
```bash
cd spring-boot-xxx
mvn spring-boot:run
```

## 📚 学习建议
1. 按照模块顺序逐步学习
2. 动手实践每个示例
3. 查看代码注释和文档
4. 尝试修改和扩展示例代码
5. 参考官方文档深入学习

## 🤝 参与贡献
1. Fork 本仓库
2. 创建新的分支 (`git checkout -b feature/your-feature`)
3. 提交你的修改 (`git commit -am 'Add some feature'`)
4. 推送到分支 (`git push origin feature/your-feature`)
5. 提交 Pull Request

## 📄 许可证
本项目采用 MIT 许可证，详见 [LICENSE](LICENSE) 文件。

## 📞 联系方式
如有问题或建议，欢迎提交 Issue 或 Pull Request。

## ⭐ 项目 Star 趋势
[![Stargazers over time](https://starchart.cc/yourusername/spring-boot-best-practice.svg)](https://starchart.cc/yourusername/spring-boot-best-practice)



