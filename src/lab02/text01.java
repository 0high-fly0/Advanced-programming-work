package lab02;

import java.util.*;

public class text01 {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<String>();
		Scanner input=new Scanner(System.in);
		String ins=input.nextLine();
		String[] inslist=ins.split(" ");
		for (String iString:inslist) {
			iString=iString.replace(".", "");
			iString=iString.replace(",", "");
			set.add(iString);
		}
		System.out.println(set);
		
	}

}
