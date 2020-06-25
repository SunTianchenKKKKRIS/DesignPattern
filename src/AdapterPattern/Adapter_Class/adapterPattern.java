package AdapterPattern.Adapter_Class;

/**
 * Design pattern
 * 适配器模式
 * 定义一个包装类，用来包装不兼容接口的对象，把一个类的接口变成客户端期待的另一种接口，使不匹配的两个类可以一起工作
 * 理解：用户想调用Target接口中的Request方法，但是Request方法目前不能解决用户的需求，但此时Adaptee中的SpecificRequest方法可以解决，
 *       所以新建一个Adapter类，实现Target继承Adaptee，在实现Target的Request中调用Adaptee的SpecificRequest方法，这样就相当于把Target包装
 *       了一下，让他有了Adaptee的效果。
 *优点：更好的复用性，能把一个固定的类不该他的源码就实现另外的功能，透明、简单，客户端调用的都是Request方法，更好的扩展性，对于Target可以
 *      无限扩展，解耦，符合开闭原则。
 *类适配器的优点：简单，不需要关联关系引入字段 缺点：高耦合，Adapter里需要一个Adaptee字段
 * @author : stc
 * @date : 2020-06-20 22:39
 **/
public class adapterPattern {
    public static void main(String[] args) {
        Target mAdapter = new Adapter();
        mAdapter.Request();
    }

}
