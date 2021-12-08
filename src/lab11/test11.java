package lab11;

import java.util.ArrayList;
import java.util.Arrays;
import lab11.run;

public class test11 {
	public static void main(String[] args) {
		ArrayList<String> card=new ArrayList<String>(Arrays.asList("梅花3" ,"红心2" ,"方块8" ,"红心K" ,"红心9" ,"红心9" ,"红心4" ,"梅花J" ,
		                                              "大王1" ,"小王1" ,"黑桃3" ,"黑桃2" ,"方块2" ,"梅花2" ,"黑桃9" ,"黑桃8" ,"黑桃7" ,"黑桃A" ,"方块K" ,"方块9" ,"方块4" ,"方块3" ,"方块3" ,"红心J" ,"红心8" ,
		                                              "红心6" ,"梅花A" ,"梅花K" ,"梅花8" ,"梅花8" ,"梅花5" ,"梅花5" ,"梅花4",
		                                              "红心5" ,"黑桃2" ,"红心2" ,"方块2" ,"黑桃A" ,"黑桃Q" ,"黑桃8" ,"黑桃6" ,"黑桃5" ,"黑桃4" ,"方块K" ,"方块Q" ,"方块J" ,
		                                              "方块10" ,"方块6" ,"方块6" ,"方块5","方块4" ,"红心A" ,"梅花K" ,"梅花9" ,"梅花9" ,"梅花7" ,"梅花6" ,"梅花4",
		                                              "红心5" ,"小王2" ,"黑桃3" ,"梅花2" ,"黑桃K" ,"黑桃K" ,"黑桃Q" ,"黑桃J" ,"黑桃10" ,"黑桃7" ,"方块A" ,"方块A" ,"方块10" ,"方块7" ,"红心A" ,
		                                              "红心K" ,"红心Q" ,"红心J" ,"红心7" ,"红心4" ,"红心3" ,"梅花A" ,"梅花Q","梅花10" ,"梅花7",
		                                              "大王2" ,"梅花3" ,"黑桃J" ,"黑桃10" ,"黑桃9" ,"黑桃6" ,"黑桃5" ,"黑桃4" ,"方块Q" ,"方块10" ,"方块9" ,"方块8" ,"方块7" ,"方块5" ,"红心Q" ,
		                                              "红心J" ,"红心10" ,"红心8" ,"红心7" ,"红心6" ,"红心3" ,"梅花Q" ,"梅花J" ,"梅花10" ,"梅花6")
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
