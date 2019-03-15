package DynamicProxy;

import DynamicProxy.MySelf;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 
 *@描述 
 
 *@创建人 wushichao
 
 *@创建时间 2019/3/14
 
 *@修改人和其它信息
 
 */
public class Friends implements InvocationHandler {
    private Person mySelf;
    public Object getInstance(Person person){
        this.mySelf = person;
        return  Proxy.newProxyInstance(mySelf.getClass().getClassLoader(),mySelf.getClass().getInterfaces(),this);
    }
    public void before(){
        System.out.println("我来内推买买提");
    }
    public void after(){
        System.out.println("大家多多照顾下");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.mySelf,args);
        after();
        return obj;
    }
}
