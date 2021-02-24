package com.mashibing.test.cor.servlet;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/19 9:05
 **/
public class StringFilter implements Filter {


    @Override
    public Boolean doFilter(Request req, Response resp, FilterChain chain) {
        String str = req.getReq().replace("这是", "this");
        req.setReq(str);
        chain.doFilter(req, resp, chain);
        str = resp.getResp().replace("这是", "this is");
        resp.setResp(str);
        return true;
    }
}
