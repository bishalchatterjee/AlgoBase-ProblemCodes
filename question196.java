//Check if Binary Tree is Isomorphic
//constructor class
class Node
{
    int key;
    Node left;
    Node right;
    Node(int k){
        key=k;
        left=right=null;
    }
}
public class question196 {

    public static boolean isIsomorphic(Node root1,Node root2)
    {
        if(root1==null && root2==null) return true;  //if the first value if null then it's empty and isomorphic
        if(root1==null || root2==null) return false; // if either of them is null it's not isomorphic
        if(root1.key!=root2.key)return false; //checking root key/data for equality
        boolean a =isIsomorphic(root1.left,root2.left) && isIsomorphic(root1.right,root2.right);//checking if the roots are same
        boolean b =isIsomorphic(root1.left,root2.right) && isIsomorphic(root1.right,root2.left);//checking if the left key of root1 equals to right key of root2 and vise versa
        return a||b;
    }
    //driver code
    public static void main(String args[])
    {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        root1.left.left=new Node(4);

        Node root2=new Node(1);
        root2.left=new Node(3);
        root2.right=new Node(2);
        root2.right.right=new Node(4);

        System.out.print(isIsomorphic(root1,root2));
    }

}
//T.C- O(H)
//S.C- O(H)