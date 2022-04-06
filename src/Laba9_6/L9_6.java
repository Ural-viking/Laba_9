package Laba9_6;

/*  Последовательность перехвата должна соответствовать иерархии классов исключений. 
 *  Предок не должен перехватывать исключения раньше потомков.
 *  Указанный пример выдает ошибку компилятора. 
 *  Программу запустить невозможно. */

public class L9_6 {
	public static void main(String[] args) {
		// Создание блока try для проверки кода
		try {
			System.out.println("0");
			// Создаем обьект исключения типа NullPointerException
			throw new NullPointerException("ошибка");
		} 
		// Данный блок не перехватывает ошибку
		catch (ArithmeticException e) {
			System.out.println("1" );
		}
		// Программа не запуститься потому что сначала нужно вызвать catch класса RuntimeException, а затем Exception
		catch (Exception e) {
			System.out.println("2" );
		}
		
		catch (RuntimeException e) {
			System.out.println("3" );
		}
		
	}
	// Код после блоков try и catch
	System.out.println("4 ");
}