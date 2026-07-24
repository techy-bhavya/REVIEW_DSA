import java.util.*;

public class treeBasic {

    // Structure of one generic tree node
    static class TreeNode {
        int data;
        ArrayList<TreeNode> children;

        public TreeNode(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    // Constructs the generic tree using the given array
    public static TreeNode constructTree(int[] dataArray) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = null;

        for (int value : dataArray) {

            // -1 means the current node is completed
            if (value == -1) {
                stack.pop();
            } else {
                // Create a new node
                TreeNode newNode = new TreeNode(value);

                // Empty stack means this is the root node
                if (stack.isEmpty()) {
                    root = newNode;
                } else {
                    // Stack's top node is the parent
                    TreeNode parent = stack.peek();
                    parent.children.add(newNode);
                }

                // Push the new node because upcoming nodes
                // may be its children
                stack.push(newNode);
            }
        }

        return root;
    }
    
    //Returns total no of nodes in tree
    public static int getSize(TreeNode root){
        int totalSize = 0;
        for(TreeNode child: root.children){
            totalSize += getSize(child);
        }
        return totalSize + 1;
    }
    
    //Returns maximum value in tree
    public static int getMax(TreeNode root){
        int maximum = root.data;
        for(TreeNode child: root.children){
            int childMaximum = getMax(child);
            maximum = Math.max(maximum, childMaximum);
        }
        return maximum;
    }

    // Displays every node along with its direct children
    public static void display(TreeNode root) {
        System.out.print(root.data + "->");
        
        for(TreeNode child : root.children){
            System.out.print(child.data+ ", ");
        }
        System.out.println();
        for(TreeNode child: root.children){
            display(child);
        }
    }
    
    public static int getHeight(TreeNode root){
        if(root==null){
            return -1;
        }
        int treeHeight = -1;
        for(TreeNode child: root.children){
            int childHeight = getHeight(child);
            treeHeight = Math.max(treeHeight, childHeight);
        }
        return treeHeight + 1;
    }

    public static void main(String[] args) {

        int[] dataArray = {
            10,
                20,
                    50, -1,
                    60, -1,
                -1,

                30,
                    70, -1,
                -1,

                40,
                    80, -1,

                    90,
                        110, -1,
                        120, -1,
                    -1,

                    100, -1,
                -1,
            -1
        };

        // Construct the tree
        TreeNode root = constructTree(dataArray);

        // Display the tree
        System.out.println("Generic Tree:");
        display(root);
        
        System.out.println("Size: "+ getSize(root));
        System.out.println("Maximum: "+getMax(root));
        System.out.println("Height: "+getHeight(root));
    }
}