package Laba9_4;

// �������� ���������� ���������� �������

public class L9_4 {
	public static void main(String[] args) {
		// �������� ����� try ��� �������� ����
		try {
			System.out.println("0");
			// ������� ������ ���������� ���� RuntimeException
			throw new RuntimeException("������");
		}
		// ������ ���� �� ������������� ������
		catch (NullPointerException e) {
			System.out.println("1" );
		}
		// ���� ���� ������������� ������ , ��� ��� �������� ������� ������ ���������� 
		catch (Exception e) {
			System.out.println("2" );
		}
		// ���� ���� �� ��������, �.�. ������ ��� �����������
		catch (Error e) {
			System.out.println("3" );
		}
		// ��� ����� ������ try � catch
		System.out.println("4");
		}

}
