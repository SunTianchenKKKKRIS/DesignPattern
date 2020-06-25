package AbstractFactory;

/**
 * Design pattern
 * 具体工厂类1
 *
 * @author : stc
 * @date : 2020-06-19 13:29
 **/
public class Factory1 extends Factory {
    @Override
    public Product ManufactureA() {
        return new ProductA1();
    }

    @Override
    public Product ManufactureB() {
        return new ProductB1();
    }
}
