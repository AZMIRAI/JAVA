package serve;

public class cl {
	
	public static void main(String[]args){
		String s = "���ع��� ��λ��� ������ �⵵��";
//		for (int i=0;i<s.length();i++) {
//			System.out.print(s.charAt(i)+ "");
//		}
//		
		int idx = s.indexOf("��λ�");
//		int idx_1 = s.indexOf("��");
//		System.out.println(idx);
		
		String subs = s.substring(idx,idx+"��λ�".length());
		System.out.println(subs);
		
		subs = s.substring(idx,s.indexOf("������"));
		System.out.println("["+subs+"]");
		
		
}
	
}
