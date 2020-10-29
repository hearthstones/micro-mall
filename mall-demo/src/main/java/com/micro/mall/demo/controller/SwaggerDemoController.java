package com.micro.mall.demo.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luchao
 * @description SwaggerDemoController
 * @since 2020/10/29 17:53:39
 */
@Api(tags = "SwaggerDemoController")
@RestController
public class SwaggerDemoController {

    @ApiOperation(value = "输出传递的消息", notes = "RPC调用")
    @ApiImplicitParam(name = "message", value = "消息", required = true, paramType = "path")
    @ApiResponses({
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "服务器问题（随便写的）")
    })
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return "[swagger demo message]: " + message;
    }
}
