package homeworkWeek03;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i=3;		
		int win=0, lose=0;		
		while(i>0){			
			int hright = (int)(Math.random()*3)+1; //����� ������			
			int hleft = (int)(Math.random()*3)+1; //����� �޼�			
			int cright = (int)(Math.random()*3)+1; //��ǻ���� �����ʼ�			
			int cleft = (int)(Math.random()*3)+1; //��ǻ���� �޼�	
			
			if((hright == hleft) || (cright == cleft))				
				continue;
			
			System.out.println("<-- 1.�ָ� 2.���� 3.�� �� 2�� ���� -->");			
			System.out.printf("�� �������� %d, �޼��� %d�� ����\n", hright, hleft);
			System.out.printf("��ǻ���� �������� %d, �޼��� %d�� ����\n", cright, cleft);
			
			System.out.println("<-- ������, �޼� �� ���� -->");
			
			System.out.println("<-- ������, �޼� �� ���� -->");
			int hresult = (int)(Math.random()*2)+1;			
			int cresult = (int)(Math.random()*2)+1;					
			if(hresult ==1 )				
				hresult = hright;			
			else				
				hresult = hleft;						
			if(cresult ==1)				
				cresult = cright;			
			else				
				cresult = cleft;					
			System.out.printf("�� : %d, ��ǻ�� : %d\n", hresult, cresult);
			
			if((hresult==1&&cresult==2)||(hresult==2&&cresult==3)||(hresult==3&&cresult==1)) {				
				System.out.println("���� �̰��!");				
				win++;			
				} else if(hresult == cresult)				
					System.out.println("��屸��...");			
				else if((hresult==1&&cresult==3)||(hresult==2&&cresult==1)||(hresult==3&&cresult==2)) {				
					System.out.println("���� ����.......");				
					lose++;			
					}			
			i--;			
			System.out.printf("\n\n");		
			}				
		System.out.printf("���� ��� --> �� : %d, ��ǻ�� : %d\n", win, lose);
	}
}