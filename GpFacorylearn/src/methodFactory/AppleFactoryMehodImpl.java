package methodFactory;

/**
 * @Description:工厂方法
 * @author:
 * @Param:
 * @Return:
 * @Date: 2019 03 2019/3/10
 */
public class AppleFactoryMehodImpl implements AppleFactoryMehod {
    @Override
    public void createApple() {
        System.out.println("造一个苹果");
    }
}
