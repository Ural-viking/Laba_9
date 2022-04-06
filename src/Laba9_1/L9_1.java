package Laba9_1;

// Сгенерировано и перехвачено RuntimeException

public class L9_1 {
	public static void main(String[] args) {
		//  Проконтролировать блок кода оператора try
		try {
			// Выводим в консоль строку , содержащую 0
			System.out.println("0");
			// Генерируем исключение вручную при помощи throw. new - операция, которая служит для создания экземпляра исключения класса RuntimeException.
			throw new RuntimeException("Непроверяемая ошибка");
		} 
		// Перехват исключения
		catch (RuntimeException e) { 
			System.out.println("1 "+ e); // исключение обработано
		}
		// Текст после блока try-catch
			System.out.println("2");
	}
}