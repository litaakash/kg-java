class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Finding the maximum and minimum number in an array\n");
        int[] numArr = ArrayUtility.inputArray();

        int max = max(numArr);
        System.out.println("The maximum number is: " + max);

        int min = min(numArr);
        System.out.println("The minimum number is : " + min);

    }


    /*
    Integer.MAX_VALUE is a constant that represents the maximum possible value for a variable of type int. This value is 2^31 - 1, which is 2147483647. It's a large positive integer.

    When you initialize min to Integer.MAX_VALUE before starting to iterate through the array, you're essentially setting up a starting point that assumes any valid value in the array would be smaller than this initial value. This is a common technique used when searching for the minimum value in an array.

    By choosing Integer.MAX_VALUE as the initial value for min, you ensure that the first element in the array will always be smaller than min, allowing you to update min with the actual minimum value from the array as you iterate through it. It's a way of initializing the minimum value to a placeholder that guarantees any valid value in the array will be smaller, and then updating it based on the actual array elements during the loop.
    */
    public static int min(int[] numArr) {
        int min = Integer.MAX_VALUE;
        int i = 0;

        while (i < numArr.length) {
            if (min > numArr[i]){
                min = numArr[i];
            }
            i++;
        }
        return min;

    }
    public static int max(int[] numArr) {
        if(numArr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = numArr[0];
        int i = 1;

        while (i < numArr.length) {
            if (max < numArr[i]){
                max = numArr[i];
            }
            i++;
        }
        return max;
    }
}
