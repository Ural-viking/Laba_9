package Laba9_12;

//���������� IllegalArgumentException � �������� ���������.

public class L9_12 {
	public static void m(String str, double chislo){
		// ���� ��������� if � ��������
		if (str==null) {
			// ���������� ���������� ������� ��� ������ throw. new - ��������, ������� ������ ��� �������� ���������� ���������� ������ IllegalArgumentException.
			throw new IllegalArgumentException("������ ������� �������");
		}
		// ���� ��������� if � ��������
		if (chislo>0.001) {
			// ���������� ���������� ������� ��� ������ throw. new - ��������, ������� ������ ��� �������� ���������� ���������� ������ IllegalArgumentException.
			throw new IllegalArgumentException("�������� �����");
		} 
		}

		public static void main(String[] args) {
		// ������ ������ � ����������� null  � 0,000001	
		m(null,0.000001);
		}
}