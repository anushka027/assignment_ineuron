class UglyNumber {
    public int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int pointer2 = 0, pointer3 = 0, pointer5 = 0;

        for (int i = 1; i < n; i++) {
            int nextUglyNumber = Math.min(uglyNumbers[pointer2] * 2, Math.min(uglyNumbers[pointer3] * 3, uglyNumbers[pointer5] * 5));
            uglyNumbers[i] = nextUglyNumber;

            if (nextUglyNumber == uglyNumbers[pointer2] * 2) {
                pointer2++;
            }
            if (nextUglyNumber == uglyNumbers[pointer3] * 3) {
                pointer3++;
            }
            if (nextUglyNumber == uglyNumbers[pointer5] * 5) {
                pointer5++;
            }
        }

        return uglyNumbers[n - 1];
    }

    public static void main(String[] args) {
        UglyNumber solution = new UglyNumber();

        int n = 10;
        int nthUgly = solution.nthUglyNumber(n);
        System.out.println("The " + n + "th Ugly Number: " + nthUgly);
    }
}