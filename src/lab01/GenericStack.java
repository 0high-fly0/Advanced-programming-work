package lab01;

import java.util.*;

public class GenericStack<E> {
  E[] list;
  int max=100;
  int len=0;

  public GenericStack(){
    max=100;
    len=0;
    list=(E[]) new Object[max];
  }

  public GenericStack(int max){
    this.max=max;
    len=0;
    list=(E[]) new Object[max];
  }

  public int getSize() {
    return len+1;
  }

  public E peek() {
    return list[len];
  }

  public void push(E o) {
    if (len+1==max){
      E[] list1=(E[]) new Object[max*2];
      for (int i=0;i<max;i++){
        list1[i]=list[i];
      }
      this.max=this.max*2;
      this.list=list1;
    }
    len++;
    list[len]=o;
  }

  public E pop() {
    E o = list[getSize() - 1];
    len=len-1;
    return o;
  }

  public boolean isEmpty() {
    return len==0?true:false;
  }
  
  @Override
  public String toString() {
	return "stack: " + Arrays.toString(list);
  }

  public E get(int i){
    return list[i];
  }

  public void set(int i,E x){
    this.list[i]=x;
  }

  public static void main(String[] args) {
    GenericStack<Integer> x=new GenericStack<Integer>();
    x.push(10);
    System.out.println(x.peek());
  }
}
