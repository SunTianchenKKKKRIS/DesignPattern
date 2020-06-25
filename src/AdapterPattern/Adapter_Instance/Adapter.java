package AdapterPattern.Adapter_Instance;

/**
 *
 *
 * @author : stc
 * @date : 2020-06-20 23:09
 **/
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void Request() {

        adaptee.SpecificRequest();

    }
}
