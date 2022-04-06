package Laba9_3;

// Перехват исключения подходящим классом

public class L9_3 {
	public static void main(String[] args) {
		// Создание блока try для проверки кода
		try {
			System.out.println("0");
			// Создаем обьект исключения типа RuntimeException
			throw new RuntimeException("ошибка");
		}
		// Данным блоком catch мы не перехватываем ошибку
		catch (NullPointerException e) {
			System.out.println("1" );
		}
		// Этим блоком мы перехватываем ошибку 
		catch (RuntimeException e) {
			System.out.println("2" );
		}
		// Этот код мог бы перехватить ошибку. Но ошибка уже перехвачена ранее.
		catch (Exception e) {
			System.out.println("3" );
		}
		// Код после блоков try и catch
		System.out.println("4");
		}
}