package lab04;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int maxlen=0;
		int maxindex=0;
		int maxnum=0;
		int prelen=0;
		int preindex=0;
		int prenum=0;
		int index=0;
		while (1+1==2) {
			int x=input.nextInt();
			if (x==0) {
				if (prelen>maxlen) {
					maxindex=preindex;
					maxlen=prelen;
					maxnum=prenum;
				}
				break;
			}
			if (x==prenum) {
				prelen++;
			}else {
				if (prelen>maxlen) {
					maxindex=preindex;
					maxlen=prelen;
					maxnum=prenum;
				}
				preindex=index;
				prelen=1;
				prenum=x;
			}
			index++;
		}
		System.out.print("The longest same number sequence starts at index "+maxindex+" with "+maxlen+" values of "+maxnum);
	}

}
