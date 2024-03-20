import java.util.Arrays;

public class MatrixSearch {
  public static boolean searchMatrix(int[][] matrix, int target) {
    int row = 0;
    int col = matrix[0].length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == target) {
        return true;
      } else if (matrix[row][col] < target) {
        row++;
      } else {
        col--;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[][] matrix = {
      {1, 3, 5, 7},
      {2, 4, 6, 8},
      {9, 10, 11, 12}
    };

    System.out.println(searchMatrix(matrix, 10)); // true
    System.out.println(searchMatrix(matrix, 13)); // false
  }
}