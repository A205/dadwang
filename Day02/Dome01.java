package dome;

import java.util.Scanner;

public class Dome01 {

	/**
	 * @param args
	 */
	
	//��switch��������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int day=scanner.nextInt();
		String dayString="";
		switch(day)
		{
		case 1:dayString="����һ";break;
		case 2:dayString="���ڶ�";break;
		case 3:dayString="������";break;
		case 4:dayString="������";break;
		case 5:dayString="������";break;
		case 6:dayString="������";break;
		case 7:dayString="������";break;
		default :dayString="����";
		}
		
		System.out.println(dayString);
		
	}

}
