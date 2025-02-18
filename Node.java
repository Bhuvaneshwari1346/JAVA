public class Node {
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BinaryTree{
    Node root;
    BinaryTree(){
        root=null;
    }
}
Node insert(Node node,int data){
    if (node==null) {
        node=new Node(data);
        return node;     
    }
if(data<node.data){
    node.left = insert(node.left,data);
} else if(data>node.data){
    node.right = insert(node.right,data);
}
return node;
}
void inorderTraversal(Node node){
    if(node != null){
        inorderTraversal(node.left);
        System.out.println(node.data+" ");
        inorderTraversal(node.right);
}
}
void preorderTraversal(Node node){
    if(node != null){
        preorderTraversal(node.data+" ");
        System.out.println(node.left);
        preorderTraversal(node.right);
}
}
void postorderTraversal(Node node){
    if(node != null){
        postorderTraversal(node.left);
        System.out.println(node.right);
        postorderTraversal(node.data+"");
}
}
Node search(Node root,int key){
    if(root==null||root,data==key)
    return root;
    if(root.datakey)
    return search(root.right,key);
}
public static void main(string[] args)
BinaryTree tree= new BinaryTree();
tree.root=tree.insert(tree.root,data:5);
tree.insert(tree.root,data:3);
tree.insert(tree.root,data:2);
tree.insert(tree.root,data:4);
tree.insert(tree.root,data:1);
tree.insert(tree.root,data:7);
tree.insert(tree.root,data:6);
System.out.println(x:"inorder traversal of the tree");
System.out.println(x:"\npreorder traversal of the tree");
System.out.println(x:"\npostorder traversal of the tree");
System.out.println("\n search for node with value");
if(result!=null)
System.out.println("Node found"+result.data);
else
system.out.println("Node notfound")