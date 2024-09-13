package lesson09_interface.starcraft;

public class SCV extends GroundUnit implements Repairable{
//	void repair(Repairable u) {
//		
//	}
	
	void repair(Unit u) {
		if(!(u instanceof Repairable)) {
			System.out.println("수리불가 대상");
			return;
		}else {
			System.out.println("수리중");
		}
	}
}
