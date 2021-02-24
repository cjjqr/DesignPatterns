package com.mashibing.test.cor.servlet;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 20:29
 **/
public class Request {

    private String req;

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    @Override
    public String toString() {
        return "Request{" +
                "req='" + req + '\'' +
                '}';
    }
}
