class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Checking if an array is sorted\n");
        int[] numArr = ArrayUtility.inputArray();

        boolean increasing = isIncreasing(numArr);
        boolean decreasing = isDecreasing(numArr);
        if (increasing || decreasing) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }

    public static boolean isDecreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] > numArr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isIncreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] < numArr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
