package StrategyPattern;

/**
 * Design pattern
 * 具体策略A
 *
 * @author : stc
 * @date : 2020-06-20 16:22
 **/
public class StrategyA extends Strategy {
    @Override
    public void showMethod() {
        System.out.println("算法A");
    }
}
