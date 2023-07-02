public class FirstProgram {
    static int calculateDepth(String preorder) {
        int[] index = {0}; // to keep track of the current index in the string
        return calculateDepthUtil(preorder, index);
    }

    static int calculateDepthUtil(String preorder, int[] index) {
        if (index[0] >= preorder.length()) {
            return 0;
        }

        char currentChar = preorder.charAt(index[0]);
        index[0]++; // increment index for the next recursive call

        if (currentChar == 'l') {
            return 0; // leaf node, depth is 0
        }

        // internal node, recursively calculate the depth of left and right subtrees
        int leftDepth = calculateDepthUtil(preorder, index);
        int rightDepth = calculateDepthUtil(preorder, index);

        // return the maximum depth between left and right subtrees plus 1
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        String preorder = "nlnll"; // example preorder traversal string

        int depth = calculateDepth(preorder);

        System.out.println("Depth of the binary tree: " + depth);
    }
}