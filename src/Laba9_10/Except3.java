package Laba9_10;

public class Except3 {
	public static int m(){
	//  Проконтролировать блок кода оператора try
		try {
			// Выводим в консоль строку , содержащую 0
			System.out.println("0");
			return 15;
		}
		finally {
			// Выводим в консоль строку , содержащую 1
			System.out.println("1");
			return 20;
		}
	}
}