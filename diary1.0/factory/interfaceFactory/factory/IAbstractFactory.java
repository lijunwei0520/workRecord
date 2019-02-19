package factory.interfaceFactory.factory;

import factory.interfaceFactory.IBreakFast;
import factory.interfaceFactory.Tool;

/**
 * 工厂接口
 */
public interface IAbstractFactory {

    Tool getTool();

    IBreakFast getfood();
}
