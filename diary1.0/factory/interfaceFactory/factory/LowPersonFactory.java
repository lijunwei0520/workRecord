package factory.interfaceFactory.factory;

import factory.interfaceFactory.IBreakFast;
import factory.interfaceFactory.Tool;
import factory.interfaceFactory.food.Water;
import factory.interfaceFactory.tool.Bike;

/**
 * @Auther: ljw
 * @Date: 2019/2/19 10:55
 * @Description:具体的工厂实现
 */
public class LowPersonFactory implements IAbstractFactory {

    @Override
    public IBreakFast getfood() {
        return new Water();
    }

    @Override
    public Tool getTool() {
        return new Bike();
    }
}
