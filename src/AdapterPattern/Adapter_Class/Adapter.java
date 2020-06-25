package AdapterPattern.Adapter_Class;

/**
 *
 *
 * @author : stc
 * @date : 2020-06-20 22:49
 **/
public class Adapter extends Adaptee implements Target {
    @Override
    public void Request() {
        this.SpecificRequest();
    }
}
