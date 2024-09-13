package lesson06_array;

public class modumable {
	public static void main(String[] args) {
		int dice1 = (int)(Math.random()*6+1);
		int dice2 = (int)(Math.random()*6+1);
		int sum = 0;
		int doublesum=0;
		
		if(dice1 == dice2) {
			System.out.println("더블로 들어온 주사위 :" + dice1);
			System.out.println("더블로 들어온 주사위 :"+dice2);
			while(true) {
				dice1 += (int)(Math.random()*6+1);
				dice2 += (int)(Math.random()*6+1);
				System.out.println("더블중인 :" + dice1);
				System.out.println("더블중인 :"+dice2);
				if(dice1 != dice2) {
					doublesum += dice1+dice2;
					System.out.println("더블을 끝낸 주사위 :" + dice1);
					System.out.println("더블을 끝낸 주사위 :"+dice2);
					break;
				}
				
			}
		}
		if(doublesum>0) {
			sum += doublesum;
		}else if(doublesum == 0) {
			sum += dice1+dice2;
		}
		System.out.println("주사위 합계 : "+sum);
	}
}
