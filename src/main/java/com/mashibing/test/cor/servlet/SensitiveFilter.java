package com.mashibing.test.cor.servlet;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:34
 **/
public class SensitiveFilter implements Filter {

    @Override
    public Boolean doFilter(Request req,Response resp,FilterChain chain) {
        String str = req.getReq().replace("sb", "s13");
        req.setReq(str);
        chain.doFilter(req, resp, chain);
        str = resp.getResp().replace("sb", "nc");
        resp.setResp(str);
        return true;
    }
}
