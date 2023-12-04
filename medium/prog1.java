public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class LowestCommonAncestorBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        int rootVal = root.val;
        int pVal = p.val;
        int qVal = q.val;

       
        if (pVal < rootVal && qVal < rootVal) {
            return lowestCommonAncestor(root.left, p, q);
        }
       
        else if (pVal > rootVal && qVal > rootVal) {
            return lowestCommonAncestor(root.right, p, q);
        }
    
        else {
            return root;
        }
    }

    public static void main(String[] args) {
       
        TreeNode root1 = new TreeNode(6);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(8);
        root1.left.left = new TreeNode(0);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(7);
        root1.right.right = new TreeNode(9);
        root1.left.right.left = new TreeNode(3);
        root1.left.right.right = new TreeNode(5);

        LowestCommonAncestorBST lcaFinder = new LowestCommonAncestorBST();
        TreeNode result1 = lcaFinder.lowestCommonAncestor(root1, new TreeNode(2), new TreeNode(8));
        System.out.println("Output 1: " + result1.val);  // Output should be 6

        
        TreeNode root2 = new TreeNode(6);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(8);
        root2.left.left = new TreeNode(0);
        root2.left.right = new TreeNode(4);
        root2.right.left = new TreeNode(7);
        root2.right.right = new TreeNode(9);
        root2.left.right.left = new TreeNode(3);
        root2.left.right.right = new TreeNode(5);

        TreeNode result2 = lcaFinder.lowestCommonAncestor(root2, new TreeNode(2), new TreeNode(4));
        System.out.println("Output 2: " + result2.val);  // Output should be 2

        // Example 3
        TreeNode root3 = new TreeNode(2);
        root3.left = new TreeNode(1);

        TreeNode result3 = lcaFinder.lowestCommonAncestor(root3, new TreeNode(2), new TreeNode(1));
        System.out.println("Output 3: " + result3.val);  // Output should be 2
    }
}
