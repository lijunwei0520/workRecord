package factory.staticFactory;

/**
 * @Auther: ljw
 * @Date: 2019/2/19 10:29
 * @Description:
 */
public class StaticFactory {

    private static StaticFactory staticFactory;

    static {
        staticFactory = new StaticFactory();
    }

    private StaticFactory(){}

    public static StaticFactory getInstance(){
        return staticFactory;
    }
}
