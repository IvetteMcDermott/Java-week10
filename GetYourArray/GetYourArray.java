package GetYourArray;

public class GetYourArray {
    // vars
    private int num_elements;
    private int start_point;
    private int end_point;
    private int[] your_array;

    // set
    public void setNum_Elements(int num_elements) {
        this.num_elements = num_elements;
    }

    public void setStart_Point(int start_point) {
        this.start_point = start_point;
    }

    public void setEnd_Point(int end_point) {
        this.end_point = end_point;
    }

    public void setYourArray(int[] your_array) {
        this.your_array = your_array;
    }

    // compute random number within the given range
    public int[] computeYourArray(int num_elements, int start_point, int end_point) {
        for (int x = 0; x < num_elements; x++) {
            int y = 0;
            // https://www.baeldung.com/java-generating-random-numbers-in-range part 2 for
            // range
            your_array[x] = (int) ((Math.random() * (end_point - start_point)) + start_point);
        }
        return your_array;
    }

}

// Create an instantiable class that generates and returns an array of random
// numbers based on 3 parameters:

// -How large the array should be
// -Where the random number range should start

// -Where the random number range should end