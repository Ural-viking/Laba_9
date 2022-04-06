package Task9_1;

/*  � ���������, ����������� ������� �������� ����� ������������� ���������
	����������� ������� (��� ��������� int), ��������� � ����������, �����
	��������� ������ � ��������� �������:
					� ���� ������ ������ �����;
					� �������������� ��������� ���� ������;
					� ������������� �������� �����������.*/

/* 		- ��� ����� ������ ������ ����� ��������� ������ ����  - InputMismatchException
 * 		- ��� �������������� ��������� ���� ������ ��������� ������ ���� - InputMismatchException
 * 		- ��� ������ �������������� ������ ��������� ������ - ArrayIndexOutOfBoundsException
 * 		- ��� ���������� ������������� ��������� ������� ��������� ������ ���� - ArithmeticException 
 */

import java.util.*;

public class Main1 {
	public static void main(String[] args) {
		// ���� ����, ������� ���������� ����������� ��������
		try {
		// �������� ���������. ����� ���� �������� �����, �� ��� ����������...
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		// ������ ������ �������
		System.out.println("������� ������ ������� ������ �����. ");
		int l = scan1.nextInt();
		// ������� ���������� ������ ��������� �������
		int newArray[] = new int[l];
		// �������� �������� � ������
		for(int i=0; i<newArray.length; i++) {
			newArray[i] = scan2.nextInt();
			System.out.print("["+i+"] " + newArray[i] + " ");
		}
		System.out.println();
		// ���������� ������� �������� ������������� ��������� �������
		int counter = 0;
		int num = 0;
		for(int i=0; i<newArray.length;i++) {
			if(newArray[i]>0) {
				num++;
				counter = counter + newArray[i];
			}
		}
		int srednee = counter/num;
		// ����� ���� ��� ��������� � �����-������ ������
		System.out.println("������� �������� ����� ������������� ��������� �������: " + srednee);
		System.out.println("�������� ����� ������ ����� ��������?");
		int j = scan2.nextInt();
		System.out.println(newArray[j]);
	}
	// ����������� ������, ��������� � �������� �� 0 	
	catch(ArithmeticException g) {
		System.out.println("������! � ������� ��� ������������� �����, ���������� ������� �� 0 ��� ���������� �������� �������� ");
	}
	// ����������� ������, ��������� � �������������� ������������� ���� ������	
	catch(InputMismatchException e) {
		System.out.println("������! ����������� ����� ����� ���� int: 1) ������������� ����� ����� ��� ������� �������; 2) ����� ���� int ��� ���������� �������");
	}
	// ����������� ������, ��������� � ���������� � ��������� ������	
	catch(ArrayIndexOutOfBoundsException f) {
		System.out.println("������! ��������� � �������������� ������");
	}
}
}