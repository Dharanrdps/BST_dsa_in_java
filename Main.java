import java.util.*;

public class Main {
    static class Node {
        public int value;
        public Node leftchild;
        public Node rightchild;

        public Node(int value) {
            this.value = value;
            this.leftchild = null;
            this.rightchild = null;
        }
    }

    public Node root;

    public Main() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.leftchild = insertRecursive(node.leftchild, value);
        } else {
            node.rightchild = insertRecursive(node.rightchild, value);
        }

        return node;
    }

    public boolean search(int value) {
        Node current = this.root;
        while (current != null) {
            if (current.value == value) {
                return true;
            } else if (value < current.value) {
                current = current.leftchild;
            } else {
                current = current.rightchild;
            }
        }
        return false;
    }

    public List<Integer> inorder(Node node) {
        List<Integer> res = new ArrayList<>();
        inorderTraversal(node, res);
        return res;
    }

    public void inorderTraversal(Node node, List<Integer> res) {
        if (node != null) {
            inorderTraversal(node.leftchild, res);
            res.add(node.value);
            inorderTraversal(node.rightchild, res);
        }
    }

    public List<Integer> preorder(Node node) {
        List<Integer> res = new ArrayList<>();
        preorderTraversal(node, res);
        return res;
    }

    public void preorderTraversal(Node node, List<Integer> res) {
        if (node != null) {
            res.add(node.value);
            preorderTraversal(node.leftchild, res);
            preorderTraversal(node.rightchild, res);
        }
    }

    public List<Integer> postorder(Node node) {
        List<Integer> res = new ArrayList<>();
        postorderTraversal(node, res);
        return res;
    }

    public void postorderTraversal(Node node, List<Integer> res) {
        if (node != null) {
            postorderTraversal(node.leftchild, res);
            postorderTraversal(node.rightchild, res);
            res.add(node.value);
        }
    }

    public static void main(String[] args) {
        Main bs = new Main();
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        for (int i = 0; i < n; i++) {
            int a = ss.nextInt();
            bs.insert(a);
        }
        System.out.println("In-order:");
        List<Integer> inOrder_res = bs.inorder(bs.root);
        System.out.println(inOrder_res);
        System.out.println("Enter nth element  to print");
        int a=ss.nextInt();
        if(a<=n){
        System.out.println("The "+a+ " element is "+inOrder_res.get(a-1));
        }
        else{
            System.out.println("There is No "+a+" element");
        }
        System.out.println();
        System.out.println("Pre-order:");
        List<Integer> preOrder_res = bs.preorder(bs.root);
        System.out.println(preOrder_res);
        System.out.println("Enter nth element to print");
        int b=ss.nextInt();
        if(b<=n){
        System.out.println("The "+b+ " element is "+preOrder_res.get(b-1));
        }else{
            System.out.println("There is No "+b+" element");
        }
        System.out.println();
        System.out.println("Post-order:");
        List<Integer> postOrder_res = bs.postorder(bs.root);
        System.out.println(postOrder_res);
        System.out.println("Enter nth element to print");
        int c=ss.nextInt();
        if(c<=n){
        System.out.println("The "+c+ " element is " +postOrder_res.get(c-1));
        }
        else{
            System.out.println("There is No "+c+" element");
        }
    }
}
