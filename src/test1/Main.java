package test1;

import java.util.ArrayList;
import java.util.Scanner;

interface GeneralStack<E> {
    public void push(E item);            //如item为null，则不入栈直接返回null。
    public E pop();                 //出栈，如为栈为空，则返回null。
    public E peek();//获得栈顶元素，如为空，则返回null.
    public boolean empty();//如为空返回true
    public int size();     //返回栈中元素数量

}

class ArrayListGeneralStack<E> implements GeneralStack<E>{
    private ArrayList<E> list=new ArrayList<E>();
    public void push(E item)//如item为null，则不入栈直接返回null。
    {
        this.list.add(item);
    }
    public E pop()                 //出栈，如为栈为空，则返回null。
    {
        if (this.list.size()==0)
            return null;
        E x=this.list.get(this.list.size()-1);
        list.remove(this.list.size()-1);
        return x;
    }
    public E peek()//获得栈顶元素，如为空，则返回null.
    {
        if (this.list.size()==0)
            return null;
        E x=this.list.get(this.list.size()-1);
        return x;
    }
    public boolean empty()//如为空返回true
    {
        if (this.list.size()==0)
            return true;
        else return false;
    }
    public int size()     //返回栈中元素数量
    {
        return this.list.size();
    }
    public String toString(){
        return this.list.toString();
    }
}

class Car{
    private int id;
    private String name;

    Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ']';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type = input.nextLine();
        while (!type.equals("quit"))
        {
            System.out.println(type + " Test");
            int m, n;
            m = input.nextInt();
            n = input.nextInt();
            if (type.equals("Integer")) {
                ArrayListGeneralStack<Integer> stack = new ArrayListGeneralStack<Integer>();
                for (int i = 0; i < m; i++) {
                    int X = input.nextInt();
                    System.out.println("push:" + X);
                    stack.push(X);
                }
                for (int i = 0; i < n; i++) {
                    int X = stack.pop();
                    System.out.println("pop:" + X);
                }
                System.out.println(stack.toString());
                int sum = 0;
                while (!stack.empty()) {
                    sum += stack.pop();
                }
                System.out.println("sum=" + sum);
                System.out.println(stack.getClass().getInterfaces()[0]);
            } else if (type.equals("Double")) {
                ArrayListGeneralStack<Double> stack = new ArrayListGeneralStack<Double>();
                for (int i = 0; i < m; i++) {
                    double X = input.nextDouble();
                    System.out.println("push:" + X);
                    stack.push(X);
                }
                for (int i = 0; i < n; i++) {
                    double X = stack.pop();
                    System.out.println("pop:" + X);
                }
                System.out.println(stack.toString());
                double sum = 0;
                while (!stack.empty()) {
                    sum += stack.pop();
                }
                System.out.println("sum=" + sum);
                System.out.println(stack.getClass().getInterfaces()[0]);
            } else if (type.equals("Car")) {
                ArrayListGeneralStack<Car> stack = new ArrayListGeneralStack<Car>();
                for (int i = 0; i < m; i++) {
                    int id = input.nextInt();
                    String name = input.nextLine();
                    Car car = new Car(id, name.trim());
                    System.out.println("push:" + car.toString());
                    stack.push(car);
                }
                for (int i = 0; i < n; i++) {
                    Car car = stack.pop();
                    System.out.println("pop:" + car.toString());
                }
                System.out.println(stack.toString());
                while (!stack.empty()) {
                    Car car = stack.pop();
                    System.out.println(car.getName());
                }
                System.out.println(stack.getClass().getInterfaces()[0]);
            }
            input.nextLine();
            type = input.nextLine();
        }
    }
}
