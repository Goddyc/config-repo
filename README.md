# config-repo
更新配置文件后需要手动触发refresh

management.endpoints.web.exposure.include=refresh(要在客户端的application.properties中配置，否则/actuator/refresh 404 ，无法进行手动更新)
手动更新地址为/actuator/refresh
