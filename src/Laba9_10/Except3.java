package Laba9_10;

public class Except3 {
	public static int m(){
	//  ����������������� ���� ���� ��������� try
		try {
			// ������� � ������� ������ , ���������� 0
			System.out.println("0");
			return 15;
		}
		finally {
			// ������� � ������� ������ , ���������� 1
			System.out.println("1");
			return 20;
		}
	}
}