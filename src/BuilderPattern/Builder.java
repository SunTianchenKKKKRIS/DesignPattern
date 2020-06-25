package BuilderPattern;

/**
 * Design pattern
 * 定义建造的过程，用组装电脑举例
 *
 * @author : stc
 * @date : 2020-06-21 19:00
 **/
public abstract class Builder {
    //组装cpu
    public abstract void BuildCpu();
    //组装主板
    public abstract void BuildMainBorad();
    //组装硬盘
    public abstract void BuildHd();
    //得到电脑
    public abstract Computer GetComputer();
}
