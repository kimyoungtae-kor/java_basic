package lesson05_control;

public class mypratice {

	public static void main(String[] args) {
//		int sum = 0;
//		
//		for(int i=1;i<=100;i ++) {
//			if(i % 5 == 0) {
//				sum += i;
//			}
//
//		}
//		System.out.println(sum);
//		
//		int evenSum = 0;
//		int oddSum = 0;
//		
//		for (int i =1 ;i<=100;i++) {
//			if(i % 2 == 0) {
//				evenSum += i;
//			}else {
//				oddSum += i;
//			}
//		}
//		System.out.println("even:"+evenSum+" odd: "+oddSum);
		
//		for(int x=1;x<=6;x++) {
//			for(int y=1; y<=6; y++) {
//				if(x+y == 6) {
//					System.out.println("x = "+x+"y = "+y);
//				}
//			}
//		}
		
//	 for(int i =0; i<=5; i++) {
//		 
//		 for(int j = 0;j<=5;j++) {
//			 
//			 if(i>=j) {
//			 System.out.printf("%d",i);
//			 }
//		 }
//		 System.out.println();
//	 }
//	 for(int j =5;j>=1;j--) {
//		 for(int i=1;i<=j;i++) {
//			 System.out.printf("%d,%d",i,j); 
//		 }
//		 System.out.println();
//	 
//		 
//	 }
	///////중요
//		for(int i = -2;i<3;i++) {
//			for(int j=-2;j<3;j++) {
//				if(i*j >= -1 && i*j<=1) {
//				System.out.printf("(%d,%d)",i,j);
//				}else {
//					System.out.printf("%7c", ' ');
//				}
//			}
//			System.out.println();
//		}
		/////////////////
		
	int count = 0;
	while(true) {
		int dice = (int)(Math.random() *6+1);
		 System.out.println(dice);
			count++;
		if(dice == 6) {
			break;
		}

	}
	 System.out.println("카운트:"+count);
	 

		
		
		//2 3배수 제외 합산
//		int i = 0;
//		int sum = 0;
//		
//		while(i <20) {
//			if(i %2 !=0 && i %3 !=0) {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);
	}
}
