package com.shl.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author songhengliang
 * @date 2019/11/19
 */
@ConfigurationProperties(prefix = "hello.starter")
public class HelloProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
