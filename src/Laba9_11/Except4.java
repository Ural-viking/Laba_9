package Laba9_11;

public class Except4 {
		public static void main(String[] args) {
		//  ����������������� ���� ���� ��������� try
			try {
				System.out.println("0");
				// ���������� ���������� ������� ��� ������ throw. new - ��������, ������� ������ ��� �������� ���������� ���������� ������ NullPointerException.
				throw new NullPointerException("������");
			}
			// ���������� �����������
			catch (NullPointerException e) {
				System.out.println("1" );
			}
			// ���� finally ���������� ����������� ����� ������ try-catch
			finally {
				System.out.println("2" );
			}
		// ��� ����� ���� ������
		System.out.println("3");
		}
}