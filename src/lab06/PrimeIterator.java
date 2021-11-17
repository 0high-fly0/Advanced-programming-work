package lab06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PrimeIterator implements Iterable<Integer>{
    private int max=0;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    List<Integer> data=new ArrayList<Integer>();
    PrimeIterator(int n){
        this.max=n;
        int x=2;
        while (data.size()<this.max){
            if (su(x)){
                data.add(x);
            }
            x++;
        }
    }

    public static boolean su(int x) {
        if (x==1) return false;
        if (x==2) return true;
        for (int i=2;i<Math.sqrt(x)+1;i++) {
            if (x%i==0) {
                return false;
            }
        }

        return true;
    }

    int itr=0;

    public Iterator<Integer> iterator(){
        return new Iterator<Integer>(){

            private int curror = -1;

            public boolean hasNext() {
                return curror+1 < max;
            }

            public Integer next() {
                curror++;
                return data.get(curror);
            }
        };
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        PrimeIterator p=new PrimeIterator(input.nextInt());
        Iterator<Integer> Iterator=p.iterator();
        while (Iterator.hasNext()){
            System.out.print(Iterator.next()+" ");
        }
    }


}
