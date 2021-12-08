package lab12;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test12 {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor=Executors.newCachedThreadPool();

        executor.execute(new AddAPennyTask());

        while (1+1==2){
            executor.execute(new Buy());
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
            }
        }

//        executor.shutdown();
//        while (!executor.isTerminated()){}
//
//        System.out.println("Ê£Óà¿â´æÎª£º"+account.getStock());


    }

    private static class AddAPennyTask implements Runnable{
        public void run(){
            while (1+1==2) {
                account.Add(10);
                System.out.println("¿â´æÌí¼Ó³É¹¦");            }
            }
    }

    private static class Buy implements Runnable{
        @Override
        public void run() {
            Random random = new Random();
            account.Reduce(random.nextInt(5)+1);
        }
    }

    private static class Account {
//        private static Lock lock=new ReentrantLock();;
        private int stock=0;

        public int getStock() {
            return stock;
        }

        public void Add(int number){

//            for (int i =0;i<10;i++) {
//                lock.lock();
                int newstock = stock + number;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {

                }
                stock = newstock;
//                lock.unlock();
//            }
        }

        public void Reduce(int number){
//            lock.lock();
            int newstock=stock-number;
            try {
                Thread.sleep(1);
            }catch (InterruptedException ex){

            }
            if (newstock<0){
                System.out.println("¿â´æ²»×ã£¬¹ºÂòÊ§°Ü£¡");
            }else {
                System.out.println("ÃëÉ±³É¹¦,¹²ÃëÉ±"+number+"¼þ");
                stock=newstock;
            }
//            lock.unlock();
        }



    }
}
