package SimpleFactoryPattern;

/**
 * Design pattern
 * 具体产品B类
 *
 * @author : stc
 * @date : 2020-06-19 12:50
 **/
public class ProductB extends Product{
    @Override
    public void showProduct() {
        System.out.println("生产了产品B");
    }
}
