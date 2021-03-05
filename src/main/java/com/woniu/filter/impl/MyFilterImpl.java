package com.woniu.filter.impl;

import com.woniu.filter.MyFilter;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect    //表示是切面类
public class MyFilterImpl implements MyFilter {

    //切入点注解，以及切点表达式
    @Pointcut("execution(* com.woniu.service.impl.*.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("事务开启");
    }

    @AfterReturning("pointCut()")
    public void returns() {
        System.out.println("事务提交");
    }

    @AfterThrowing("pointCut()")
    public void exception() {
        System.out.println("事务回滚");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("释放资源");
    }
}
