package FactoryMethod;

/**
 * Design pattern
 * 具体产品A类
 *
 * @author : stc
 * @date : 2020-06-19 13:07
 **/
public class ProductA extends Product {
    @Override
    public void showProduct() {
        System.out.println("生产了产品A");
    }
}
