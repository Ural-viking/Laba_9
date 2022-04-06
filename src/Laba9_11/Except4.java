package Laba9_11;

public class Except4 {
		public static void main(String[] args) {
		//  Проконтролировать блок кода оператора try
			try {
				System.out.println("0");
				// Генерируем исключение вручную при помощи throw. new - операция, которая служит для создания экземпляра исключения класса NullPointerException.
				throw new NullPointerException("ошибка");
			}
			// Исключение перехвачено
			catch (NullPointerException e) {
				System.out.println("1" );
			}
			// Блок finally выполнится обязательно после блоков try-catch
			finally {
				System.out.println("2" );
			}
		// Код после всех блоков
		System.out.println("3");
		}
}