package com.mashibing.test.cor;

import java.lang.reflect.Proxy;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:39
 **/
public class Main {

    public static void main(String[] args) {
        String str = "大家好：taiyang.com  <script> 这是一段黑客代码☺<script> 哪个sb写的？";
        Msg msg = new Msg(str);
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter())
                .add(new SensitiveFilter());
//                .add(new FaceFilter())
//                .add(new URLFilter());

        FilterChain fc2 = new FilterChain();
        fc2.add(new FaceFilter())
                .add(new URLFilter());
        fc2.doFilter(msg);
        filterChain.add(fc2);

        filterChain.doFilter(msg);
        System.out.println(msg.getMsg());
    }
}
