
public class Tree {
	public static class StringTree {
        class Node {
                String value = "";
                Node left;
                Node right;

 
                Node(String word) {
                        value = word;
                        left = null;
                        right = null;
                }
                Node(String word, Node left1, Node right1) {
                        value = word;
                        left = left1;
                        right = right1;
                }
        }

 
        private Node root;
        public void add(String word) {
                Node temp = new Node(word);
                if (root == null) {
                        root = temp;
                } else {
                        Node p = root;
                        Node prev = root;
                        while (p != null) {
                                prev = p;
                                int cmpP = word.compareTo(p.value);
                                if (cmpP < 0) {
                                        p = p.left;
                                } else {
                                        p = p.right;
                                }
                        }
                        int cmpPrev = word.compareTo(prev.value);
                        if (cmpPrev > 0) {
                                prev.right = temp;
                        } else {
                                prev.left = temp;
                        }
                }
        }
        private void inOrder(Node binTree) {
                if (binTree != null) {
                        inOrder(binTree.left);
                        System.out.print(binTree.value + " ");
                        inOrder(binTree.right);
                }
        }
        public void printTree() {
                inOrder(root);
        }
        public static void main(String[] args) {
                StringTree tree = new StringTree();
                tree.add("ashwani");
                tree.add("rajesh");
                tree.add("pooja");
                tree.add("aakash");
                tree.printTree();
        }
}
}
