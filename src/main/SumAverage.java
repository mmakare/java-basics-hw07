/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    // TODO fill in code here using for loop and replace the return statement
      int sum = 0;
    for (int i = lowerBound; i < upperBound + 1; i++) {
        sum += i;
    }
    return sum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    // TODO fill in code here using for each loop and replace the return statement
    int sum = 0;
    for (int element : numbers){
      sum += element;
    }
    return sum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    // TODO fill in code here using while loop and replace the return statement
      int count = 0;
      double average = 0;
      while (lowerBound <= upperBound){
          count++;
         average = average + lowerBound;
         lowerBound++;
         if (lowerBound < upperBound + 1){
             continue;
         }
         average = average / count;
         break;
      }

    return average;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    // TODO fill in code here using do-while loop and replace the return statement
    double average = 0;
    int i = 0;
    do {
      average += numbers[i];
      i++;
    } while (i <= numbers.length -1 );

    return average/numbers.length;
  }
}