package Laba9_9;

public class Except2 {
	public static int m(){
	//  ����������������� ���� ���� ��������� try
		try {
			System.out.println("0");
			return 55; // ����� �� ������
		}
		// ���� ���� ��������� finally . �������� �� ����� �� ������ �����, ��� ����� ���� ��� ����� ����� ��������.
		finally {
			System.out.println("1");
		} 
	}
}