import java.util.ArrayList;
import java.util.List;

public class Waterdrop {

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

            double[][] percentage = new double[array.length][array[0].length];
            List<Integer> x = new ArrayList<Integer>();

            percentage[0][point] = 100;

            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                   if(percentage[row][col] > 0){
                       x.add(col);
                   }

                }
                for(int q : x) {
                    if (row != 6) {
                        if (arr[row][q] == 1) {
                            if (q == 0)
                                percentage[row + 1][q + 1] = percentage[row][q] / 2;
                            else if (q == (arr[0].length - 1))
                                percentage[row + 1][q - 1] = percentage[row][q] / 2;
                            else {
                                percentage[row + 1][q + 1] = percentage[row][q] / 2;
                                percentage[row + 1][q - 1] = percentage[row][q] / 2;
                            }
                        } else {
                            percentage[row + 1][q] = percentage[row][q];
                        }

                    }
                }

            }
            return percentage;

        }

}
