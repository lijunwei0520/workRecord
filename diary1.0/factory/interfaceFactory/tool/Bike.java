package factory.interfaceFactory.tool;

import factory.interfaceFactory.Tool;

/**
 * @Auther: ljw
 * @Date: 2019/2/19 10:47
 * @Description:
 */
public class Bike implements Tool {

    @Override
    public void gotoWork() {
        System.out.println("骑车去上班");
    }
}
