package StaticProxy;

/**
 
 *@描述 
 
 *@创建人 wushichao
 
 *@创建时间 2019/3/14
 
 *@修改人和其它信息
 
 */
public class Test {
    public static void main(String arg[]){
        Friends friends =new Friends(new MySelf());
        friends.findWorks();
    }


}
