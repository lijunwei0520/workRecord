package com.exampl.proxy.demo.staticProxy;

/**
 * @Auther: ljw
 * @Date: 2019/2/20 14:52
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        MrLi mrLi = new MrLi();

        Proxy proxy = new Proxy(mrLi);
        proxy.doWork();
    }
}
