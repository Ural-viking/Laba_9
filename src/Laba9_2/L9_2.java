package Laba9_2;

// Исключение перехвачено перехватчиком предка

public class L9_2 {
	public static void main(String[] args) {
		// Создание блока try для проверки кода
		try {
			System.out.println("0");
			// Создаем обьект исключения типа RuntimeException
			throw new RuntimeException("Непроверяемая ошибка");
		}
		// Перехватываем исключение при помощи блока catch с классом Exception. Класс Exception является предком класса RuntimeException.
		catch (Exception e) {
			//Обрабатываем исключение
			System.out.println("1 "+ e );
		}
		// Код после блоков try и catch
		System.out.println("2");
		}

}
