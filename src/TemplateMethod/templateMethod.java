package TemplateMethod;

/**
 * 模板方法模式
 * 在不改变模板的前提下通过继承重新定义模板中的内容
 * 优点：提高代码复用性，父类中有公用的步骤，提高拓展性，子类可以根据需要重写步骤，实现了反向控制
 * 缺点：每一个不同的需求都需要一个新子类
 *
 * @author : stc
 * @date : 2020-06-21 15:33
 **/
public class templateMethod {
    public static void main(String[] args) {
        Temple temple_methodA = new Temple_MethodA();
        temple_methodA.Method();
        Temple temple_methodB = new Temple_MethodB();
        temple_methodB.Method();

    }
}
