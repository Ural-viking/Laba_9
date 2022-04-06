package Laba9_6;

/*  ������������������ ��������� ������ ��������������� �������� ������� ����������. 
 *  ������ �� ������ ������������� ���������� ������ ��������.
 *  ��������� ������ ������ ������ �����������. 
 *  ��������� ��������� ����������. */

public class L9_6 {
	public static void main(String[] args) {
		// �������� ����� try ��� �������� ����
		try {
			System.out.println("0");
			// ������� ������ ���������� ���� NullPointerException
			throw new NullPointerException("������");
		} 
		// ������ ���� �� ������������� ������
		catch (ArithmeticException e) {
			System.out.println("1" );
		}
		// ��������� �� ����������� ������ ��� ������� ����� ������� catch ������ RuntimeException, � ����� Exception
		catch (Exception e) {
			System.out.println("2" );
		}
		
		catch (RuntimeException e) {
			System.out.println("3" );
		}
		
	}
	// ��� ����� ������ try � catch
	System.out.println("4 ");
}