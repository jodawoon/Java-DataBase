package homeworkWeek03;

//하나빼기 과제

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i=3;		
		int win=0, lose=0;		
		while(i>0){			
			int hright = (int)(Math.random()*3)+1; //사람의 오른손			
			int hleft = (int)(Math.random()*3)+1; //사람의 왼손			
			int cright = (int)(Math.random()*3)+1; //컴퓨터의 오른쪽손			
			int cleft = (int)(Math.random()*3)+1; //컴퓨터의 왼손	
			
			if((hright == hleft) || (cright == cleft))				
				continue;
			
			System.out.println("<-- 1.주먹 2.가위 3.보 중 2개 선택 -->");			
			System.out.printf("내 오른손은 %d, 왼손은 %d를 선택\n", hright, hleft);
			System.out.printf("컴퓨터의 오른손은 %d, 왼손은 %d를 선택\n", cright, cleft);
			
			System.out.println("<-- 오른손, 왼손 중 선택 -->");
			
			System.out.println("<-- 오른손, 왼손 중 선택 -->");
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
			System.out.printf("나 : %d, 컴퓨터 : %d\n", hresult, cresult);
			
			if((hresult==1&&cresult==2)||(hresult==2&&cresult==3)||(hresult==3&&cresult==1)) {				
				System.out.println("내가 이겼다!");				
				win++;			
				} else if(hresult == cresult)				
					System.out.println("비겼구만...");			
				else if((hresult==1&&cresult==3)||(hresult==2&&cresult==1)||(hresult==3&&cresult==2)) {				
					System.out.println("내가 졌다.......");				
					lose++;			
					}			
			i--;			
			System.out.printf("\n\n");		
			}				
		System.out.printf("최종 결과 --> 나 : %d, 컴퓨터 : %d\n", win, lose);
	}
}
