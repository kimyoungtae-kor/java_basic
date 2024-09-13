package lesson09_interface.starcraft;

public class Tank extends GroundUnit implements Repairable{
	boolean siege;
	
	void toggleSiege() {
		//에니 메이션 동작 재생
		siege = !siege;
	}
}
