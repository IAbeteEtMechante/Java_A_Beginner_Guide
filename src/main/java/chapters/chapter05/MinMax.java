package chapters.chapter05;

// Find the minimum and maximum values in an array.
class MinMax {
    public static void main(String[] args) {
        int[] nums = new int[10];

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        int min = nums[0];
        int max = nums[0];
        for (int val : nums) {
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
