package com.shl.spring.boot.autoconfigure;

/**
 * @author songhengliang
 * @date 2019/11/19
 */
public class HelloService {
    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String helloStarter(){
        return helloProperties.getName();
    }
}
