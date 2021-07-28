package com.atguigu.maven;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestHello {
    @Test
    public void testHello() {
        String name = "atguigu";
        Hello hello = new Hello();
        String resule = hello.sayHello(name);
        assertEquals("Hello atguigu!", resule);
        String s = "test测试撒地方看见了撒旦JFK";
        System.out.println(s);
        System.out.println("test");


    }
}
