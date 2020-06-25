package ProxyPattern;

/**
 * Design pattern
 * 真实对象类
 *
 * @author : stc
 * @date : 2020-06-21 15:27
 **/
public class RealSubject implements Subject {
    @Override
    public void Method() {
        System.out.println("RealMethod");
    }
}
