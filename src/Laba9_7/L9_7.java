package Laba9_7;

// Нельзя перехватить брошенное исключение с помощью чужого catch, даже если перехватчик подходит.

public class L9_7 {
	public static void main(String[] args) {
		// Создание блока try для проверки кода
		try {
			System.out.println("0");
			// Создаем обьект исключения типа NullPointerException
			throw new NullPointerException("ошибка");
		} 
		// Исключение перехвачено
		catch (NullPointerException e) {
			System.out.println("1" );
		}
		// Второй блок кода для проверки
		try {
			System.out.println("2" );
			// Создаем обьект исключения типа ArithmeticException
			throw new ArithmeticException();
		}
		// Исключение перехвачено
		catch (ArithmeticException e) {
			System.out.println("3" );
		}
		// Код после блоков try и catch
		System.out.println("4");
	}
}