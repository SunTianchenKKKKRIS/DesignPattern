package FactoryMethod;

/**
 * Design pattern
 * 工厂方法模式
 * 将产品的创建延迟到工厂类的子类中（具体工厂）去完成，解决了简单工厂违反开闭原则的问题
 * 由抽象产品类，产品类，抽象工厂类，工厂类四部分组成
 * 步骤:创建抽象工厂类，创建抽象产品类，创建具体产品类，创建具体工厂类，外界通过调用具体工厂类创建产品
 * FactoryA创建ProductA FactoryB创建ProductB
 * 优点：符合了开闭原则，符合单一职责原则（每个工厂只生产相应的产品），不用switch判断复杂的逻辑，不使用静态方法，工厂可以有父子等级结构
 * 缺点：增加一个产品需要增加一个具体产品类和一个具体工厂类，类太多了，一个类只能创建一种产品，
 *
 * @author : stc
 * @date : 2020-06-19 13:01
 **/
public class factoryMethod {

    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        factoryA.Manufacture().showProduct();

        Factory factoryB = new FactoryB();
        factoryB.Manufacture().showProduct();
    }
}
