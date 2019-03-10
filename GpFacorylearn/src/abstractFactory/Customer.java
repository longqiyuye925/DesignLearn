package abstractFactory;

/**
 * @Description:
 * @author:wsc
 * @Param:
 * @Return:
 * @Date: 2019 03 2019/3/10
 */
public class Customer {
    public static void main(String args[]){
        appleAbstractFactory appleAbstractFactoryc = new appleAbstractFactory();
        XiaoMiAbstractFactory xiaoMiAbstractFactory = new XiaoMiAbstractFactory();
        appleAbstractFactoryc.createPhone();
        appleAbstractFactoryc.createTablet();
        xiaoMiAbstractFactory.createPhone();
        xiaoMiAbstractFactory.createTablet();
    }
}
