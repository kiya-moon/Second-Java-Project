package parking_lot;

import java.util.Scanner;

public class ParkingMain {
	
	public static void main(String[] args) throws AuthenException {
		DAO dao = new DAO();
	      
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while(true) {
			do {
				System.out.println("-----------------------------------------------------------------------------------------------------");
				System.out.println("      		                       시간지나면 견인하조 주차장  ");
				System.out.println("	1. 입차           2. 출차           3. 정기권등록           4.주차현황           5. 종료 ");
				System.out.println("-----------------------------------------------------------------------------------------------------");
				System.out.print(">>");
				choice = sc.nextInt();
			} while (choice < 1 || choice > 5);
			
			switch(choice) {
			case 1:
				// 입차
				try {
					Inout.Enterance();
				} catch (AuthenException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				// 출차			
				Inout.Exit();
				break;
			case 3:
				// 정기권등록
				try {
					CommutationTicket.CommuTicket();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;	
			case 4:
				TotalParking.TotalParking();
				break;	
			case 5:
				// 종료
				DBConn.close();		// DB연결 끊고 종료
				System.exit(0);		// 프로그램 강제 종료
			}
//			sc.close();
		}
	}
}