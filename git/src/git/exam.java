package git;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
	
		Scanner in=new Scanner(System.in);
		int tAdultNum, tChildNum;
		int ticketPrice =8000, price=0;
		
		
		System.out.println("아동수:");
		tChildNum = in.nextInt();
		
		
		System.out.println("성인수:");
		tAdultNum = in.nextInt();
		
		price = (ticketPrice-2000)*tChildNum +
				ticketPrice + tAdultNum;
		
		
		System.out.println("총수량:"+ (tChildNum+tAdultNum));
		System.out.println("금액:"+price);
		
		
		
		
		
		
		
		

	}

}
