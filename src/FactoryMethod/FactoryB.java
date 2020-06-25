package FactoryMethod;

/**
 * Design pattern
 *
 * @author : stc
 * @date : 2020-06-19 13:09
 **/
public class FactoryB extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}
