package Laba9_2;

// ���������� ����������� ������������� ������

public class L9_2 {
	public static void main(String[] args) {
		// �������� ����� try ��� �������� ����
		try {
			System.out.println("0");
			// ������� ������ ���������� ���� RuntimeException
			throw new RuntimeException("������������� ������");
		}
		// ������������� ���������� ��� ������ ����� catch � ������� Exception. ����� Exception �������� ������� ������ RuntimeException.
		catch (Exception e) {
			//������������ ����������
			System.out.println("1 "+ e );
		}
		// ��� ����� ������ try � catch
		System.out.println("2");
		}

}
