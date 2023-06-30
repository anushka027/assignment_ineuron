public class ThirdProgram {

    public static boolean isLevelOrderBST(int[] levelOrder) {
        if (levelOrder == null || levelOrder.length <= 1) {
            return true;
        }

        int n = levelOrder.length;
        int leftChildIndex = -1;
        int rightChildIndex = -1;

        for (int i = 1; i < n; i++) {
            if (levelOrder[i] < levelOrder[0]) {
                if (rightChildIndex != -1 && levelOrder[i] > levelOrder[rightChildIndex]) {
                    return false;
                }
                leftChildIndex = i;
            } else {
                if (leftChildIndex != -1 && levelOrder[i] < levelOrder[leftChildIndex]) {
                    return false;
                }
                rightChildIndex = i;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] levelOrder1 = {7, 4, 12, 3, 6, 8, 15};
        boolean result1 = isLevelOrderBST(levelOrder1);
        System.out.println("Is level order BST? " + result1); // Output: true

        int[] levelOrder2 = {7, 4, 12, 3, 8, 6, 15};
        boolean result2 = isLevelOrderBST(levelOrder2);
        System.out.println("Is level order BST? " + result2); // Output: false
    }
}
