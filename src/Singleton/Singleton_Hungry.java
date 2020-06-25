package Singleton;

/**
 * Design pattern
 * 饿汉式单例模式（初始化时创建）
 *
 * @author : stc
 * @date : 2020-06-19 00:12
 **/
public class Singleton_Hungry {
    /*
    饿汉式单例模式：
    1、设置一个静态的私有属性，类型为单例的目标类，是用来记录该类的唯一实例的
    2、将目标类的构造方法设置为私有的，目的是防止外界创造第二个实例
    3、设置一个静态的getInstance方法，目的是让外界有渠道获得目标类的这个唯一的实例
    4、线程安全，因为jvm只加载一次
     */
    private static Singleton_Hungry Instance = new Singleton_Hungry();

    private Singleton_Hungry(){
    }

    public static Singleton_Hungry getInstance(){
        return Instance;
    }
}
