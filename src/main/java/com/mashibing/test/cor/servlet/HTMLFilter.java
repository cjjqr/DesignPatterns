package com.mashibing.test.cor.servlet;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:30
 **/
public class HTMLFilter implements Filter {


    @Override
    public Boolean doFilter(Request req,Response resp,FilterChain chain) {
        String str = req.getReq().replaceAll("<", "[").replaceAll(">", "]");
        req.setReq(str);
        chain.doFilter(req, resp, chain);
        str = resp.getResp().replaceAll("<", "(").replaceAll(">", ")");
        resp.setResp(str);
        return true;
    }
}
