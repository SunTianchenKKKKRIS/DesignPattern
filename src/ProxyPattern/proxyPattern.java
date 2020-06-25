package ProxyPattern;

/**
 * Design pattern
 * 代理模式（静态代理）
 * 给目标对象提供一个代理对象，并由代理对象控制目标对象的引用
 * 优点：协调调用者和被调用者，解耦，proxy成了客户端和目标对象间的中介，保护了目标对象
 * 缺点：加了proxy，请求速度会变慢，实现代理模式会把系统变复杂
 *
 *
 * @author : stc
 * @date : 2020-06-21 15:20
 **/
public class proxyPattern {
    public static void main(String[] args) {
        Subject Proxy = new Proxy();
        Proxy.Method();
    }
}
