package OddEven;

import java.util.Arrays;

public class OddEven {
    // vars
    private int[] input;
    private int[] result;

    private int oe;

    // set
    public void setInput(int[] input) {
        this.input = input;
    }

    public void setOE(int oe) {
        this.oe = oe;
    }

    // compute
    public int[] computeOdd(int[] input, int oe) {
        // find out the lenght for the result array
        int count = 0;
        for (int i : input) {
            if (i % 2 == 0) {
                count++;
            }
        }

        // THIS WORKS USING A LOGIC AND AN ARRAY FOR EACH, EVEN AND OTHER FOR ODDS
        // odd = new int[input.length - count];
        // even = new int[count];
        // if (oe == 1) {
        // int j = 0;
        // for (int i = 0; i < input.length; i++) {
        // if (input[i] % 2 == 1) {
        // odd[j] = input[i];
        // j++;
        // }
        // }
        // } else if (oe == 0) {
        // int j = 0;
        // for (int i = 0; i < input.length; i++) {
        // if (input[i] % 2 == 0) {
        // even[j] = input[i];
        // j++;
        // }
        // }
        // }

        // SIMPLIFIED, ONE ARRAY FOR EITHER
        if (oe == 0) {
            // THE COUNT HAVE THE AMOUNT OF EVEN INTEGERS IN THE ARRAY, AS THE OE VAR IS
            // ASKING FOR EVEN(0)
            result = new int[count];
            // INDEX FOR RESULT J
            int j = 0;
            // LOOP FOR THE ARRAY
            for (int i = 0; i < input.length; i++) {
                if (input[i] % 2 == 0) {
                    result[j] = input[i];
                    j++;
                }
            }
        } else if (oe == 1) {
            // THE COUNT HAVE THE AMOUNT OF EVEN INTEGERS IN THE ARRAY, AS THE OE VAR IS
            // ASKING FOR ODD(1) WE SUBTRACT IT FROM THE LENGTH AND FIND THE AMOUNT OF ODDS
            result = new int[input.length - count];
            // INDEX FOR RESULT J
            int j = 0;
            // LOOP FOR THE ARRAYS
            for (int i = 0; i < input.length; i++) {
                if (input[i] % 2 == 1) {
                    result[j] = input[i];
                    j++;
                }
            }
        }
        return result;
    }

    // get
}

// Lab 3 (Advanced)
// Create an instantiable class that sorts a given array into a subset array of
// either even or odd numbers. The class should have 1 method that accepts 2
// parameters:

// -An array of numbers
// -An integer representing whether the subset array to be returned will contain
// odd or even numbers (0= even, 1=odd)
// The same method should then sort the given array into a smaller array
// containing either all odd or all even numbers. This array should then be
// returned.
