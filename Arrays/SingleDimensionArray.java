//1. Insert into an Array
//2. Traverse an Array
//3. Delete an Array for both (specific value as well as the whole array)
//4. Search for an element in an array


import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionArray {
    int[] arr = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i =0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToInsert){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted ");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" + e);
        }
    }

    public void traverseArray(){
        for (int i =0; i < arr.length; i++) {
            System.out.println("Index: " + i + " Value: " + arr[i]);
        }
    }

    public void deleteByIndex(int location) {
        arr[location] = Integer.MIN_VALUE;
        System.out.println("Value " + location + " has been returned to MIN_VALUE.");
    }

    public void searchForElement(int index) {
            int indexValue;
            indexValue = arr[index];
            System.out.println("The value at index " + index + " is " + indexValue);
    }


    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        singleDimensionArray.insert(0,1);
        singleDimensionArray.insert(1,2);
        singleDimensionArray.insert(2,3);
        singleDimensionArray.insert(3,4);
        singleDimensionArray.insert(4,5);
        singleDimensionArray.insert(5,6);
        singleDimensionArray.insert(6,7);
        singleDimensionArray.insert(7,8);


        System.out.println(Arrays.toString(singleDimensionArray.arr));
        singleDimensionArray.searchForElement(0);
        singleDimensionArray.deleteByIndex(4);
        singleDimensionArray.traverseArray();
    }


}
