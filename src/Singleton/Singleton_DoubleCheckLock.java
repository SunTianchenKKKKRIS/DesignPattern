package Singleton;

/**
 * Design pattern
 * 双重校验锁单例模式（需要时创建）
 *
 * @author : stc
 * @date : 2020-06-19 02:29
 **/
public class Singleton_DoubleCheckLock {
    /*
    双重校验锁单例模式：
    1、Instance字段和私有化构造方法同上
    2、第一个if：若实例已经创建，直接返回实例，就不必加锁了，提高效率
    3、第二个if：保证只有一个实例

    双重校验锁：线程A调用时，没有实例，所以加锁并创建实例，这时如果线程B调用，此时线程B能进入第一层if，但此后要等待线程A得调用结束，
                当线程A调用结束时，B进行第二个if判断，这时已有实例，所以不进入第二个if，直接返回Instance.
     */
    private static Singleton_DoubleCheckLock Instance = null;
    private Singleton_DoubleCheckLock(){};
    public static Singleton_DoubleCheckLock getInstance(){
        if (Instance == null) {
            synchronized (Singleton_DoubleCheckLock.class) {
                if (Instance == null) {
                    Instance = new Singleton_DoubleCheckLock();
                }
            }
        }
        return Instance;
    }
}
