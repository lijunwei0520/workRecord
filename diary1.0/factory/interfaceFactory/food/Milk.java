package factory.interfaceFactory.food;

import factory.interfaceFactory.IBreakFast;

/**
 * @Auther: ljw
 * @Date: 2019/2/19 10:51
 * @Description:
 */
public class Milk implements IBreakFast {

    @Override
    public void eat() {
        System.out.println("喝牛奶");
    }
}
