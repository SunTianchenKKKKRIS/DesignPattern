package FacadePattern;

/**
 * Design pattern
 * 外观类
 *
 * @author : stc
 * @date : 2020-06-21 19:44
 **/
public class Facade {
    private Java java;
    private Python python;
    private Cpp cpp;

    public Facade(Java java, Python python, Cpp cpp) {
        this.java = java;
        this.python = python;
        this.cpp = cpp;
    }

    public void Method1(){
        java.JavaMethod1();
        python.PythonMethod1();
        cpp.CppMethod1();
    }

    public void Method2(){
        java.JavaMethod2();
        python.PythonMethod2();
        cpp.CppMethod2();
    }


}
