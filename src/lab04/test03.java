package lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] metrx=new int[10][10];
        int n=10;
        List<List<Integer>> ones=new ArrayList<List<Integer>>();
        for (int i=0;i<10;i++){
            String[] x=input.nextLine().split(" ");
            List<Integer> FirstRow=new ArrayList<Integer>();
            FirstRow.add(i);
            for (int j=0;j<10;j++){
                metrx[i][j]= Integer.parseInt(x[j]);
                if (Integer.parseInt(x[j])==1) {
                    FirstRow.add(j);
                }
            }
            ones.add(FirstRow);
        }
        int maxsize=0,startx=0,starty=0,endx=0,endy=0;
        for (List<Integer> e:ones){
            for (int i=1;i<e.size();i++){
                for (int k=e.get(0);k<10;k++){
                    for (int j=1;j<ones.get(k).size();j++){
                        if (ones.get(k).get(j)<=e.get(i)) continue;
                        else if ((k-e.get(0)+1)*(ones.get(k).get(j)-e.get(i)+1)<maxsize) continue;
                        else if (is_ones(metrx,e.get(0),e.get(i),k,ones.get(k).get(j))) {
                            maxsize=(k-e.get(0)+1)*(ones.get(k).get(j)-e.get(i)+1);
                            startx=e.get(0);
                            starty=e.get(i);
                            endx=k;
                            endy=ones.get(k).get(j);
//                            System.out.println("("+startx+","+starty+") to ("+endx+","+endy+"),maxsize="+maxsize);
                        }
                        else continue;
                    }
                }
            }
        }
        System.out.println("("+startx+","+starty+") to ("+endx+","+endy+"),maxsize="+maxsize);
    }
    public static boolean is_ones(int[][] metrx, int startx, int starty, int endx, int endy) {
        boolean flag = true;
        for (int i=startx;i<=endx&&flag;i++){
            for (int j=starty;j<=endy;j++) {
                if (metrx[i][j] == 0) {
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
}

//1 0 0 1 1 1 1 1 0 1
//1 1 1 1 0 0 0 0 0 0
//0 1 0 1 0 1 0 0 0 0
//0 0 0 1 0 1 0 1 1 1
//1 0 1 1 1 0 0 0 0 1
//0 1 1 1 1 1 0 1 1 0
//1 1 1 1 1 1 0 0 1 1
//0 1 0 0 1 0 1 0 1 0
//0 1 0 0 0 1 1 0 0 1
//1 1 0 1 1 0 1 0 0 0
