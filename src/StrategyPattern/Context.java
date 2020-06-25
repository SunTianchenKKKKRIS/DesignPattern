package StrategyPattern;

/**
 * Design pattern
 * 环境角色,用来提供策略的上下文环境
 *
 * @author : stc
 * @date : 2020-06-20 16:24
 **/
public class Context {
    private Strategy strategy;

    public void Method(String methodName){
        switch (methodName){
            case "A":
                strategy = new StrategyA();
                break;
            case "B":
                strategy = new StrategyB();
                break;
        }

    }

    public void showMethod(){
        strategy.showMethod();
    }
}
