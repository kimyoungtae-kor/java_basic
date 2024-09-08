package lesson05_control;

public class SwitchEx2 {
	public static void main(String[] args) {
		String addr = "서울";
		String res = "";
		switch(addr) {
		case "서울":
			res = "저희집은 서울입니다";
			break;
		case "제주":
			res = "저희집은 제주입니다";
			break;
		default :
			res = "주소가없어요 ㅜㅜ";
		}
		System.out.println(res);
	}
}
