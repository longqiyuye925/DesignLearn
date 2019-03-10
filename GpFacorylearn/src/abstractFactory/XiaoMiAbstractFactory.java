package abstractFactory;

/**
 * @Description:抽象工厂
 * @author: wsc
 * @Param:
 * @Return:
 * @Date: 2019 03 2019/3/10
 */
public class XiaoMiAbstractFactory extends abstractFactory {
    @Override
    public void createPhone() {
        System.out.println("造一个小米手机");
    }

    @Override
    public void createTablet() {
        System.out.println("造一个小米平板");
    }
}
