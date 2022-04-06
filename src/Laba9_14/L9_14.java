package Laba9_14;

// Обработка исключения, порожденного одним методом m() в другом (в методе main).

public class L9_14 {
	public static void m(int x) 
		// перечисляются типы исключений , которые метод может генерировать
		throws ArithmeticException{
		// Введение переменной 
			int h=10/x;
		}
	
	public static void main(String[] args) {
	//  Проконтролировать блок кода оператора try
		try {
			int l = args.length; // переменная равная длине массива
			System.out.println("размер массива= " + l);  // вывод информации о длине массива 
			m(l); // Вызов метода с аргументом l
		} 
		// Перехват ошибки 
		catch (ArithmeticException e) {
			// Ошибка перехвачена
			System.out.println("Ошибка: Деление на ноль");
		}
	}
}