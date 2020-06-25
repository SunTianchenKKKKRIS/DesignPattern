package TemplateMethod;

/**
 * Design pattern
 * 抽象模板类
 * 完成Method这类问题需要三步，step123，但是对于不同的methodA和methodB他们的第一步都相同，第23步不相同
 * @author : stc
 * @date : 2020-06-21 15:37
 **/
/*
    1、Method设置成final是为了在子类不能重写该方法，防止算法顺序被修改
    2、Step1设置成私有的，是为了保护类，因为Step1是共有的步骤，如果暴露出来，可能会有被重写的风险
    3、Step23设置成protected是为了子类能根据需求重写自己的Step23步骤
 */
public abstract class Temple {
    final void Method(){
        this.Step1();
        this.Step2();
        this.Step3();

    }
    private void Step1(){
        System.out.println("AB问题公用的Step1");
    }

    protected abstract void Step2();

    protected abstract void Step3();
}
