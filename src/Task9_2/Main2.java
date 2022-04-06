package Task9_2;

/*			В программе, где требуется из матрицы вывести столбец с номером, заданным с
			клавиатуры, могут возникать ошибки в следующих случаях:
						– ввод строки вместо числа;
						– нет столбца с таким номером. */

/*			– ввод строки вместо числа (возникает ошибка InputMismatchException);
 * 			– нет столбца с таким номером(возникает ошибка ArrayIndexOutOfBoundsException ). */

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		// Подвергаем проверке код
		try {
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Random random = new Random();
			System.out.println("Сколько строк нужно для матрицы? ");
			int high = scan1.nextInt();
			System.out.println("Сколько столбцов нужно для матрицы? ");
			int width = scan1.nextInt();
			int newArray[][] = new int[high][width];
			int i;
			int j;
			System.out.println("Матрица, указанного размера будет заполнена случайными числами.");
			for(i=0;i<high;i++) {
				for(j=0;j<width;j++) {
					newArray[i][j] = random.nextInt(500);
					System.out.print(newArray[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Какой столбец нужно показать? ");
			int k = scan2.nextInt();
			for(i=0;i<high;i++) {
				System.out.println(newArray[i][k]);
			}
		}
		catch(InputMismatchException a) {
			System.out.println("ОШИБКА! Несоответствующий тип вводных данных!");
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("ОШИБКА! Несуществующий столбец!");
		}
	}
}