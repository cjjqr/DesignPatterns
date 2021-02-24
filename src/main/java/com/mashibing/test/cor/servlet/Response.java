package com.mashibing.test.cor.servlet;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 20:28
 **/
public class Response {

    private String resp;

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    @Override
    public String toString() {
        return "Response{" +
                "resp='" + resp + '\'' +
                '}';
    }
}
