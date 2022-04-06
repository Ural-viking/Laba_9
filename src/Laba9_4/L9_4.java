package Laba9_4;

// Перехват исключения подходящим классом

public class L9_4 {
	public static void main(String[] args) {
		// Создание блока try для проверки кода
		try {
			System.out.println("0");
			// Создаем обьект исключения типа RuntimeException
			throw new RuntimeException("ошибка");
		}
		// Данный блок не перехватывает ошибку
		catch (NullPointerException e) {
			System.out.println("1" );
		}
		// Этот блок перехватывает ошибку , так как является предком класса исключения 
		catch (Exception e) {
			System.out.println("2" );
		}
		// Этот блок не работает, т.к. ошибку уже перехватили
		catch (Error e) {
			System.out.println("3" );
		}
		// Код после блоков try и catch
		System.out.println("4");
		}

}
