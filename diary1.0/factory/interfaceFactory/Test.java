package factory.interfaceFactory;

import factory.interfaceFactory.factory.IAbstractFactory;
import factory.interfaceFactory.factory.LowPersonFactory;

/**
 * @Auther: ljw
 * @Date: 2019/2/19 11:01
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        IAbstractFactory lowFactory = new LowPersonFactory();
        IBreakFast breakFast = lowFactory.getfood();
        Tool tool = lowFactory.getTool();

        System.out.println(breakFast+"="+tool);



        IAbstractFactory highFactory = new LowPersonFactory();
        IBreakFast highBreakFast = highFactory.getfood();
        Tool highTool = highFactory.getTool();

        System.out.println(highBreakFast+"="+highTool);


    }

}
