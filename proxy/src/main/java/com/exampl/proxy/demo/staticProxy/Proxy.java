package com.exampl.proxy.demo.staticProxy;

/**
 * @Auther: ljw
 * @Date: 2019/2/20 14:48
 * @Description: 静态代理，必须和目标类实现共同的接口，即和MrLi
 */
public class Proxy implements Person {
    private Person person;


    public Proxy (Person person){
        this.person = person;
    }
    public void doWork() {
        System.out.println("开始");
        person.doWork();
        System.out.println("结束");
    }
}
