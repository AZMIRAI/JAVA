package EX053_PIZZATOPPING;

public class PizzaTopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] pizzaTopping	=	{"ペペロン","マッシュルーム",
				"玉ねぎ","ソース","ベーコン","チーズ"};
		for (int i=0;i<pizzaTopping.length;i++) {
		System.out.print(pizzaTopping[i]);
		if (i<pizzaTopping.length-1) {
			System.out.print(" ");
		}
		}
	}

}
