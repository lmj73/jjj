package git;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
	
		Scanner in=new Scanner(System.in);
		int tAdultNum, tChildNum;
		int ticketPrice =8000, price=0;
		
		
		System.out.println("�Ƶ���:");
		tChildNum = in.nextInt();
		
		
		System.out.println("���μ�:");
		tAdultNum = in.nextInt();
		
		price = (ticketPrice-2000)*tChildNum +
				ticketPrice + tAdultNum;
		
		
		System.out.println("�Ѽ���:"+ (tChildNum+tAdultNum));
		System.out.println("�ݾ�:"+price);
		
		
		
		
		
		
		
		

	}

}
