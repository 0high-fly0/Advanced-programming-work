package lab01.Test02;


public class test02 {
    public static void main(String[] args) {
        student[] s=new student[20];
        for (int i=0;i<20;i++){
            student a=new student(String.valueOf((int)(1+Math.random()*(99-10+1))));
            s[i]=a;
        }

        SortUtils.sort(s);

        for (int i=0;i<20;i++){
            System.out.print(s[i].toString());
        }

        System.out.println("");

        Teacher[] t=new Teacher[20];
        for (int i=0;i<20;i++){
            Teacher a=new Teacher(String.valueOf((int)(1+Math.random()*(99-10+1))));
            t[i]=a;
        }

        SortUtils.sort(t);

        for (int i=0;i<20;i++){
            System.out.print(t[i].toString());
        }
    }






}
