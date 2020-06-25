package FactoryMethod;

/**
 * Design pattern
 * 具体工厂A
 *
 * @author : stc
 * @date : 2020-06-19 13:09
 **/
public class FactoryA extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}
