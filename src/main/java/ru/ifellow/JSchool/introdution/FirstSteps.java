package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return xLeft <= x && x <= xRight && yBottom <= y && y <= yTop;
    }

    public int sum(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public int mul(int[] array){
        if (array.length == 0) return 0;

        int prod = 1;
        for (int j : array) {
            prod  *= j;
        }
        return prod;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) min = j;
        }
        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) max = j;
        }
        return max;
    }

    public double average(int[] array){
        if (array.length == 0) return 0;
        return (double)sum(array) / (double)array.length;
    }

    public boolean isSortedDescendant(int[] array){
        for (int i = 1; i < array.length; i++){
            if (array[i - 1] <= array[i]) return false;
        }
        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
    }

    public boolean find(int[]array, int value){
        for (int j : array) {
            if (j == value) return true;
        }
        return false;
    }

    public void reverse(int[]array){
        int temp;
        for (int i = 0, j = array.length - 1; i <= j; i++, j--){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public boolean isPalindrome(int[]array){
        for (int i = 0, j = array.length - 1; i <= j; i++, j--){
            if (array[i] != array[j]) return false;
        }
        return true;
    }

    public int sum(int[][] matrix){
        int sum = 0;
        for (int[] arr : matrix) {
            sum += sum(arr);
        }
        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;
        int temp;
        for (int[] arr : matrix) {
            temp = max(arr);
            if (max < temp) max = temp;
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++){
            try {
                if (max < matrix[i][i]) max = matrix[i][i];
            }
            catch (ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for (int[] arr : matrix) {
            if (!isSortedDescendant(arr)) return false;
        }
        return true;
    }

}
