package com.mashibing.test.cor;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:49
 **/
public class URLFilter implements Filter {


    @Override
    public Boolean doFilter(Msg msg) {
        String str = msg.getMsg().replace("taiyang.com", "http://www.taiyang.com");
        msg.setMsg(str);
        return true;
    }
}
