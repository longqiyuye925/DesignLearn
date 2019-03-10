package methodFactory;

/**
 * @Description:
 * @author:
 * @Param:
 * @Return:
 * @Date: 2019 03 2019/3/10
 */
public class Customer {
    public static void  main(String args[]){
        AppleFactoryMehod appleFactoryMehod = new AppleFactoryMehodImpl();
        HuaWeiFactoryMehod huaWeiFactoryMehod = new HuaWeiFactoryMehodImpl();
        XiaomiFactoryMehod xiaomiFactoryMehod = new XiaomiFactoryMehodImpl();
        appleFactoryMehod.createApple();
        huaWeiFactoryMehod.createHuaWei();
        xiaomiFactoryMehod.createXiaoMi();
    }

}
