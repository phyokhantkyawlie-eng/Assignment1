package ifElse;
import javax.swing.JOptionPane;

public class StudentResult {

    public static void main(String[] args) {

        String studentName;
        int studentAge;

        studentName = JOptionPane.showInputDialog("Enter Student Name");

        studentAge = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Student Age"));

        if (studentAge >= 25) {

            JOptionPane.showMessageDialog(null,
                    "Student Name : " + studentName +
                    "\nStatus : Cannot Enter");

        } else {

            JOptionPane.showMessageDialog(null,
                    "Student Name : " + studentName +
                    "\nStatus : Can Enter");

            int sub1, sub2, sub3;

            sub1 = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter Subject One Mark"));

            sub2 = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter Subject Two Mark"));

            sub3 = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter Subject Three Mark"));

            if (sub1 > 100 || sub1 < 0) {

                JOptionPane.showMessageDialog(null,
                        "Subject One Mark Invalid" +
                        "\nCannot Enter");

            } else if (sub2 > 100 || sub2 < 0) {

                JOptionPane.showMessageDialog(null,
                        "Subject Two Mark Invalid" +
                        "\nCannot Enter");

            } else if (sub3 > 100 || sub3 < 0) {

                JOptionPane.showMessageDialog(null,
                        "Subject Three Mark Invalid" +
                        "\nCannot Enter");

            } else {

                int total = sub1 + sub2 + sub3;

                if (total < 70) {

                    JOptionPane.showMessageDialog(null,
                            "Student Name : " + studentName +
                            "\nTotal Marks : " + total +
                            "\nResult : Failed");

                } else if (total >= 70 && total < 200) {

                    JOptionPane.showMessageDialog(null,
                            "Student Name : " + studentName +
                            "\nTotal Marks : " + total +
                            "\nResult : Moderate");

                } else {

                    JOptionPane.showMessageDialog(null,
                            "Student Name : " + studentName +
                            "\nTotal Marks : " + total +
                            "\nResult : Excellent");
                }
            }
        }
    }
}