package Laba9_3;

// �������� ���������� ���������� �������

public class L9_3 {
	public static void main(String[] args) {
		// �������� ����� try ��� �������� ����
		try {
			System.out.println("0");
			// ������� ������ ���������� ���� RuntimeException
			throw new RuntimeException("������");
		}
		// ������ ������ catch �� �� ������������� ������
		catch (NullPointerException e) {
			System.out.println("1" );
		}
		// ���� ������ �� ������������� ������ 
		catch (RuntimeException e) {
			System.out.println("2" );
		}
		// ���� ��� ��� �� ����������� ������. �� ������ ��� ����������� �����.
		catch (Exception e) {
			System.out.println("3" );
		}
		// ��� ����� ������ try � catch
		System.out.println("4");
		}
}