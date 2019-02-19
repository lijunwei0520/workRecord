package factory.interfaceFactory.food;

import factory.interfaceFactory.IBreakFast;

/**
 * @Auther: ljw
 * @Date: 2019/2/19 10:52
 * @Description:
 */
public class Water implements IBreakFast {
    @Override
    public void eat() {
        System.out.println("喝白开水");
    }
}
