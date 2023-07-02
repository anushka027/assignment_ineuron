 class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majorityElement = 0;

        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
                count++;
            } else if (num == majorityElement) {
                count++;
            } else {
                count--;
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majority = solution.majorityElement(nums);
        System.out.println("Majority Element: " + majority);
    }
}