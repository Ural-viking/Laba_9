package Laba9_1;

// ������������� � ����������� RuntimeException

public class L9_1 {
	public static void main(String[] args) {
		//  ����������������� ���� ���� ��������� try
		try {
			// ������� � ������� ������ , ���������� 0
			System.out.println("0");
			// ���������� ���������� ������� ��� ������ throw. new - ��������, ������� ������ ��� �������� ���������� ���������� ������ RuntimeException.
			throw new RuntimeException("������������� ������");
		} 
		// �������� ����������
		catch (RuntimeException e) { 
			System.out.println("1 "+ e); // ���������� ����������
		}
		// ����� ����� ����� try-catch
			System.out.println("2");
	}
}