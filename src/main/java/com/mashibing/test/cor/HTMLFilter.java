package com.mashibing.test.cor;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:30
 **/
public class HTMLFilter implements Filter {


    @Override
    public Boolean doFilter(Msg msg) {
        String str = msg.getMsg().replaceAll("<", "[").replaceAll(">", "]");
        msg.setMsg(str);
        return true;
    }
}
