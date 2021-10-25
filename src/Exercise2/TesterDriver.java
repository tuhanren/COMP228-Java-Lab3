package Exercise2;

import javax.swing.*;

public class TesterDriver {

    public static void main(String[] args) {
        String testerName;
        int hours;
        String[] type = new String[] {"Full-time","Part-time"};
//        Object[] types = new Object[] {Boolean.TRUE, Boolean.FALSE};
//        boolean userSelect;
        String userSelects;

        GameTester tester;

        testerName = JOptionPane.showInputDialog(null,
                "Please enter your name: ");
        userSelects = (String) JOptionPane.showInputDialog(null,
                "Choose your job type: ",
                "Type",
                JOptionPane.INFORMATION_MESSAGE,
                null,type,type[0]);
//        userSelect = (boolean) JOptionPane.showInputDialog(null,
//                "Do you want to work Full-Time:",
//                "Type",
//                JOptionPane.INFORMATION_MESSAGE,
//                null,types,types[0]);

        if (userSelects.equals("Full-time")) {
            tester = new FullTimeGameTester();
            tester.isFullTime = true;
            tester.testerName = testerName;
            tester.setSalary(true);
        }
        else {
            hours = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "How many hours worked within the month?"));
            tester = new PartTimeGameTester(hours);
            tester.isFullTime = false;
            tester.testerName = testerName;
            tester.setSalary(false);
        }

        JOptionPane.showConfirmDialog(null,
                "Tester Name is: " + tester.getTesterName() + "\n" +
                        "Tester Monthly Pay is: " + tester.getMonthlyPay(),
                "Tester Info", JOptionPane.DEFAULT_OPTION);

    }
}
