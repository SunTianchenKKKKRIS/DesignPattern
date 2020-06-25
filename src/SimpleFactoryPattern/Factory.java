package SimpleFactoryPattern;

/**
 * Design pattern
 * 工厂类
 *
 * @author : stc
 * @date : 2020-06-19 12:53
 **/
public class Factory {
    public static Product Manufacture(String productName){
        switch (productName){
            case "A":return new ProductA();

            case "B":return new ProductB();

            default:return null;
        }

    }
}
