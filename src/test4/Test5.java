package test4;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long timeBegin = System.nanoTime();
		int j;
		for (int i = 2; i <= 1000; i++) // 1��������������ֱ�Ӵ�2��ʼѭ��
		{
			j = 2;
			while (i % j != 0)
				j++; // ����2��i�������Ƿ��ܱ�i�������粻�ܾ��Լ�
			if (j == i) // ���б�����������ʱ���ж����ǲ�������
				System.out.println(i); // ����Ǿʹ�ӡ������
		}
		Long timeEnd = System.nanoTime();
		System.out.println(timeEnd - timeBegin);
	}
}
