package SimpleFactoryPattern;

/**
 * Design pattern
 * 简单工厂模式
 * 将类的实例化与使用对象的操作分开，即使用者直接使用不需要知道生产细节
 * 由具体产品类，抽象产品类，产品工厂类三部分组成
 * 步骤：创建抽象产品类，创建具体产品类，创建工厂类，外部调用工厂类，传入不同参数获得不同实例
 * 优点：解耦，易维护
 * 缺点：工厂职责太重，加新产品得改工厂逻辑（违反开闭原则）
 *
 * @author : stc
 * @date : 2020-06-19 12:35
 **/
public class simpleFactory {

    public static void main(String[] args) {
        Factory factory = new Factory();
        try {
            factory.Manufacture("A").showProduct();
        }catch (NullPointerException e){
            System.out.println("没有该类商品");
        }
        try {
            factory.Manufacture("B").showProduct();
        }catch (NullPointerException e){
            System.out.println("没有该类商品");
        }
        try {
            factory.Manufacture("C").showProduct();  //没有该类商品时通过空指针异常捕获
        }catch (NullPointerException e){
            System.out.println("没有该类商品");
        }
    }

}
