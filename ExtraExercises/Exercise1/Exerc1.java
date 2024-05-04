package Exercise1;

import java.util.Arrays;

public class Exerc1 {

    // vars
    private int[] numbersArray;
    private int[] newArray;
    private int inputArray;
    private int lengthArray;
    private int average;
    private double median;
    // mode=most frequently occurring value
    private int mode;
    private int start_point;
    private int end_point;

    private int indx = 0;

    private int indx_value = 0;

    // constructor

    // set
    public void setNumbersArray(int[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    public void setLengthArray(int lengthArray) {
        this.lengthArray = lengthArray;
    }

    public void setStart_Point(int start_point) {
        this.start_point = start_point;
    }

    public void setEnd_Point(int end_point) {
        this.end_point = end_point;
    }

    // compute
    // compute to generate the array
    public int[] computeGenerateArray(int lengthArray, int start_point, int end_point) {

        for (int i = 0; i < lengthArray; i++) {
            numbersArray[i] = (int) (Math.random() * (end_point - start_point) + start_point);

        }
        return numbersArray;

    }

    public int[] computeNewArray(int[] newArray) {
        // newArray = computeNewArray(numbersArray);
        // to order the array
        int tempValue = 0;
        for (int z = 0; z < newArray.length - 1; z++) {
            int min_indx = z;
            // y start from z+1 so that dont compare with all the array but what is left
            for (int y = z + 1; y < newArray.length; y++) {
                // finding the minimum value index, comparing the z value(initial z and replaced
                // after) with the new loop for the next z position and so on
                if (newArray[min_indx] > newArray[y]) {
                    min_indx = y;
                }
            }
            // swaping values. tempValue so the minimum value doesnt get lost
            tempValue = newArray[min_indx];
            // set the the bigger value where was the minimum
            newArray[min_indx] = newArray[z];
            // set the minimun value to the position that is being compare to begin with
            newArray[z] = tempValue;

        }
        return newArray;
    }

    // compute for the processes
    public void computeAll(int[] newArray) {
        // https://www.geeksforgeeks.org/mean-median-mode/

        // AVERAGE
        int sum = 0;
        for (int i : newArray) {
            sum = sum + i;
        }

        average = sum / newArray.length;

        // MEDIAN, value at the middle of the array
        int temp = 0;
        // find if the array length is odd or even
        // if even
        if (newArray.length % 2 == 0) {
            // here we take the 2 values in the center, eg. if length 6, we take 3 and 4 add
            // and divide them to find the median
            temp = newArray.length / 2; // gives the second index, cause the start at 0 eg. length 6 would give 3 that
                                        // its the forth element
            // using the 2.0 in the division will produce a result with decimals,
            // other way the result would be an integer and median being double would just
            // add the .0
            // temp-1 gives the first number eg. length 6 would be 4(temp)-1 =3
            median = (newArray[temp] + newArray[temp - 1]) / 2.0;
        } else {
            // odd eg. 7 would give 3
            temp = newArray.length / 2;
            median = newArray[temp];
        }

        // mode
        int[] counter = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            for (int x = 0; x < numbersArray.length; x++) {
                if (numbersArray[i] == numbersArray[x]) {
                    counter[i]++;
                }
            }
        }

        for (int z = 0; z < counter.length; z++) {
            if (indx_value < counter[z]) {
                indx_value = counter[z];
                indx = z;
            }
        }
        mode = numbersArray[indx];

    }

    // get
    public int getAverage() {
        return average;
    }

    public double getMedian() {
        return median;
    }

    public int getIndxValue() {
        return indx_value;
    }

    public int getMode() {
        return mode;
    }

}

// Extra exercise 1
// Create a class named "ArrayStatistics" with methods for computing various
// statistics on an array of integers. The class should include methods for:
// • Calculating the mean (average) of the numbers in the array.
// • Finding the median (middle value) of the numbers in the array.
// • Determining the mode (most frequently occurring value) in the array.}