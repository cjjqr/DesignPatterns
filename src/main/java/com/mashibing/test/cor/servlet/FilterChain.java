package com.mashibing.test.cor.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:35
 **/
public class FilterChain implements Filter {

    List<Filter> filterList = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter filter){
        filterList.add(filter);
        return this;
    }

    public Boolean doFilter(Request req,Response resp,FilterChain chain){
        if (index == filterList.size()) return false;
        Filter f = filterList.get(index);
        index++;
        return f.doFilter(req, resp, this);
    }
}
