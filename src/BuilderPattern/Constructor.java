package BuilderPattern;

/**
 * Design pattern
 * 具体建造者
 *
 * @author : stc
 * @date : 2020-06-21 19:05
 **/
public class Constructor extends Builder {
    Computer computer = new Computer();

    @Override
    public void BuildCpu() {
        computer.Add("Cpu");
    }

    @Override
    public void BuildMainBorad() {
        computer.Add("MainBorad");
    }

    @Override
    public void BuildHd() {
        computer.Add("Hd");
    }

    @Override
    public Computer GetComputer() {
        return computer;
    }
}
