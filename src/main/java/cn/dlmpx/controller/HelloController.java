package cn.dlmpx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: jinkens-test
 * @package: cn.dlmpx.controller
 * @className: HelloController
 * @author: dlmpx
 * @description: TODO
 * @date: 2024/1/26 15:12
 * @version: 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Welcome Jenkins!";
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello Jenkins!";
    }
}
