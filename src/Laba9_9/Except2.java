package Laba9_9;

public class Except2 {
	public static int m(){
	//  ѕроконтролировать блок кода оператора try
		try {
			System.out.println("0");
			return 55; // выход из метода
		}
		// Ѕлок кода оператора finally . Ќесмотр€ на выход из метода ранее, эта часть кода все равно будет выведена.
		finally {
			System.out.println("1");
		} 
	}
}