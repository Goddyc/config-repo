# config-repo
更新git上配置文件内容后需要手动触发client客户端的refresh进行更新

management.endpoints.web.exposure.include=refresh(要在客户端的application.properties中配置，否则/actuator/refresh 404 ，无法进行手动更新)
手动更新地址为/actuator/refresh
