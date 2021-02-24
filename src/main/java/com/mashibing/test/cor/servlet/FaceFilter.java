package com.mashibing.test.cor.servlet;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:48
 **/
public class FaceFilter implements Filter {
    @Override
    public Boolean doFilter(Request req,Response resp,FilterChain chain) {
        String str = req.getReq().replace("☺", "^v^");
        req.setReq(str);
        chain.doFilter(req, resp, chain);
        String str1 = resp.getResp().replace("☺", "o(╥﹏╥)o");
        resp.setResp(str1);
        return true;
    }
}
