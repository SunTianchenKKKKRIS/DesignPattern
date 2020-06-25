package FactoryMethod;

/**
 * 具体产品B类
 *
 * @author : stc
 * @date : 2020-06-19 13:08
 **/
public class ProductB extends Product{
    @Override
    public void showProduct() {
        System.out.println("生产了产品B");
    }
}
