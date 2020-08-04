package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    /**
     * 启动
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}
