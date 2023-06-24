public class EighthProgram {
    private int[] buffer;
    private int value;
    private int k;
    private int currentIndex;

    public EighthProgram(int value, int k) {
        buffer = new int[k];
        this.value = value;
        this.k = k;
        currentIndex = 0;
    }

    public boolean consec(int num) {
        buffer[currentIndex] = num;
        currentIndex = (currentIndex + 1) % k;

        if (currentIndex == 0) {
            for (int i = 0; i < k; i++) {
                if (buffer[i] != value) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}