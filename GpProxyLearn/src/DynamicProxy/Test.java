package DynamicProxy;

import DynamicProxy.Friends;
import DynamicProxy.MySelf;

/**
 
 *@描述 
 
 *@创建人 wushichao
 
 *@创建时间 2019/3/14
 
 *@修改人和其它信息
 
 */
public class Test {
    public static void main(String arg[]){
        Friends friends =new Friends();
        Person obj =(Person)friends.getInstance(new MySelf());
        obj.findWorks();
        obj.findGirl();
    }


}
