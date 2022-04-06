package Laba9_5;

// Исключение не перехвачено

public class L9_5 {
	public static void main(String[] args) {
		// Создание блока try для проверки кода
		try {
			System.out.println("0");
			// Создаем обьект исключения типа RuntimeException
			throw new RuntimeException("ошибка");
		}
		// Ошибка не перехватывается, потому что catch неподходящего типа для перехвата 
		catch (NullPointerException e) {
			System.out.println("1" );
		}
		// Код после блоков try и catch
		System.out.println("2");
		}
}