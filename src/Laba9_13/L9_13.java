package Laba9_13;

/*  ������ ������ � ����������� ������ main. 
	�� ������� 5 ������������ ��������� ������� � ������� ������� �������� ����������.*/

public class L9_13 {
	public static void main(String[] args) {
		//  ����������������� ���� ���� ��������� try
		try {
			int l = args.length; // ���������� l ������ ����� �������
			System.out.println("������ �������= " + l); //����� , ��� l=0;
			int h=10/l; // ������������� ���������� h ������ ������� 10 �� l
			args[l + 1] = "10";
		} 
		// ����, ������� ������������� ���������� ������� �� ���� 
		catch (ArithmeticException e) {
			System.out.println("������� �� ����");
		}
		// ���� ���� �� ��������� , ������ ��� ������ ����������� �����
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������ �� ����������");
		}
	}
}