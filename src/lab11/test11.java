package lab11;

import java.util.ArrayList;
import java.util.Arrays;
import lab11.run;

public class test11 {
	public static void main(String[] args) {
		ArrayList<String> card=new ArrayList<String>(Arrays.asList("÷��3" ,"����2" ,"����8" ,"����K" ,"����9" ,"����9" ,"����4" ,"÷��J" ,
		                                              "����1" ,"С��1" ,"����3" ,"����2" ,"����2" ,"÷��2" ,"����9" ,"����8" ,"����7" ,"����A" ,"����K" ,"����9" ,"����4" ,"����3" ,"����3" ,"����J" ,"����8" ,
		                                              "����6" ,"÷��A" ,"÷��K" ,"÷��8" ,"÷��8" ,"÷��5" ,"÷��5" ,"÷��4",
		                                              "����5" ,"����2" ,"����2" ,"����2" ,"����A" ,"����Q" ,"����8" ,"����6" ,"����5" ,"����4" ,"����K" ,"����Q" ,"����J" ,
		                                              "����10" ,"����6" ,"����6" ,"����5","����4" ,"����A" ,"÷��K" ,"÷��9" ,"÷��9" ,"÷��7" ,"÷��6" ,"÷��4",
		                                              "����5" ,"С��2" ,"����3" ,"÷��2" ,"����K" ,"����K" ,"����Q" ,"����J" ,"����10" ,"����7" ,"����A" ,"����A" ,"����10" ,"����7" ,"����A" ,
		                                              "����K" ,"����Q" ,"����J" ,"����7" ,"����4" ,"����3" ,"÷��A" ,"÷��Q","÷��10" ,"÷��7",
		                                              "����2" ,"÷��3" ,"����J" ,"����10" ,"����9" ,"����6" ,"����5" ,"����4" ,"����Q" ,"����10" ,"����9" ,"����8" ,"����7" ,"����5" ,"����Q" ,
		                                              "����J" ,"����10" ,"����8" ,"����7" ,"����6" ,"����3" ,"÷��Q" ,"÷��J" ,"÷��10" ,"÷��6")
		                                              );
		String[][] people= new String[4][25];
		int i,j,k;
		for(i=0;i<4;i++) {
			for(j=0;j<25;j++) {
				int index=(int) (Math.random()*(card.size()));
				people[i][j]=card.get(index);
				card.remove(index);
			}
		}
		
		Thread a=new Thread(new run(people[0]));
		Thread b=new Thread(new run(people[1]));
		Thread c=new Thread(new run(people[2]));
		Thread d=new Thread(new run(people[3]));
		Thread e=new Thread(new run((String[])card.toArray(new String[8])));
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		
		
	}
}
