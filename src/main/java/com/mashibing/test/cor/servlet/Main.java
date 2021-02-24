package com.mashibing.test.cor.servlet;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:39
 **/
public class Main {

    public static void main(String[] args) {
        String str = "大家好：taiyang.com  <script> 这是一段黑客代码 17700090001☺<script> 哪个sb写的？";
        Response response = new Response();
        response.setResp(str);
        Request request = new Request();
        request.setReq(str);
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter())
                .add(new SensitiveFilter())
                .add(new FaceFilter())
                .add(new URLFilter());

        filterChain.doFilter(request,response,filterChain);
        System.out.println(request.getReq());
        System.out.println(response.getResp());
    }
}
