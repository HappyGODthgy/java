package jump2java;

public class semoysyz0503_4 {
	void sayNick(String nick) {
		if ("바보".equals(nick)) {
			return;
		}
		System.out.println("나의 별명은 "+nick+" 입니다.");
	}
	
	public static void main(String[] args) {
		semoysyz0503_4 sample = new semoysyz0503_4();
		sample.sayNick("야호");
		sample.sayNick("바보");
	}
}
