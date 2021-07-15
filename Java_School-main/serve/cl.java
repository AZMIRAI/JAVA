package serve;

public class cl {
	
	public static void main(String[]args){
		String s = "동해물과 백두산이 마르고 닳도록";
//		for (int i=0;i<s.length();i++) {
//			System.out.print(s.charAt(i)+ "");
//		}
//		
		int idx = s.indexOf("백두산");
//		int idx_1 = s.indexOf("이");
//		System.out.println(idx);
		
		String subs = s.substring(idx,idx+"백두산".length());
		System.out.println(subs);
		
		subs = s.substring(idx,s.indexOf("마르고"));
		System.out.println("["+subs+"]");
		
		
}
	
}
