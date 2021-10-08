package in.samanvitha.unit_1.part_4;

public class Array {

    public static void main( String[] args ) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
// Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        for (double element: myList) {
            System.out.println(element);
        }

// Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
    }
}
