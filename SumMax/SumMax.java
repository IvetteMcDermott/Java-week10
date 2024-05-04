package SumMax;

public class SumMax {

    // vars
    private int sum;
    private int max;
    private int[] input;

    // set
    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setInput(int[] input) {
        this.input = input;
    }

    // compute
    public void computeSumMax(int[] input) {
        // for each loop to add them all
        for (int i : input) {
            sum = sum + i;
        }

        // for each loop to find the max comparing an initial value with the next
        max = input[0];
        for (int i : input) {
            if (max < i) {
                max = i;
            }
        }
    }

    // get
    public int getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }
}

// Create an instantiable class that returns the details of an array of numbers.
// The class should contain 3 methods:

// -1 method that accepts as a parameter an array of integers. This method
// should also calculate the sum of the array and the max value in the array
// -1 method that returns the max
// -1 method that returns the sum