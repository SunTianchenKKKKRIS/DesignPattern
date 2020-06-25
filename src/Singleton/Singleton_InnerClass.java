package Singleton;

/**
 * Design pattern
 * 静态内部类单例模式（需要时创建）
 *
 * @author : stc
 * @date : 2020-06-19 02:43
 **/
public class Singleton_InnerClass {
    /*
    静态内部类单例模式：
    调用情况说明：
    1、外部调用getInstance
    2、调用Singleton_InnerClass2，此时Singleton_InnerClass2初始化，Instance即被创建，因为是jvm加载静态域得机制，所以保证了线程安全
    3、最终只创建一个实例

     */
    private static class Singleton_InnerClass2{
        private static Singleton_InnerClass Instance = new Singleton_InnerClass();
    }

    private Singleton_InnerClass(){};

    public static Singleton_InnerClass getInstance(){
        return Singleton_InnerClass2.Instance;
    }
}
