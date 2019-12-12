package net.ys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: NMY
 * Date: 2019-12-12
 * Time: 18:05
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "hello";
    }
}
