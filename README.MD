#springboot日志配置
####1.日志级别ERROR, WARN, INFO, DEBUG, or TRACE
####2.项目启动时候指定日志级别java -jar myapp.jar --debug
####3.指定日志名称和存放路径：logging.file=/data/log/db-set.log
####4.指定某个目录下的日志级别
logging:
  level:
    root: info
    org.springframework.web: debug
    org.hibernate=error
这些配置等同于logback xml中
<root level="INFO" />
<logger name="org.springframework.web" level="DEBUG"/>
<logger name="org.hibernate" level="DEBUG"/>
