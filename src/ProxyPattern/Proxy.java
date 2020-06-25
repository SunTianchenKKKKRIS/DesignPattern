package ProxyPattern;

/**
 * Design pattern
 * 代理类
 * 实现了接口，在实现方法中调用RealSubject的方法，并定义自己的方法，添加在其中
 * @author : stc
 * @date : 2020-06-21 15:28
 **/
public class Proxy implements Subject {
    @Override
    public void Method() {
        RealSubject realSubject = new RealSubject();
        realSubject.Method();
        this.proxyMethod();
    }
    public void proxyMethod(){
        System.out.println("ProxyMethod");
    }
}
