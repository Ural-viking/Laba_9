package Laba9_8;

public class Except1 {
	
		public static int m(){
			// �������� ����� try ��� �������� ����
			try {
				System.out.println("0");
				// ������� ������ ���������� ���� RuntimeException
				throw new RuntimeException();
			} 
			// ���� ���� ������� ���������� � ����� ������ ����� ����� try, ���� ����� ������
			finally {
				System.out.println("1");
			}
	}

}
