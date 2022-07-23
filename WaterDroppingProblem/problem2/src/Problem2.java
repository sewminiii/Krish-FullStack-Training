import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    static int[][] arr = new int[][]{
            {0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 0},
    };

    public static void main(String[] args) {
        //get the water percentages of all indexes
        double[][] endBuckets = waterDropping(arr, 3);

        //get only the water percentage of last row
        double[] results;
        results = endBuckets[endBuckets.length-1];

        for(double value : results) {
            System.out.print(value+"   ");
        }
        System.out.println();

    }


    public static double[][] waterDropping(int[][] array, int point) {

        //to store percentages
        double[][] percentage = new double[array.length][array[0].length];
        //to store the index numbers which has a percentage in each row
        List<Integer> x = new ArrayList<Integer>();
        //set 1st row 3rd column percentage as 100
        percentage[0][point] = 100;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(percentage[row][col] > 0){
                    x.add(col);
                }

            }
            for(int q : x) {
                if (row != array.length-1) {
                    //checks whether the index value is one
                    if (array[row][q] == 1) {
                        //checking left edge
                        if (q == 0) {
                            for (int i = 1; i < array[row].length; i++) {
                                if (array[row][i] == 0) {
                                    percentage[row][i] = percentage[row][q] / 2;
                                    percentage[row+1][i] = percentage[row][i];
                                    break;
                                }
                            }
                        }
                        //checking right edge
                        else if (q == (array[0].length - 1)){
                            for (int i = array[row].length-1; i > 0 ; i--) {
                                if (array[row][i] == 0) {
                                    percentage[row][i] = percentage[row][q] / 2;
                                    percentage[row+1][i] = percentage[row][i];
                                    break;
                                }
                            }
                        }
                        else {
                            for (int i = q-1; i > 0 ; i--) {
                                if (array[row][i] == 0) {
                                    percentage[row][i] = percentage[row][q] / 2;
                                    percentage[row+1][i] = percentage[row][i];
                                    break;
                                }
                            }
                            for (int i = q+1; i < array[row].length; i++) {
                                if (array[row][i] == 0) {
                                    percentage[row][i] = percentage[row][q] / 2;
                                    percentage[row+1][i] = percentage[row][i];
                                    break;
                                }
                            }
                        }
                        //if index value is zero
                    } else {
                        percentage[row + 1][q] = percentage[row][q];
                    }
                }
            }

        }
        return percentage;

    }

}
