package dome;

import java.util.Scanner;



public class Trigon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ͼ����ϰ
		Scanner input=new Scanner(System.in);
		System.out.println("�������кţ�");
		int num=input.nextInt();
		
		//��ӡ�ո�
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i;j++)
			{
				System.out.print(" ");
			}
			
		//��ӡ����
			for(int k=1;k<=2*i-1;k++)
			{
				
				System.out.print(Integer.toHexString(i));//ת����16�������
			
			}
		System.out.println();	
		}
		
	}

}
