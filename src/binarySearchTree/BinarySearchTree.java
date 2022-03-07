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
    static Node root;
 

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
    
    
    public void search(int data) {
		if (searchAll(root, data))
			System.out.println("Given " + data + " node is present in the tree ");
		else
			System.out.println(" Given " + data + " node is not present in the tree");
	}

	public boolean searchAll(Node root, int data) {

		if (root == null)
			return false;
		if (root.key == data)
			return true;
		else
			return searchAll(root.left, data) || searchAll(root.right, data);
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
        
        /** Let us create following BST
           56
     	/     \
       30      70
   	   /  \    /  \
     22   40  60   95
     /		  \	
    11		  65	
    / \  	  /	\
   3   16	 63	 67	
     
     **/

        tree.insert(56);
        tree.insert(30);
        tree.insert(22);
        tree.insert(40);
        tree.insert(11);
        tree.insert(3);
        tree.insert(16);
        tree.insert(70);
        tree.insert(60);
        tree.insert(95);
        tree.insert(65);
        tree.insert(63);
        tree.insert(67);
        
        
        tree.print();
        tree.search(63);
        
      
       }
}