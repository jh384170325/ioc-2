package com.woniu.filter;

public interface MyFilter {
    void before();

    void returns();

    void exception();

    void after();
}
