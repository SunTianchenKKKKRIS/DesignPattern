package BuilderPattern;

/**
 * Design pattern
 * 组装人员
 *
 * @author : stc
 * @date : 2020-06-21 19:03
 **/
public class Director {
    public void Construct(Builder builder){
        builder.BuildCpu();
        builder.BuildMainBorad();
        builder.BuildHd();
    }
}
