package bst;

class BST {
	static BSTNode root;

	/**
	 * @author niranjanakotkar
	 * @param val
	 * @
	 */
	void Insert(int val) {
		if (root == null)
			root = new BSTNode(val);
		else
			Insert(root, val);
	}

	BSTNode Insert(BSTNode root, int value) {

		if (root == null) {
			root = new BSTNode(value);

		} else if (root.data > value)
			root.left = Insert(root.left, value);
		else
			root.right = Insert(root.right, value);

		return root;
	}

	void preorder(BSTNode r) {

		if (r != null) {

			System.out.println(r.getData() + " ");
			preorder(r.left);
			preorder(r.right);
		}
	}
}
