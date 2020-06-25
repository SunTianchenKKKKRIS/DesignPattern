package TemplateMethod;

/**
 * Design pattern
 * 针对methodB的具体模板
 *
 * @author : stc
 * @date : 2020-06-21 15:42
 **/
public class Temple_MethodB extends Temple {
    @Override
    protected void Step2() {
        System.out.println("解决B问题的Step2");
    }

    @Override
    protected void Step3() {
        System.out.println("解决B问题的Step3");
    }
}
