package Practice.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    static class Node{

        int key;
        Node left,right;

        Node(int key)
        {
            this.key = key;
            left = null;
            right = null;
        }
    }

    static Node root;
    static Node temp =root;

    static void insert(Node temp,int key)
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);
       System.out.println(queue.peek().key);

        while(!queue.isEmpty())
        {
            temp = queue.peek();
            queue.remove();

            if(temp.left == null)
            {
                temp.left = new Node(key);
                break;
            }
            else
                queue.add(temp.left);

            if(temp.right == null)
            {
                temp.right = new Node(key);
                break;
            }
            else
                queue.add(temp.right);
        }
    }

    public static void printInorderTree(Node node)
    {
        if(node == null)
            return;

        printInorderTree(node.left);
        System.out.print(node.key+"   ");
        printInorderTree(node.right);
    }

    public static void printPostorderTree(Node node) {
        if (node == null)
            return;
        printPostorderTree(node.left);
        printPostorderTree(node.right);
        System.out.print(node.key+"   ");
    }

    public static void printPreorderTree(Node node) {
        if (node == null)
            return;
        System.out.print(node.key+"   ");
        printPreorderTree(node.left);
        printPreorderTree(node.right);

    }
    public static void main(String [] args)
    {
       root = new Node(10);
       root.left=new Node(9);
       root.left.left=new Node(6);
       root.right=new Node(16);
       root.right.right= new Node(32);

        System.out.println("Printing Preorder Traversal of tree");
        printPreorderTree(root);
        System.out.println("Printing Inorder Traversal of tree");
        printInorderTree(root);
        System.out.println("Printing Postorder Traversal of tree");
        printPostorderTree(root);
    }
}
