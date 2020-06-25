package AbstractFactory;

/**
 * Design pattern
 * 具体工厂类2
 *
 * @author : stc
 * @date : 2020-06-19 13:30
 **/
public class Factory2 extends Factory {
    @Override
    public Product ManufactureA() {
        return new ProductA2();
    }

    @Override
    public Product ManufactureB() {
        return new ProductB2();
    }
}
