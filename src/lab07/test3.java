package lab07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class test3 extends Main{
    public static void main(String[] args) {
        bst();
        avl();
    }
    public static void bst(){
        long startTime = 0;
        long endTime = 0;
        long executionTime =0;
        startTime = System.currentTimeMillis();

        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i=0;i<50000;i++){
            list.add(random.nextInt(50000));
        }
        BinaryTree<Integer> tree = new BinaryTree<Integer>(list);
        Collections.shuffle(list);
        for (Integer e:list){
            tree.search(e);
        }
        Collections.shuffle(list);
        for (Integer e:list){
            tree.delete(e);
        }
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("BST所花费的时间为："+executionTime);
    }

    public static void avl(){
        long startTime = 0;
        long endTime = 0;
        long executionTime =0;
        startTime = System.currentTimeMillis();

        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i=0;i<50000;i++){
            list.add(random.nextInt(50000));
        }
        AVLTree<Integer> tree = new AVLTree<Integer>(list);
        Collections.shuffle(list);
        for (Integer e:list){
            tree.search(e);
        }
        Collections.shuffle(list);
        for (Integer e:list){
            tree.delete(e);
        }
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("AVLTree所花费的时间为："+executionTime);
    }
}
