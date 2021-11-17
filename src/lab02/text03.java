package lab02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class text03 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        List<String> list=new ArrayList<String>();
        Scanner input=new Scanner(System.in);
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

            if (Character.isDigit(e.charAt(0)))//�ж��Ƿ�Ϊ�����ַ�
                list.add(e);
            else {
                switch (e){
                    case "(":
                        stack.push(e);
                        break;
                    case ")":
                        while (1+1==2){
                            String x=stack.pop();
                            if (x.equals("(")) break;
                            list.add(x);
                        }
                        break;
                    case "*":
                        if (stack.empty()||stack.peek().equals("+")||stack.peek().equals("-")||stack.peek().equals("(")) {//�����ջΪ�ջ���ջ�������������ȼ�С�ڵ�ǰ��������ȼ�ʱ��ֱ����ջ
                            stack.push(e);
                        }
                        else {//���������Ϊ��ʱ��ջ�������������ȼ����ڻ���ڵ�ǰ��������ȼ�ʱ��ѭ��ִ�г�ջ����������list�У�ֱ���������ȼ�С�ڵ�ǰ�������Ԫ��Ϊֹ��ѭ��ִ������ٽ���ǰ�����ѹջ��
                            while (!(stack.empty()||stack.peek().equals("+")||stack.peek().equals("-")||stack.peek().equals("("))){
                                String s=stack.pop();
                                list.add(s);
                            }
                            stack.push(e);
                        }
                        break;
                    case "/":
                        if (stack.empty()||stack.peek().equals("+")||stack.peek().equals("-")||stack.peek().equals("(")) {//�����ջΪ�ջ���ջ�������������ȼ�С�ڵ�ǰ��������ȼ�ʱ��ֱ����ջ
                            stack.push(e);
                        }
                        else {
                            while (!(stack.empty()||stack.peek().equals("+")||stack.peek().equals("-")||stack.peek().equals("("))){
                                String s=stack.pop();
                                list.add(s);
                            }
                            stack.push(e);
                        }
                        break;
                    case "+":
                        if (stack.empty()||stack.peek().equals("(")) {//�����ջΪ�ջ���ջ�������������ȼ�С�ڵ�ǰ��������ȼ�ʱ��ֱ����ջ
                            stack.push(e);
                        }
                        else {
                            while (!(stack.empty()||stack.peek().equals("("))){
                                String s=stack.pop();
                                list.add(s);
                            }
                            stack.push(e);
                        }
                        break;
                    case "-":
                        if (stack.empty()||stack.peek().equals("(")) {//�����ջΪ�ջ���ջ�������������ȼ�С�ڵ�ǰ��������ȼ�ʱ��ֱ����ջ
                            stack.push(e);
                        }
                        else {
                            while (!(stack.empty()||stack.peek().equals("("))){
                                String s=stack.pop();
                                list.add(s);
                            }
                            stack.push(e);
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        while (!stack.empty()){
            list.add(stack.pop());
        }
        for (int i=0;i<list.size()-1;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.print(list.get(list.size()-1));
    }


}
