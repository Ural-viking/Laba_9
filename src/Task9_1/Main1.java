package Task9_1;

/*  ¬ программе, вычисл€ющей среднее значение среди положительных элементов
	одномерного массива (тип элементов int), вводимого с клавиатуры, могут
	возникать ошибки в следующих случа€х:
					Ц ввод строки вместо числа;
					Ц несоответствие числового типа данных;
					Ц положительные элементы отсутствуют.*/

/* 		- при вводе строки вместо числа возникает ошибка типа  - InputMismatchException
 * 		- при несоответствии числового типа данных возникает ошибка типа - InputMismatchException
 * 		- при вызове несуществующей €чейки возникает ошибка - ArrayIndexOutOfBoundsException
 * 		- при отсутствии положительных элементов массива возникнет ошибка типа - ArithmeticException 
 */

import java.util.*;

public class Main1 {
	public static void main(String[] args) {
		// Ѕлок кода, который необходимо подвергнуть проверке
		try {
		// —оздание сканнеров. ћожно было обойтись одним, но так захотелось...
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		// «адаем размер массива
		System.out.println("¬ведите какого размера массив нужен. ");
		int l = scan1.nextInt();
		// —оздаем одномерный массив заданного размера
		int newArray[] = new int[l];
		// «абиваем значени€ в €чейки
		for(int i=0; i<newArray.length; i++) {
			newArray[i] = scan2.nextInt();
			System.out.print("["+i+"] " + newArray[i] + " ");
		}
		System.out.println();
		// ¬ычислч€ем среднее значение положительных элементов массива
		int counter = 0;
		int num = 0;
		for(int i=0; i<newArray.length;i++) {
			if(newArray[i]>0) {
				num++;
				counter = counter + newArray[i];
			}
		}
		int srednee = counter/num;
		// кусок кода дл€ обращени€ к какой-нибудь €чейке
		System.out.println("—реднее значение среди положительных элементов массива: " + srednee);
		System.out.println("«начение какой €чейки нужно показать?");
		int j = scan2.nextInt();
		System.out.println(newArray[j]);
	}
	// ѕерехватчик ошибок, св€занных с делением на 0 	
	catch(ArithmeticException g) {
		System.out.println("ќЎ»Ѕ ј! ¬ массиве нет положительных чисел, происходит деление на 0 при вычислении среднего значени€ ");
	}
	// ѕерехватчик ошибок, св€занных с использованием неправильного типа данных	
	catch(InputMismatchException e) {
		System.out.println("ќЎ»Ѕ ј! »спользуйте целые числа типа int: 1) положительные целые числа дл€ размера массива; 2) числа типа int дл€ заполнени€ массива");
	}
	// ѕерехватчик ошибок, св€занных с обращением к ошибочной €чейке	
	catch(ArrayIndexOutOfBoundsException f) {
		System.out.println("ќЎ»Ѕ ј! ќбращение к несуществующей €чейке");
	}
}
}