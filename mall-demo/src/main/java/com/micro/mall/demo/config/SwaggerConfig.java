package com.micro.mall.demo.config;


import com.micro.mall.common.config.BaseSwaggerConfig;
import com.micro.mall.common.properties.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.micro.mall.demo.controller")
                .title("mall-demo")
                .description("SpringCloud版本中的一些示例")
                .contactName("micro")
                .version("0.0.1")
                .enableSecurity(true)
                .build();
    }

}
