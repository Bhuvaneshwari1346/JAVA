public class Binarytree {class Node {
    int data;
    Node left, right;

    public Node(int data)
    {
        this.data = data; 
        left = right = null;
    }
    
}

class BinaryTree{
    Node root;

    BinaryTree(){
        root=null;
    }

    Node insert(Node node, int data){
        if(node == null){
            node == New Node(data);
            return node;

        }

        if(data<node.data)
        {
            node.left =  insert(node.left,data);

        }
        elseif(data>node.data)
        {
            node.right = insert(node.right,data);
        }

        return node;
    }

    void inorderTraversal(Node node){
        if(node!=null){
            inorderTraversal(node.left);
            System.out.println(node.data+" ");
            inorderTraversal(node.right);
        }
    }

    void preorderTraversal(Node node){
        if(node!=null){
            System.out.println(node.data+" ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    void postorderTraversal(Node node){
        if(node!=null){
           
            preorderTraversal(node.left);
            preorderTraversal(node.right);
            System.out.println(node.data+" ");
        }
    }

    Node search(Node root,int key){
        if(root==null||root.data==key)
        return root;

        if(root.data<key)
        return search(root.right,key);
    }

    public static void main(String[]args){
        BinaryTree tree = new BinaryTree();
        tree.root = tree.insert(tree.root, data:5);
        tree.insert(tree.root, data:3);
        tree.insert(tree.root, data:2);
        tree.insert(tree.root, data:4);
        tree.insert(tree.root, data:1);
        tree.insert(tree.root, data:7);
        tree.insert(tree.root, data:6);

        System.out.println("Inorder traversal of the tree:");
        tree.inorderTraversal(tree.root);

        System.out.println("Preorder traversal of the tree:");
        tree.postorderTraversalorderTraversal(tree.root);

        System.out.println("Postorder traversal of the tree:");
        tree.postorderTraversal(tree.root);

        System.out.printyln("Search for node with value 4:");
        Node result = tree
    }
}
    
}
