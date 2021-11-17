package lab04;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String xline="";
		xline=input.nextLine();
//		boolean flag=false;
		String maxString="";
		int maxlen=0;
		int nowlen=1;
		String nowString=""+xline.charAt(0);
		for (int i=1;i<xline.length();i++) {
			if (xline.charAt(i)>xline.charAt(i-1))
			{
				
				nowlen++;
				nowString+=xline.charAt(i);
//				System.out.println(nowString);
			}else {
				if (nowlen>maxlen) {
					maxString=nowString;
					maxlen=nowlen;
					nowlen=1;
					nowString=""+xline.charAt(i);
				}else {
					nowlen=1;
					nowString=""+xline.charAt(i);
				}
			}
		}
		System.out.println(maxString);

	}

}
