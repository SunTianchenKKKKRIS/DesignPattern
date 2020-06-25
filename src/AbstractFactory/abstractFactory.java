package AbstractFactory;

/**
 * Design pattern
 * 抽象工厂模式
 * 提供一个创建一系列相关或相互依赖对象的接口，而无须指定他们具体的类，具体工厂负责实现实例创建
 * 由抽象产品族（抽象产品类的父类），抽象产品，具体产品，抽象工厂，具体工厂五部分组成
 * 步骤：创建抽象工厂类，创建抽象产品族类，创建抽象类，创建具体产品类，创建具体工厂类，通过实例化具体工厂类，并调用不同创建方法获得不同实例
 *优点：解耦，新增产品只用增加相应产品类和具体工厂类（开闭原则），每个具体工厂类只负责对应产品（单一职责原则），不使用静态工厂方法，工厂可以有等级结构
 *缺点：要增加新的产品种类就要修改抽象工厂类，还要修改其所有子类，不符合开闭原则。
 *
 * @author : stc
 * @date : 2020-06-19 13:15
 **/
public class abstractFactory {
    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        factory1.ManufactureA().showProduct();
        factory1.ManufactureB().showProduct();

        Factory factory2 = new Factory2();
        factory2.ManufactureA().showProduct();;
        factory2.ManufactureB().showProduct();
    }

}
