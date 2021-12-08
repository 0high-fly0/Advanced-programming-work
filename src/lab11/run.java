package lab11;

import java.awt.List;
import java.util.ArrayList;

public class run implements Runnable {
	String p[];
	@Override
	public void run() {
		String string="ÎÒµÄÅÆÎª£º";
		for (String s:this.p) {
			string+=s+", ";
		}
		System.out.println(string);
	}
	public run(String[] p) {
		this.p=p;
	}
}
