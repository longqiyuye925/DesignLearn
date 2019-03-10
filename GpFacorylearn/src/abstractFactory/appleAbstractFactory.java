package abstractFactory;

import methodFactory.AppleFactoryMehod;

/**
 * @Description:抽象工厂
 * @author:wsc
 * @Param:
 * @Return:
 * @Date: 2019 03 2019/3/10
 */
public class appleAbstractFactory extends abstractFactory {
    @Override
    public void createPhone() {
        System.out.println("造一个苹果手机");
    }

    @Override
    public void createTablet() {
        System.out.println("造一个苹果ipad");
    }
}
