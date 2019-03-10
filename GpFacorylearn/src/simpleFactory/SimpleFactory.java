package simpleFactory;

/**
 * @Description: 简单工厂模式
 * @author: wsc
 * @Param: NA
 * @Return: string
 * @Date: 2019 03 2019/3/10
 */
public class SimpleFactory {
    public void createApple(){
        System.out.println("造个苹果");
    }
    public void createXiaoMi(){
        System.out.println("造个小米");
    }
    public void createHuaWei(){
        System.out.println("造个华为");
    }
}
