package com.exampl.proxy.demo.dynamic.JDKProxy;

import com.exampl.proxy.demo.staticProxy.Person;

import javax.jws.Oneway;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: ljw
 * @Date: 2019/2/20 15:16
 * @Description:
 */
public class JDKProxy implements InvocationHandler {

    private Object person;//被代理人

    //这里的目标类型为Object，则可以接受任意一种参数作为被代理类，实现了动态代理。但是要注意下面的newProxyInstance（）中的参数
    public Object getInstance(Object person){
        this.person = person;
        //与cglib的区别在于这里构建代理对象的时候需要传入被代理对象的接口对象，第二个参数。而cglib不需要被代理对象实现任何接口即可
        return Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始");
        method.invoke(person,args);
        System.out.println("结束");
        return null;
    }
}
