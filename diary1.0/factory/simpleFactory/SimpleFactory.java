package factory.simpleFactory;

/**
 * @Auther: ljw
 * @Date: 2019/2/19 09:25
 * @Description:简单工厂模式
 */
public class SimpleFactory {

    private final static SimpleFactory SIMPLE_FACTORY = new SimpleFactory();

    //私有构造方法
    private SimpleFactory(){}

    public static SimpleFactory getInstance(){
        return SIMPLE_FACTORY;
    }
}
