package GetYourArray;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class GetYourArrayApp {
    public static void main(String[] args) {

        // vars
        int num_elements = 0;
        int start_point = 0;
        int end_point = 0;

        // object
        GetYourArray GYA = new GetYourArray();

        // input length
        String tempInput = "";

        while (tempInput.equals("")) {
            tempInput = JOptionPane.showInputDialog(null, "Enter the length of array");
            // temp int, use to pass the input
            try {
                int temp = 0;
                temp = Integer.parseInt(tempInput);
                num_elements = temp;
            } catch (NumberFormatException e) {
                // if not valid input
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
                // reset the var so the while will restart
                tempInput = "";
            }
        }

        // create the array with the requested lenght
        int[] your_array = new int[num_elements];

        String tempInput2 = "";
        // inputs range
        while (tempInput2.equals("")) {
            tempInput2 = JOptionPane.showInputDialog(null, "start");
            // temp int, use to pass the input
            try {
                int temp2 = 0;
                temp2 = Integer.parseInt(tempInput2);
                start_point = temp2;
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
                int temp3 = 0;
                temp3 = Integer.parseInt(tempInput3);
                end_point = temp3;
            } catch (NumberFormatException e) {
                // if not valid input
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
                // reset the var so the while will restart
                tempInput3 = "";
            }
        }

        // set
        GYA.setNum_Elements(num_elements);
        GYA.setEnd_Point(end_point);
        GYA.setStart_Point(start_point);
        GYA.setYourArray(your_array);

        // compute/get
        your_array = GYA.computeYourArray(num_elements, start_point, end_point);

        // output
        JOptionPane.showMessageDialog(null, "Your array is: \n" + Arrays.toString(your_array));
    }
}