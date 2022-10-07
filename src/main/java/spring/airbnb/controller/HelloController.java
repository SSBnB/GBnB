package spring.airbnb.controller;


import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = {"1. hello"})
@Controller
public class HelloController {

    @Operation(summary = "api 기능", description = "api 설명")
    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
