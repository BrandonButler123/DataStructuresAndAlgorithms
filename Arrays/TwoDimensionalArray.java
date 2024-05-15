import java.util.Arrays;

public class TwoDimensionalArray {
    int arr[][] = null;


    // REVIEW TO UNDERSTAND
    public TwoDimensionalArray(int numberOfRows, int numberOfCols) {
        this.arr = new int[numberOfRows][numberOfCols];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    public void traverseArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void searchingValue(int value){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value is found at Row: " + row + " Col: " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    public void delete(int row, int col){
        try{
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("Succesfully deleted: " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array");
        }
    }



    public static void main (String[]args){
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(5, 5);
        System.out.println(Arrays.toString(twoDimensionalArray.arr));
    }
}
