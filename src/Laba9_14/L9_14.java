package Laba9_14;

// ��������� ����������, ������������ ����� ������� m() � ������ (� ������ main).

public class L9_14 {
	public static void m(int x) 
		// ������������� ���� ���������� , ������� ����� ����� ������������
		throws ArithmeticException{
		// �������� ���������� 
			int h=10/x;
		}
	
	public static void main(String[] args) {
	//  ����������������� ���� ���� ��������� try
		try {
			int l = args.length; // ���������� ������ ����� �������
			System.out.println("������ �������= " + l);  // ����� ���������� � ����� ������� 
			m(l); // ����� ������ � ���������� l
		} 
		// �������� ������ 
		catch (ArithmeticException e) {
			// ������ �����������
			System.out.println("������: ������� �� ����");
		}
	}
}