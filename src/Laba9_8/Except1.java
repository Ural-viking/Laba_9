package Laba9_8;

public class Except1 {
	
		public static int m(){
			// Создание блока try для проверки кода
			try {
				System.out.println("0");
				// Создаем обьект исключения типа RuntimeException
				throw new RuntimeException();
			} 
			// Блок кода который отработает в любом случае после блока try, даже после ошибки
			finally {
				System.out.println("1");
			}
	}

}
