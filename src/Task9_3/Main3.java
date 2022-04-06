package Task9_3;

/*			� ���������, ����������� ����� ��������� ���� byte ����������� �������,
			��������� � ����������, ����� ��������� ������ � ��������� �������:
							� ���� ������ ������ �����;
							� ���� ��� ���������� �������� �� ��������� ��������� ����.  */

import java.util.*;

public class Main3 {
	public static void main(String[] args) {
		try {
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			System.out.println("������ ������� ����� ������?");
			int l = scan1.nextInt();
			byte newArray[] = new byte[l];
			System.out.println("������� �������� ����� �� �����");
			for(byte i=0;i<l;i++) {
				newArray[i]=scan2.nextByte();
				System.out.print("["+ i+"]" +newArray[i] + " ");
			}
			System.out.println();
			System.out.println("��� �������� �������");
			System.out.println("����� ��������� ������� �����: ");
			byte sum = 0;
			for(byte i=0;i<l;i++) {
				sum = (byte)(sum+newArray[i]);
			}
			System.out.println(sum);
		}
		catch(InputMismatchException a) {
			System.out.println("������! ����������������� ��� ������� ������ ��� ����� �� ������� ��������� �������������� ���� byte!");
		}
	}
}