package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangmb
 * @version 1.0.0
 * @date 2021/1/29 1:40
 */
@RestController
@Slf4j
public class TestControl {
    @RequestMapping("/test/{name}")
    public String test(@PathVariable(value = "name") String name) {
        log.debug("debug 日志测试");
        log.error("error 日志测试");
        log.info("info日志测试");
        // 测试
        // 测试
        // 测试
        // 测试
         return "SUCCESS";
    }
}
