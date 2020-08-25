package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "TestController", description = "Testing REST API documentation.")
@RestController
public class TestController {
    @ApiOperation(value = "Get a test response.", response = ResponseClass.class, tags = "Testing")
    @GetMapping("/api/testout")
    public ResponseClass getTestout() {
        return new ResponseClass("ok");
    }
}