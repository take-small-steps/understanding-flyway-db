# Flyway

DB 히스토리를 관리하기 위한 수단으로 사용된다.

최신버전의 Flyway는 무조건 최신의 DB만 지원한다.

그러므로, 과거 버전의 Flyway 을 사용해야 한다.

```groovy
implementation 'org.flywaydb:flyway-core:7.15.0'
implementation 'org.flywaydb:flyway-mysql:9.15.0'
implementation 'com.mysql:mysql-connector-j:8.0.32'
```

7.15.0 이상의 버전에서는 MySQL 5.6을 지원하지 않는다.

https://flywaydb.org/

https://github.com/flyway/flyway/releases?q=7.15&expanded=true
