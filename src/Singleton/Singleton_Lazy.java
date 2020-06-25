package Singleton;

/**
 * Design pattern
 * 懒汉式单例模式（需要时创建）
 *
 * @author : stc
 * @date : 2020-06-19 00:26
 **/
public class Singleton_Lazy {
    /*
    懒汉式单例模式：
    1、依然用一个静态的实例存储这个唯一实例，与饿汉式的区别在于初始化为null，从而在类加载时不创建实例
    2、依然将构造方法设置为私有
    3、用getInstance方法获得唯一的实例（注意：不能简单的return new Singleton_Lazy，这样写就打破了单例的意义，只能操作Instance这个字段）
    4、懒汉式线程不安全，多个线程调用getInstance时，会存在类似数据库脏读的情况（Instance已经修改，但读出来的依然为null，从而创建第二个线程）
     */
    private static Singleton_Lazy Instance = null;

    private Singleton_Lazy(){}

    public static Singleton_Lazy getInstance(){
        if(Instance == null){
            Instance = new Singleton_Lazy();
        }
        return Instance;
    }
}
