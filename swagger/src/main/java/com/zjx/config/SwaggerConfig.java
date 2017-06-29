package com.zjx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket userApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("用户")
                .select()  // 选择那些路径和api会生成document
                .apis(RequestHandlerSelectors.basePackage("com.zjx.controller"))
                .paths(PathSelectors.any()) // 对所有路径进行监控
                .build()
                .apiInfo(userInfo());
    }



    private ApiInfo userInfo() {
        ApiInfo apiInfo = new ApiInfo("用户相关接口",//大标题
                "用户有关的接口，包括增加删除用户",//小标题
                "0.1",//版本
                "成都",
                new Contact("zjx", "", ""),// 作者
                "swagger url",//链接显示文字
                ""//网站链接
        );
        return apiInfo;
    }

}
