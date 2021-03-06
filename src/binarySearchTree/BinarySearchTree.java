package binarySearchTree;

class BinarySearchTree {
	 
    /**
     * Class containing left and right child of current node  and key value
     */
    class Node {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
 
    /**
     *  Root of my Binary Search Tree
     */
    Node root;
 

    BinarySearchTree() { 
    		root = null;
    	}
 
    BinarySearchTree(int value) {
    	root = new Node(value);
    	}
 
    /**
     * This method mainly calls insertRec()
     * @param key 
     */
    void insert(int key) { 
    		root = insertRec(root, key); 
    	}
 
    /**
     * A recursive function to insert a new key in BST
     * 
     **/
    Node insertRec(Node root, int key)
    {
 
        /**
         * If the tree is empty, and return a new node 
           */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /**
         *  recur down the tree 
         **/
        
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
 
        /**
         *  return the node pointer 
         **/
        return root;
    }
    
    /**
     *  This method calls print()
     */
    void print() {
    	printRec(root); 
    }
 
    void printRec(Node root)
    {
        if (root != null) {
        	printRec(root.left);
            System.out.println(root.key);
            printRec(root.right);
        }
    }
 
    
    /**
     * Adding my New Element to the BST
     * @param args
     */
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
 
        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        
        
        tree.print();
       }
}