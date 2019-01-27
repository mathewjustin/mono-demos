import BasicAlgorithms.BinaryTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTreeTest {
    BinaryTree bt=null;
    @Before
    public void fillInBinTree()
    {
        BinaryTree bt=new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
    }

    @Test
    public void inorderTest()
    {
        ArrayList<Integer> inorder = bt.inorder();
        Assert.assertEquals(Arrays.asList(3, 4, 5, 6, 7, 8, 9),inorder);
    }

    @Test
    public void postorderTest()
    {
        ArrayList<Integer> postorder = bt.postorder();
        System.out.println(postorder);
        Assert.assertEquals(Arrays.asList(3, 5, 4, 7, 9, 8, 6),postorder);
    }

    @Test
    public void preorderTest()
    {
        ArrayList<Integer> postorder = bt.preOrder();
        Assert.assertEquals(Arrays.asList(6,4,3,5,8,7,9),postorder);
    }

}
