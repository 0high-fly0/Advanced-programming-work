package lab03;

import java.util.*;
public class test01 {
	public static void main(String[] args) {
		Set<String> set=new TreeSet<String>();
		Scanner input=new Scanner(System.in);
		while (1+1==2) {
			String ins=input.nextLine().trim();
			if (ins.equals("****")) break;
			String[] inslist=ins.split(" ");
			for (String iString:inslist) {
				if (iString.equals("")) continue;
				iString=iString.replace(".", "");
				iString=iString.replace(",", "");
				set.add(iString);
			}
		}
		System.out.println(set);
	}
}