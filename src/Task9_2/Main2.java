package Task9_2;

/*			� ���������, ��� ��������� �� ������� ������� ������� � �������, �������� �
			����������, ����� ��������� ������ � ��������� �������:
						� ���� ������ ������ �����;
						� ��� ������� � ����� �������. */

/*			� ���� ������ ������ ����� (��������� ������ InputMismatchException);
 * 			� ��� ������� � ����� �������(��������� ������ ArrayIndexOutOfBoundsException ). */

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		// ���������� �������� ���
		try {
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Random random = new Random();
			System.out.println("������� ����� ����� ��� �������? ");
			int high = scan1.nextInt();
			System.out.println("������� �������� ����� ��� �������? ");
			int width = scan1.nextInt();
			int newArray[][] = new int[high][width];
			int i;
			int j;
			System.out.println("�������, ���������� ������� ����� ��������� ���������� �������.");
			for(i=0;i<high;i++) {
				for(j=0;j<width;j++) {
					newArray[i][j] = random.nextInt(500);
					System.out.print(newArray[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("����� ������� ����� ��������? ");
			int k = scan2.nextInt();
			for(i=0;i<high;i++) {
				System.out.println(newArray[i][k]);
			}
		}
		catch(InputMismatchException a) {
			System.out.println("������! ����������������� ��� ������� ������!");
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("������! �������������� �������!");
		}
	}
}