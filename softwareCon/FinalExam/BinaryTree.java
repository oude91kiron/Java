/*-------------------------------------------------------------------------------
Question 2 [50 Points]                                                          -
Randomly generate and insert 100 integers between 1 and 100000 into a BST       -
and calculate the depth of the final tree. Repeat this procedure 100 times      -
and calculate and print the average depth of the trees.                         -
Random Number Generation Hint:                                                  -
                                                                                -
        private static int getRandomNumberInRange(int min, int max) {           -
	        	Random r = new Random();                        			    -
	        	return r.nextInt((max - min) + 1) + min;                		-
	}                                                                       	-
-------------------------------------------------------------------------------*/


//BinaryTree.java representing an integer BST

import java.util.Random;

public class BinaryTree {

      // attributes for storing the root node

      private Node root;

      // constructor

      public BinaryTree() {

            root = null;

      }

      // method to add a number to the tree, returns true if added successfully,
      // false if number already exists.

      public boolean add(int data) {

            // if root is null, adding as root node, otherwise calling recursive
            // method to add

            if (root == null) {

                  root = new Node(data);

                  return true;

            } else {

                  return add(data, root);

            }

      }

      // recursive method to add a number, after finding proper position

      private boolean add(int data, Node node) {

            if (node.data == data) {

                  return false;

            }

            // if data is smaller than node's data, moving to left subtree,
            // otherwise moving to right subtree

            else if (data < node.data) {

                  if (node.left == null) {

                        node.left = new Node(data);

                        return true;

                  } else {

                        // otherwise moving to left node recursively and adding at
                        // proper position

                        return add(data, node.left);

                  }

            } else {

                // if right subtree is null, adding as right node

                  if (node.right == null) {

                        node.right = new Node(data);

                        return true;

                  } else {

                        // otherwise moving to right node recursively and adding at
                        // proper position

                        return add(data, node.right);
                  }
            }
      }

      // method to find the depth of this BST

      public int depth() {

            // calling recursive helper method, passing root

            return depth(root);

      }

      // helper method to find the depth of this BST

      private int depth(Node node) {

            // if node is null, returning -1

            if (node == null) {

                  return -1;

            } else {

                  // otherwise finding depths of left and right subtrees

                  int left = depth(node.left);

                  int right = depth(node.right);

                  // adding 1 to the largest among left and right, returning it

                  return 1 + Math.max(left, right);
            }
      }

      // helper method to generate random number between a range

      private static int getRandomNumberInRange(int min, int max) {

            Random r = new Random();

            return r.nextInt((max - min) + 1) + min;

      }

      // Main method
      public static void main(String[] args) {

            int trials = 100;

            int numbers_count = 100;

            double depthOfFirtBST = 0.0;

            double sum_depth = 0.0;

            // looping for trials number of times

            for (int i = 0; i < trials; i++) {

                  // creating a BinaryTree

                  BinaryTree tree = new BinaryTree();

                  // looping for numbers_count times

                  for (int j = 0; j < numbers_count; j++) {

                        // generating an integer between 1 and 100000

                        int num = getRandomNumberInRange(1, 100000);

                        // adding to tree

                        tree.add(num);

                  }

                  // finding depth

                  int depth = tree.depth();

                  // depth of the first BST.

                  depthOfFirtBST = depth;

                  // adding to sum

                  sum_depth += depth;

            }

            System.out.println("depth: " + depthOfFirtBST);

            // calculating and displaying average depth

            double avg = (double) sum_depth / trials;

            System.out.println("Average depth: " + avg);

      }

}

// simple Node class to represent a single node.

class Node {

      int data;

      Node left, right;

      public Node(int data) {

            this.data = data;

      }

}