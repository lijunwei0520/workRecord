package com.exampl.proxy.demo.dynamic.CglibProxy;

import javax.sound.midi.Soundbank;

/**
 * @Auther: ljw
 * @Date: 2019/2/20 15:26
 * @Description:
 */
public class CglibProxy implements MethodInterceptor {

    private  Object targetObject;

    public Object getInstance(Object target){
        this.targetObject = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();//注意该处代理的创建过程
        return proxyObj;// 返回代理对象
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        System.out.println("开始");
        obj = method.invoke(targetObject,args);
        System.out.println("结束");
        return obj;
    }
}
