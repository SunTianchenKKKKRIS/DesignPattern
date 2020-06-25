package TemplateMethod;

/**
 * Design pattern
 * 针对methodA的具体模板
 *
 * @author : stc
 * @date : 2020-06-21 15:41
 **/
public class Temple_MethodA extends Temple {
    @Override
    protected void Step2() {
        System.out.println("解决A问题的Step2");
    }

    @Override
    protected void Step3() {
        System.out.println("解决A问题的Step3");
    }
}
