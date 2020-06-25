package Singleton;

/**
 * Design pattern
 * 枚举类型（初始化时创建）
 *
 * @author : stc
 * @date : 2020-06-19 00:21
 **/
public enum  Singleton_Enum {
    /*
    枚举类单例模式：
    1、定义一个枚举元素，就是单例类的一个实例
    2、隐藏了一个空的、私有的构造方法 private Singleton_Enum(){}
    3、获取单例的方式：Singleton_Enum singleton = Singleton_Enum.INSTANCE;
    4、是实现单例的最简单途径
     */
    INSTANCE;

}


