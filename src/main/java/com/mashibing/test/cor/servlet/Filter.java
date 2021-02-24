package com.mashibing.test.cor.servlet;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:29
 **/
public interface Filter {

    Boolean doFilter(Request req,Response resp,FilterChain chain);
}
