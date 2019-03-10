package simpleFactory;

public class Customer {

    public static void main(String[] args) {
	// write your code here
        SimpleFactory factory=new SimpleFactory();
        factory.createApple();
        factory.createHuaWei();
        factory.createXiaoMi();
    }
}
