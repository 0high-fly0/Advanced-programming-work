package lab02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class text02 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        Scanner input=new Scanner(System.in);
//        String[] inString=input.nextLine().split(" ");
        String ins=input.nextLine();
        ins=ins.replace("(", " ( ");
        ins=ins.replace(")", " ) ");
        ins=ins.replace("+", " + ");
        ins=ins.replace("-", " - ");
        ins=ins.replace("*", " * ");
        ins=ins.replace("/", " / ");
        List<String> inString=new ArrayList<String>();
        Scanner sss=new Scanner(ins);
        while (sss.hasNext()) {
            inString.add(sss.next());
        }
        for (String e:inString){
            if (Character.isDigit(e.charAt(0)))//判断是否为数字字符
                stack.push(Integer.valueOf(e));
            else {
                if (stack.empty()||stack.size()==1||!(e.equals("*")||e.equals("/")||e.equals("+")||e.equals("-"))) {
                    System.out.println("异常输入");
                    break;
                }
                int x=stack.pop();
                switch (e){
                    case "+":
                        x=x+stack.pop();
                        stack.push(x);
                        break;
                    case "-":
                        x=stack.pop()-x;
                        stack.push(x);
                        break;
                    case "*":
                        x=x*stack.pop();
                        stack.push(x);
                        break;
                    case "/":
                        x=stack.pop()/x;
                        stack.push(x);
                        break;
                }
            }
        }
        System.out.print(stack.pop());
    }

}
