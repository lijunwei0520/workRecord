package factory.interfaceFactory.factory.`0`.factory.interfaceFactory.factory;

import factory.interfaceFactory.IBreakFast;
import factory.interfaceFactory.Tool;
import factory.interfaceFactory.food.Milk;
import factory.interfaceFactory.tool.Car;

/**
 * @Auther: ljw
 * @Date: 2019/2/19 10:56
 * @Description: 具体的工厂实现类
 */
public class HighPersonFactory implements IAbstractFactory {
    @Override
    public Tool getTool() {
        return new Car();
    }

    @Override
    public IBreakFast getfood() {
        return new Milk();
    }
}
