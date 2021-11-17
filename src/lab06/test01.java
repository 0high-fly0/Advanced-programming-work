package lab06;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class test01 {	
	
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
	
	public static void main(String[] args) {
		GenericStack<Integer> stack =new GenericStack<Integer>();
		int num=0;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		int x=2;
		while (stack.getSize()<num) {
			if (su(x)) stack.push(x);
			x++;
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
		
	}

}

