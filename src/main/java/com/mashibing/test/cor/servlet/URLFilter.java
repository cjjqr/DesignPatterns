package com.mashibing.test.cor.servlet;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:49
 **/
public class URLFilter implements Filter {


    @Override
    public Boolean doFilter(Request req,Response resp,FilterChain chain) {
        String str = req.getReq().replace("taiyang.com", "http://www.taiyang.com");
        req.setReq(str);
        chain.doFilter(req, resp, chain);
        str = resp.getResp().replace("taiyang.com", "https://www.taiyang.com");
        resp.setResp(str);
        return true;
    }
}
