package com.mashibing.test.cor;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:44
 **/
public class Msg {

    String msg;

    public Msg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
