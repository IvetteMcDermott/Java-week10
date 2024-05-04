package Exercise1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exerc1App {

    public static void main(String[] args) {

        // vars
        int lengthArray = 0;
        int start_point = 0;
        int end_point = 0;

        int inputArray;
        int average;
        double median;
        // mode=most frequently occurring value
        int mode;
        int indx_value;

        // object
        Exerc1 ex = new Exerc1();

        // input
        String tempInput = "";

        while (tempInput.equals("")) {
            tempInput = JOptionPane.showInputDialog(null, "Enter the length of array");
            // temp int, use to pass the input
            try {
                int temp = 0;
                temp = Integer.parseInt(tempInput);
                lengthArray = temp;
            } catch (NumberFormatException e) {
                // if not valid input
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
                // reset the var so the while will restart
                tempInput = "";
            }
        }

        // create the array with the requested lenght
        int[] numbersArray = new int[lengthArray];
        int[] newArray;

        String tempInput2 = "";
        // inputs range
        while (tempInput2.equals("")) {
            tempInput2 = JOptionPane.showInputDialog(null, "start");
            // temp int, use to pass the input
            try {
                start_point = Integer.parseInt(tempInput2);
            } catch (NumberFormatException e) {
                // if not valid input
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
                // reset the var so the while will restart
                tempInput2 = "";
            }
        }

        String tempInput3 = "";
        // inputs range
        while (tempInput3.equals("")) {
            tempInput3 = JOptionPane.showInputDialog(null, "end");
            // temp int, use to pass the input
            try {
                end_point = Integer.parseInt(tempInput3);
            } catch (NumberFormatException e) {
                // if not valid input
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
                // reset the var so the while will restart
                tempInput3 = "";
            }
        }

        // set
        ex.setNumbersArray(numbersArray);
        ex.setLengthArray(lengthArray);
        ex.setStart_Point(start_point);
        ex.setEnd_Point(end_point);

        // compute
        numbersArray = ex.computeGenerateArray(lengthArray, start_point, end_point);
        newArray = ex.computeNewArray(numbersArray);
        ex.computeAll(numbersArray);

        // get
        average = ex.getAverage();
        median = ex.getMedian();
        mode = ex.getMode();
        indx_value = ex.getIndxValue();
        // newArray = ex.getSortedArray();

        // output

        // result

        if (indx_value == 0 || indx_value == 1) {
            JOptionPane.showMessageDialog(null, "\n\nOriginal array:  " + Arrays.toString(numbersArray)
                    + "\nSorted array:  " + Arrays.toString(newArray) + "\n\nAverage: " + average
                    + "\nNo mode number, there are not values repeated" + "\nMedian: " + median, "Report",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "\n\nOriginal array:  " + Arrays.toString(numbersArray)
                    + "\nSorted array:  " + Arrays.toString(newArray) + "\n\nAverage: " + average
                    + "\nMode Number: " + mode + "   Frequency: " + indx_value + "\nMedian: " + median);
        }
        // JOptionPane.showMessageDialog(null, " median " + median);
    }
}
