package SumMax;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class SumMaxApp {
    public static void main(String[] args) {

        // vars
        int sum;
        int max;
        int[] input = new int[5];

        // objects
        SumMax SM = new SumMax();

        // inputs
        for (int i = 0; i < input.length; i++) {

            String tempInput = "";

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

        // sets
        SM.setInput(input);

        // compute
        SM.computeSumMax(input);

        // get
        max = SM.getMax();
        sum = SM.getSum();

        // output
        JOptionPane.showMessageDialog(null,
                "Your array : " + Arrays.toString(input) + "\nThe sum of the values is :" + sum
                        + "\nThe max value is :" + max,
                "Result", 1);
    }
}