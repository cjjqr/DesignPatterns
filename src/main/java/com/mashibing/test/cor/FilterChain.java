package com.mashibing.test.cor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhoutaiyang
 * @Date: 2021/2/15 11:35
 **/
public class FilterChain implements Filter {

    List<Filter> filterList = new ArrayList<>();

    public FilterChain add(Filter filter){
        filterList.add(filter);
        return this;
    }

    public Boolean doFilter(Msg msg){
        for (Filter filter : filterList) {
            if (!filter.doFilter(msg)){
                return false;
            }
        }
        return true;
    }
}
