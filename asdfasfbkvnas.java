//import javax.swing.tree.TreeNode;
//import java.util.*;
//
//public class asdfasfbkvnas {
//    class Solution {
//        public void construct_paths(TreeNode root, String path, LinkedList<String> paths) {
//            if (root != null) {
//                path += Integer.toString(root.val);
//                if ((root.left == null) && (root.right == null))  // if reach a leaf
//                    paths.add(path);  // update paths
//                else {
//                    path += "->";  // extend the current path
//                    construct_paths(root.left, path, paths);
//                    construct_paths(root.right, path, paths);
//                }
//            }
//        }
//
//        public List<String> binaryTreePaths(TreeNode root) {
//            LinkedList<String> paths = new LinkedList();
//            construct_paths(root, "", paths);
//            return paths;
//        }
//    }
//}
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    public List<String> binaryTreePaths(TreeNode root) {
//
//        TreeNode left = new TreeNode();
//        TreeNode right = new TreeNode();
//        TreeNode head = new TreeNode();
//        List res = new ArrayList();
//
//        traverse(head, "", res);
//        return res;
//    }
//
//
//
//
//    public void traverse(TreeNode head, String bstPath, List<String> res) {
//
//        if (head != null) {
//            bstPath += Integer.toString(head.val);
//
//            if(head.left == null && head.right == null) {
//                res.add(bstPath);
//
//            } else {
//                // bstPath += "->";
//                traverse (head.left, bstPath, res);e
//                traverse(head.right, bstPath, res);
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    private List arr = new ArrayList();
//
//    public boolean isUnivalTree(TreeNode root) {
//
//        TreeNode head = new TreeNode();
//
//        head = root;
//        dfs(head);
//        System.out.println(arr);
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(0) != arr.get(i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public void dfs (TreeNode head) {
//        if(head != null) {
//            dfs(head.left);
//            dfs(head.right);
//            System.out.print(head.val);
//            arr.add(head.val);
//        }
//    }
//}
//
//
//
//
//class Solution {
//    TreeNode cur;
//    public TreeNode increasingBST(TreeNode root) {
//        TreeNode ans = new TreeNode(0);
//        cur = ans;
//        inorder(root);
//        return ans.right;
//    }
//
//    public void inorder(TreeNode node) {
//        if (node == null) return;
//        inorder(node.left);
//        node.left = null;
//
//        cur.right = node;
//        cur = node;
//        inorder(node.right);
//    }
//}
//
//
//class Solution {
//    public LinkedList <Integer> res = new LinkedList();
//    public TreeNode increasingBST(TreeNode root) {
//        TreeNode head = new TreeNode();
//
//        head = root;
//
//        dfs (root);
//        System.out.println(res);
//
//        return root;
//    }
//    public TreeNode dfs(TreeNode head) {
//        if(head != null) {
//            TreeNode temp = new TreeNode();
//            res.add(head.val);
//            temp = dfs(head.left);
//            temp = dfs(head.right);
//            // if(head.right == null) {
//            //     res.add(head.val);
//            // }
//
//        }
//        return head;
//    }
//}
//
//
//
//
//class Solution {
//    public LinkedList <Integer> res = new LinkedList();
//    public TreeNode increasingBST(TreeNode root) {
//        TreeNode head = new TreeNode();
//
//        head = root;
//
//        dfs (root);
//        System.out.println(res);
//
//        return root;
//    }
//    public void dfs(TreeNode head) {
//
//        if (head == null) { return; }
//        dfs(head.left);
//        head.left = null;
//        head.right = head;
//        dfs(head.right);
//        head.right = null;
//    }
//}
//
//
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    public HashMap <TreeNode, Integer> map = new HashMap();
//    public PriorityQueue <TreeNode> q = new PriorityQueue((a, b) -> map.get(a) - map.get(b));
//
//    public int[] findMode(TreeNode root) {
//
//        if (root == null ) { return new int [0]; }
//        TreeNode head = new TreeNode();
//        head = root;
//        bst(root);
//        // keySet = (TreeNode) map.keySet();
//
//        System.out.println(map);
//        q.addAll(map.keySet());
//        System.out.println(q);
//
//        for(int i = 0; i < map.size(); i++) {
//            System.out.print(map.get(i));
//        }
//
//        TreeNode [] most = new TreeNode [1];
//        most[0] = q.peek();
//        return most;
//    }
//    public void bst (TreeNode head ) {
//        if(head != null) {
//            bst(head.left);
//            bst(head.right);
//            map.put(head, map.getOrDefault(head, 0)+1);
//        }
//    }
//}
//
//
//
//
//
//
//class Solution {
//public String shortestCompletingWord(String licensePlate, String[] words) {
//
//        HashMap <Character, Integer> map = new HashMap<>();
//        HashMap <Character, Integer> map2 = new HashMap<>();
//
//
//        // Format strings
//        String word = Arrays.toString(words).toLowerCase();
//        String plate = licensePlate.toString().toLowerCase();
//
//
//
//        for (char c : word.toCharArray()) {
//            map.put(c , map.getOrDefault(c, 0)+1);
//        }
//        for (char c : plate.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0)-1);
//        }
//
//    System.out.println("word " + word);
//    System.out.println("\n\nplate " + plate);
//    System.out.println("map -> " + map);
//
//
//        return licensePlate;
//        }
//}
//
//
//
