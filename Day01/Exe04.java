package lianxi;

import java.util.Scanner;

public class Exe04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|1������1������|");
		System.out.println("|2����ʾȫ������|");
		System.out.println("|3���˳�����|");
		System.out.println("|������ѡ��1-3����");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		String aString="";
		switch(num)
		{
		case 1:aString="|����1������|";break;
		case 2:aString="|��ʾȫ������|";break;
		case 3:aString="|�˳�����|";break;
		}
		System.out.println(aString);
	}

}

