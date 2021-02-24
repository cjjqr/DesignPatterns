package com.mashibing.test.cor;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:48
 **/
public class FaceFilter implements Filter {
    @Override
    public Boolean doFilter(Msg msg) {
        String str = msg.getMsg().replace("☺", "^v^");
        msg.setMsg(str);
        return true;
    }
}
