package Trees.Adelson_Velsky_Landis;

public class AVL_MK2 {
        private static class Node {
            int val;
            int height;
            Node l;
            Node r;

            Node(int val) {
                this.val = val;
                this.height = 1;
            }
        }

        private Node root;

        public AVL_MK2() {
            root = null;
        }

        public AVL_MK2(int val) {
            root = new Node(val);
        }

        public void insertion(int val) {
            root = insert(root, val);
        }

        private Node insert(Node node, int val) {
            if (node == null) {
                return new Node(val);
            }

            if (val < node.val) {
                node.l = insert(node.l, val);
            } else if (val > node.val) {
                node.r = insert(node.r, val);
            }

            node.height = Math.max(nodeHeight(node.l), nodeHeight(node.r)) + 1;
            return isBalanced(node);
        }

        private Node isBalanced(Node node) {
            int balance = nodeHeight(node.l) - nodeHeight(node.r);

            if (balance > 1) { // left heavy
                if (nodeHeight(node.l.l) >= nodeHeight(node.l.r)) { // left left
                    return rightRotate(node);
                } else { // left right
                    node.l = leftRotate(node.l);
                    return rightRotate(node);
                }
            } else if (balance < -1) { // right heavy
                if (nodeHeight(node.r.r) >= nodeHeight(node.r.l)) { // right right
                    return leftRotate(node);
                } else { // right left
                    node.r = rightRotate(node.r);
                    return leftRotate(node);
                }
            }

            return node;
        }

        private Node leftRotate(Node parent) {
            Node child = parent.r;
            parent.r = child.l;
            child.l = parent;
            parent.height = Math.max(nodeHeight(parent.l), nodeHeight(parent.r)) + 1;
            child.height = Math.max(nodeHeight(child.l), nodeHeight(child.r)) + 1;
            return child;
        }

        private Node rightRotate(Node parent) {
            Node child = parent.l;
            parent.l = child.r;
            child.r = parent;
            parent.height = Math.max(nodeHeight(parent.l), nodeHeight(parent.r)) + 1;
            child.height = Math.max(nodeHeight(child.l), nodeHeight(child.r)) + 1;
            return child;
        }

        public boolean isEmpty() {
            return root == null;
        }

        public void Display() {
            prettyDisplay(root, 0);
        }

        private void prettyDisplay(Node node, int level) {
            if (node == null) {
                return;
            }

            prettyDisplay(node.r, level + 1);

            if (level != 0) {
                for (int i = 0; i < level - 1; i++) {
                    System.out.print("|\t\t");
                }
                System.out.println("|------->" + node.val);
            } else {
                System.out.println(node.val);
            }
            prettyDisplay(node.l, level + 1);
        }

        private int nodeHeight(Node node) {
            return node == null ? 0 : node.height;
        }
    public int nodeHeight() {
        return root.height;
    }
    }
