package jump2java;

public class didtmddbs54321 {
	public static void main(String[]args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello jump to java");
		sb.delete(6, 11);  // 6번째부터 10번째까지의 문자 삭제 ("jump "을 삭제)
		System.out.println(sb.toString());
	}
}
