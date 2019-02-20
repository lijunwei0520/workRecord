package com.exampl.proxy.demo.dynamic.JDKProxy;

import com.exampl.proxy.demo.staticProxy.MrLi;
import com.exampl.proxy.demo.staticProxy.Person;

/**
 * @Auther: ljw
 * @Date: 2019/2/20 15:23
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Person person = (Person) new JDKProxy().getInstance(new MrLi());
        //注意这里的person不是目标类person，而是代理类person：debug的时候显示null，有'$'标识符
        person.doWork();
    }
}
