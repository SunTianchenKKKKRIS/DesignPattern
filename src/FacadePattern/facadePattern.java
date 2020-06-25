package FacadePattern;

import java.util.zip.ZipFile;

/**
 * Design pattern
 * 外观模式
 * 通过创建一个统一的外观类，包装系统中的一个或者多个复杂的类，客户端通过外观类调用其子系统中的所有方法（有点像网页的导航首页）
 * 优点：客户端与子系统解耦，简化了客户端使用难度，降低了编译复杂性依赖性，简化了在不同平台的移植过程（其实也是因为客户端和子系统解耦了）
 * 缺点：增加新子系统（比如说加一个JavaScript）需要修改外观类，违背开闭原则，不能很好的限制客户端使用子系统
 *
 * 外观模式和适配器模式比较像，都是将类封装给客户端一个新的接口用，行为虽然相似但是意图不同，外观模式是为了简化接口，
 * 而适配器模式是为了将一个接口包装起来，使其转化为不同接口（行为简单来说都是封装）
 * @author : stc
 * @date : 2020-06-21 19:36
 **/
public class facadePattern {
    public static void main(String[] args) {
//        如果不使用外观模式，使用如下三个类的方法就必须得这样
//        Java java = new Java();
//        Python python = new Python();
//        Cpp cpp = new Cpp();
//        java.JavaMethod1();java.JavaMethod2();
//        python.PythonMethod1();python.PythonMethod2();
//        cpp.CppMethod1();cpp.CppMethod2();

        //使用了外观模式就可以这样
        Facade facade = new Facade(new Java(),new Python(),new Cpp());
        facade.Method1();
        facade.Method2();
    }


}
