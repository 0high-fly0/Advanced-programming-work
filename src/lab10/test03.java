package lab10;

import java.util.ArrayList;

public class test03 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(9);
        list.add(10);
        list.add(15);
        list.add(21);
        list.add(28);
        list.add(19);
        list.add(24);
 
        
        System.out.print("����10:");
        list.stream()
        		.filter((number)-> number>10)
                .forEach((number) -> System.out.print(" "+number));
        
        //ƽ��ֵ
        double avg= list.stream().filter((number) -> number>10)
                .mapToInt(Integer::intValue).average().getAsDouble();
        System.out.print("\n����10ƽ��ֵ���: "+avg);

        Integer min= list.stream().filter((number) -> number>20)
                .mapToInt(Integer::intValue).min().getAsInt();
        System.out.print("\n����20����Сֵ: "+min);
	}

}
