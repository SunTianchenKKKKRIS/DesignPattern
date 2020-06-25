package StrategyPattern;

/**
 * Design pattern
 * 策略模式
 * 准备一组算法，将每一个算法封装起来，让外部按需调用，使得互换
 * 由抽象策略角色，具体策略角色，环境角色三部分组成
 * 步骤：定义抽象策略角色，定义具体策略角色，定义环境角色
 * 优点：策略类可以切换，因为都继承自同一个抽象类（或实现同一个接口），易扩展，加具体策略类就行符合开闭原则
 * 缺点：客户端需要知道所有策略类并且决定用哪一个，添加策略会生成很多策略类
 *
 * @author : stc
 * @date : 2020-06-20 15:28
 **/
public class strategyPattern {
    public static void main(String[] args) {
        Context context = new Context();
        context.Method("A");
        context.showMethod();
        context.Method("B");
        context.showMethod();
    }

}
