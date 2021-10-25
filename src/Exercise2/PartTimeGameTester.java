package Exercise2;

public class PartTimeGameTester extends GameTester{

    //declare
    public double rate = 20;
    public int hours;

    public PartTimeGameTester(int hours) {
        super("Harry");
        this.hours = hours;
    }
    @Override
    void setSalary(boolean isFullTime) {
        if(!isFullTime) {
            monthlyPay = hours * rate;
        }
    }

}
