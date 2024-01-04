// Jose Guzman
// November 26, 2023
// File name: MinMaxAvgArray.java
// To Compile in terminal type: javac MinMaxAvgArray.java
// To Run in terminal type: MinMaxAvgArray

public class MinMaxAvgArray {

    // used to find the smallest value in the array
    public static double min(double anArray[]) {
        double minValue = anArray[0];
        for (int i = 1; i < anArray.length; i++) {
            if (anArray[i] < minValue) {
                minValue = anArray[i];
            }
        }
        return minValue;
    }

    // Method to find the largest value in the array
    public static double max(double anArray[]) {
        double maxValue = anArray[0];
        for (int i = 1; i < anArray.length; i++) {
            if (anArray[i] > maxValue) {
                maxValue = anArray[i];
            }
        }
        return maxValue;
    }

    // Method to calculate the average of values in an array
    public static double average(double anArray[]) {
        double sum = 0;
        for (double element : anArray) {
            sum += element;
        }
        return sum / anArray.length;
    }

    //method to test the functions
    public static void main(String[] args) {
        // Create an array of doubles
        double doubleArray[] = new double[3];
        doubleArray[0] = 12.1;
        doubleArray[1] = 11.2;
        doubleArray[2] = 13.3;

        System.out.println("Smallest value is " + min(doubleArray));
        System.out.println("Largest value is " + max(doubleArray));
        System.out.println("Average value is " + average(doubleArray));
    }
}

/*
Smallest value is 11.2
Largest value is 13.3
Average value is 12.199999999999998
*/