package StaticProxy;

/**
 
 *@描述 
 
 *@创建人 wushichao
 
 *@创建时间 2019/3/14
 
 *@修改人和其它信息
 
 */
public class Friends {
    private MySelf mySelf;
    public Friends(MySelf mySelf){
        this.mySelf = mySelf;
    }
    public void findWorks(){
        before();
        mySelf.findWorks();
        after();
    }
    public void before(){
        System.out.println("我来内推买买提");
    }
    public void after(){
        System.out.println("大家多多照顾下");
    }
}
