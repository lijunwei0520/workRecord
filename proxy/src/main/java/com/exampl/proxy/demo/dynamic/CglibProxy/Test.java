package com.exampl.proxy.demo.dynamic.CglibProxy;

import com.exampl.proxy.demo.staticProxy.MrLi;
import com.exampl.proxy.demo.staticProxy.Person;

/**
 * @Auther: ljw
 * @Date: 2019/2/20 15:33
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        Person person = (Person) new CglibProxy().getInstance(new MrLi());
        person.doWork();
    }
}
