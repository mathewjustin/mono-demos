package BasicAlgorithms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@ToString
@Data
public class BinaryTree {
    private static Node root;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @ToString
    static class Node {
        Node left;
        Node right;
        int val;
    }



    public static ArrayList<Integer> inorder()
    {
        return inorder(root,new ArrayList<Integer>());
    }

    public static ArrayList<Integer> postorder()
    {
        return postOrder(root,new ArrayList<Integer>());
    }

    public static ArrayList<Integer> preOrder()
    {
        return preOrder(root,new ArrayList<Integer>());
    }

    private static ArrayList<Integer> preOrder(Node root, ArrayList<Integer> preOrderList) {

        if(root==null)
        {
            return preOrderList;
        }

        preOrderList.add(root.getVal());
        preOrder(root.left,preOrderList);
        preOrder(root.right,preOrderList);
        return preOrderList;
    }

    public static ArrayList<Integer> inorder(Node root, ArrayList<Integer>inorderList)
     {
          if(root==null)
          {
              return inorderList;
          }
          inorder(root.left,inorderList);
          inorderList.add(root.getVal());
          inorder(root.right,inorderList);
          return inorderList;
     }

    public static ArrayList<Integer> postOrder(Node root, ArrayList<Integer>postOrderlist)
    {
        if(root==null)
        {
            return postOrderlist;
        }
        postOrder(root.left,postOrderlist);
        postOrder(root.right,postOrderlist);
        postOrderlist.add(root.getVal());
        return postOrderlist;
    }




     public static void add(int val)
     {
     root=insert(val,root);
     }

    public static Node insert(int i,Node rootNode){

        if(rootNode==null)
        {
            return new Node(null,null,i);
        }

            if(i<rootNode.getVal())
            {
                rootNode.left= insert(i,rootNode.left);
            }else if(i>rootNode.getVal())
            {
                rootNode.right=insert(i,rootNode.right);
            }else
            {
                return rootNode;
            }
            return rootNode;


    }

}
