package algorithm;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		for (int i = 2; i <= 1000; i++) // 1��������������ֱ�Ӵ�2��ʼѭ��
		{
			j = 2;
			while (i % j != 0)
				j++; // ����2��i�������Ƿ��ܱ�i�������粻�ܾ��Լ�
			if (j == i) // ���б�����������ʱ���ж����ǲ�������
				System.out.println(i); // ����Ǿʹ�ӡ������
		}
	}

}
