package Task9_3;

/*			В программе, вычисляющей сумму элементов типа byte одномерного массива,
			вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
							– ввод строки вместо числа;
							– ввод или вычисление значения за границами диапазона типа.  */

import java.util.*;

public class Main3 {
	public static void main(String[] args) {
		try {
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Какого размера нужен массив?");
			int l = scan1.nextInt();
			byte newArray[] = new byte[l];
			System.out.println("Введите значения ячеек по одной");
			for(byte i=0;i<l;i++) {
				newArray[i]=scan2.nextByte();
				System.out.print("["+ i+"]" +newArray[i] + " ");
			}
			System.out.println();
			System.out.println("Все значения введены");
			System.out.println("Сумма элементов массива равна: ");
			byte sum = 0;
			for(byte i=0;i<l;i++) {
				sum = (byte)(sum+newArray[i]);
			}
			System.out.println(sum);
		}
		catch(InputMismatchException a) {
			System.out.println("ОШИБКА! Несоответствующий тип вводных данных или выход за границы диапазона целочисленного типа byte!");
		}
	}
}