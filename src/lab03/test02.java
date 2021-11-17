package lab03;

import java.util.*;

public class test02 {
	public static void main(String[] args) {
		Map<Integer, Integer> map=new TreeMap<>();
		int maxvalue=0;
		Scanner input=new Scanner(System.in);
		while (input.hasNext()){
			int x=Integer.valueOf(input.next());
			if (x==0) break;
			if (map.containsKey(x)){
				int value=map.get(x);
				if (value+1>maxvalue) maxvalue=value+1;
				map.put(x,value+1);
			}else map.put(x,1);
		}
		List<Integer> max=new ArrayList<>();
		int finalMaxvalue = maxvalue;
		map.forEach((k, v)-> {
			if (v == finalMaxvalue) max.add(k);
		});
		for (int i=0;i<max.size()-1;i++){
			System.out.println("Number "+max.get(i)+" occurred most:"+map.get(max.get(i)));
		}
		System.out.println("Number "+max.get(max.size()-1)+" occurred most:"+map.get(max.get(max.size()-1)));

	}

}
