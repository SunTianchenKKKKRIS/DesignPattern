package AdapterPattern.Adapter_Instance;

/**
 * 对象适配器模式
 * 省略，与类适配器模式的区别就是在Adapter类的实现不同，类适配器模式是通过继承，对象适配器模式是通过关联关系
 * 对象适配器的优点：低耦合 缺点：使用复杂。
 *
 *
 * 类和对象适配器的区别：
 * 1、对象适配器比较灵活，因为是通过加字段的
 * 2、对象适配器可以添加多个Adaptee到Adapter中，加字段就行，但类适配器不行，因为不支持多继承（Adapter同时需要包装Adaptee和其子类的时候也是
 *    需要对象适配器，也是这个原因）
 * 3、需要重新定义Adaptee中的行为，用类适配器，相当于子类重写父类方法，对象适配器就比较难（也可以实现，就是给Adaptee写个子类，
 *    然后子类覆盖父类方法，此时Adaptee加的字段就是这个子类了，这么写也有好处，就是可以增加新的方法）
 * 4、方便就用类适配器。
 * @author : stc
 * @date : 2020-06-20 23:11
 **/
public class adapterPattern {
    public static void main(String[] args) {
        Target mAdapter = new Adapter(new Adaptee());
        mAdapter.Request();
    }

}
