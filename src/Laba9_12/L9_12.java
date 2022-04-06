package Laba9_12;

//Исключение IllegalArgumentException – неверные аргументы.

public class L9_12 {
	public static void m(String str, double chislo){
		// блок оператора if с условием
		if (str==null) {
			// Генерируем исключение вручную при помощи throw. new - операция, которая служит для создания экземпляра исключения класса IllegalArgumentException.
			throw new IllegalArgumentException("Строка введена неверно");
		}
		// блок оператора if с условием
		if (chislo>0.001) {
			// Генерируем исключение вручную при помощи throw. new - операция, которая служит для создания экземпляра исключения класса IllegalArgumentException.
			throw new IllegalArgumentException("Неверное число");
		} 
		}

		public static void main(String[] args) {
		// Запуск метода с аргументами null  и 0,000001	
		m(null,0.000001);
		}
}