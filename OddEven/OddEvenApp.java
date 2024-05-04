package OddEven;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OddEvenApp {

    public static void main(String[] args) {

        // vars
        int[] input = new int[5];
        int[] result;
        int oe = -1;

        // objects
        OddEven OE = new OddEven();

        // inputs
        for (int i = 0; i < input.length; i++) {
            // temporal string to validate the entry is not empty
            String tempInput = "";
            // if empty dont accept the entry and keep returning the inputbox
            while (tempInput.equals("")) {
                tempInput = JOptionPane.showInputDialog(null, "Enter 5 integers for the array: " + (i + 1) + "/5");

                // temp int, use to pass the input
                try {
                    int temp = 0;
                    temp = Integer.parseInt(tempInput);
                    input[i] = temp;
                } catch (NumberFormatException e) {
                    // if not valid input
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
                    // reset the var so the while will restart
                    tempInput = "";
                }
            }
        }
        // give the input box if not 1 or 0
        while (oe > 1 || oe < 0) {
            oe = Integer.parseInt(JOptionPane.showInputDialog(null, "Even=0 or Odd=1"));
        }

        // set
        OE.setInput(input);
        OE.setOE(oe);

        // compute/get
        result = OE.computeOdd(input, oe);

        // output
        // if even
        if (oe == 0) {
            JOptionPane.showMessageDialog(null,
                    "The array : \n " + Arrays.toString(input) + "\n\nSubarray of even numbers: \n"
                            + Arrays.toString(result),
                    "Result", 1);
        } else if (oe == 1) {
            // if odd
            JOptionPane.showMessageDialog(null,
                    "The array : \n " + Arrays.toString(input) + "\n\nSubarray of odd numbers:\n"
                            + Arrays.toString(result),
                    "Result", 1);
        }
    }
}
