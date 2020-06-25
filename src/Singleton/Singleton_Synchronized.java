package Singleton;

/**
 * Design pattern
 * 同步锁式单例模式（需要时创建）
 *
 * @author : stc
 * @date : 2020-06-19 00:35
 **/
public class Singleton_Synchronized {
    /*
    同步锁式单例模式：
    1、依然设有静态的实例来保存唯一实例
    2、依然私有化构造方法防止多个实例
    3、给getInstance加上锁，使得懒汉加载在多线程环境下安全
     */
    private static Singleton_Synchronized Instance = null;

    private Singleton_Synchronized(){}

    public static synchronized Singleton_Synchronized getInstance1(){
        if (Instance == null){
            Instance = new Singleton_Synchronized();
        }
        return Instance;
    }

    /*
    4、Synchronized 代码块形式 另一种写法
     */
    public static synchronized Singleton_Synchronized getInstance2(){
        synchronized (Singleton_Synchronized.class){
            if (Instance == null){
                Instance = new Singleton_Synchronized();
            }
            return Instance;
        }
    }
}
