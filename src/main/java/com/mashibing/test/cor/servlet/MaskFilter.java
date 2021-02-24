package com.mashibing.test.cor.servlet;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/19 14:09
 **/
public class MaskFilter implements Filter {
    @Override
    public Boolean doFilter(Request req, Response resp, FilterChain chain) {
        String str = req.getReq().replace("0009", "0000");
        req.setReq(str);
        chain.doFilter(req, resp, chain);
        str = resp.getResp().replace("0009", "1111");
        resp.setResp(str);
        return true;
    }
}
