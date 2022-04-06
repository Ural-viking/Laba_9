package Laba9_13;

/*  Пример работы с аргументами метода main. 
	На рисунке 5 представлена настройка проекта и задание входных значений аргументов.*/

public class L9_13 {
	public static void main(String[] args) {
		//  Проконтролировать блок кода оператора try
		try {
			int l = args.length; // Переменная l равная длине массива
			System.out.println("размер массива= " + l); //Вывод , что l=0;
			int h=10/l; // Инициализация переменной h равной делению 10 на l
			args[l + 1] = "10";
		} 
		// Блок, который перехватывает исключение деления на ноль 
		catch (ArithmeticException e) {
			System.out.println("Деление на ноль");
		}
		// Этот блок не выводится , потому что ошибка перехвачена ранее
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Индекс не существует");
		}
	}
}