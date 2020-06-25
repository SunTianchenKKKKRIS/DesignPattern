package BuilderPattern;

/**
 * Design pattern
 * 建造者模式
 * 隐藏创建对象的建造过程和细节，使用户在不知道对象建造的过程和细节的情况下创建复杂的对象
 * 优点：解耦，易于精确控制建造对象过程，易于拓展
 * 缺点：如果建造的不同产品组成部分不相似，就不适用建造者模式，对象经常变化复杂，就需要创建很多具体的建造者来适应变化
 * @author : stc
 * @date : 2020-06-21 18:58
 **/
public class builderPattern {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new Constructor();


        director.Construct(builder);
        Computer computer = builder.GetComputer();
        computer.Show();
    }

}
