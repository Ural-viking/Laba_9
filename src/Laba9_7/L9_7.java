package Laba9_7;

// ������ ����������� ��������� ���������� � ������� ������ catch, ���� ���� ����������� ��������.

public class L9_7 {
	public static void main(String[] args) {
		// �������� ����� try ��� �������� ����
		try {
			System.out.println("0");
			// ������� ������ ���������� ���� NullPointerException
			throw new NullPointerException("������");
		} 
		// ���������� �����������
		catch (NullPointerException e) {
			System.out.println("1" );
		}
		// ������ ���� ���� ��� ��������
		try {
			System.out.println("2" );
			// ������� ������ ���������� ���� ArithmeticException
			throw new ArithmeticException();
		}
		// ���������� �����������
		catch (ArithmeticException e) {
			System.out.println("3" );
		}
		// ��� ����� ������ try � catch
		System.out.println("4");
	}
}