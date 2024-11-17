import com.jtechnology.test.TestDataI;

public class App {
    public static void main(String[] args) throws Exception {
        double average = 0;
        double maxAverage = 0;
        for (int row = 0; row < TestDataI.MATRIX.length; row++){
            int rowSum = 0;
            for (int column = 0; column < TestDataI.MATRIX[row].length; column++){
                rowSum += Double.parseDouble(TestDataI.MATRIX[row][column]); //sum of the row elements
            }
            average = rowSum / TestDataI.MATRIX[row].length; // average calc
            if(average > maxAverage) { //check for maximum
                maxAverage = average; 
            }
        }
        System.out.println(maxAverage); // output maxAverage
    }
}
