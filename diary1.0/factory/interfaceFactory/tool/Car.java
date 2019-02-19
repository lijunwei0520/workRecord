package factory.interfaceFactory.tool;

import factory.interfaceFactory.Tool;

/**
 * @Auther: ljw
 * @Date: 2019/2/19 10:50
 * @Description:
 */
public class Car implements Tool {
    @Override
    public void gotoWork() {
        System.out.println("开车去上班");
    }
}
