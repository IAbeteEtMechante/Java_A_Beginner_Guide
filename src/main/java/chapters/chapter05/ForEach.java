package chapters.chapter05;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int i = 0;
        for (; i < 10; i++) {
            nums[i] = i * i;
        }
        for (int value : nums) {
            System.out.println(value);
        }

    }
}
