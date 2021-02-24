package com.mashibing.test.cor;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:34
 **/
public class SensitiveFilter implements Filter {

    @Override
    public Boolean doFilter(Msg msg) {
        String str = msg.getMsg().replace("sb", "s13");
        msg.setMsg(str);
        return true;
    }
}
