package Exercise2;

public class FullTimeGameTester extends GameTester{

    public FullTimeGameTester() {
        super("Henry");
    }

    @Override
    void setSalary(boolean isFullTime) {
        if (isFullTime){
            monthlyPay = 3000;
        }
    }
}
