package dome;

import java.time.chrono.JapaneseChronology;

public class Dome04 {

 public static void main(String [] args) {
	 
	 int sum=0;
	 int all[]=new int[20];//ѧ���ܷ�
	 
	 int ping01[]=new int[5];
	 int ping[]=new int[5];//ƽ��ֵ
	 
	 //Ϊ20*5��ά���鸳��0~100���ֵ
	 int score[][]=new int[20][5];
	 for(int i=0;i<20;i++)
	 {
		 for(int j=0;j<5;j++)
		 {
			 float b=(float) Math.random()*100;
			 score[i][j]=(int) b;
		 }
	 }
 
	 //�б����ʽ�����λѧ���ĳɼ�
	 String name[]={"C++","Java","Servlet","JSP","EJB"};
	 for(int i=0;i<5;i++)
	 {
		 System.out.print(name[i]+"\t");
	 }
	 System.out.println();
	 
	 for(int i=0;i<20;i++)
	 {
		 for(int j=0;j<5;j++)
		 {
			 System.out.print(score[i][j]+"\t"); 
			 all[i]+=score[i][j];//��ÿ���˵��ܷ�
		 }
		 System.out.println();
		 
	 }
	 
	 
 //��all[0]��all[19]����ÿ���˵��ܷ�
	 for(int i=0;i<all.length;i++)
	 {
		 System.out.println("��"+i+"�����ܷ�"+all[i]);
	 }
 
//��ÿ�Ƶ�ƽ����
	for(int j=0;j<5;j++)
	{
		for(int i=0;i<20;i++)
		{
			ping01[j]+=score[i][j];
		}
		ping[j]=ping01[j]/20;
		System.out.println(name[j]+"��ƽ����"+ping[j]);
	}
 }
}



