package Laba9_5;

// ���������� �� �����������

public class L9_5 {
	public static void main(String[] args) {
		// �������� ����� try ��� �������� ����
		try {
			System.out.println("0");
			// ������� ������ ���������� ���� RuntimeException
			throw new RuntimeException("������");
		}
		// ������ �� ���������������, ������ ��� catch ������������� ���� ��� ��������� 
		catch (NullPointerException e) {
			System.out.println("1" );
		}
		// ��� ����� ������ try � catch
		System.out.println("2");
		}
}