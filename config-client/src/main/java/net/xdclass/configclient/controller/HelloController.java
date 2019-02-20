package net.xdclass.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${neo.hello}")
    private String hello;

    @Value("${neo.mysql}")
    private String mysql;

    @GetMapping("/hello")
    public String hello() {
        return this.hello;
    }

    @GetMapping("/mysql")
    public String mysql() {
        return this.mysql;
    }
}
