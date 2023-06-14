//package class06;
//
//import java.util.Scanner;
//
//public class BankApplicationExam {
//	
//	private static BankApplication[] accountArray = new BankApplication[100];
//	private static Scanner scanner = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		boolean run = true;
//		while(run) {
//			
//			System.out.println("------------------------------------------");
//			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
//			System.out.println("------------------------------------------");
//			System.out.print("선택 > ");
//			
//			int selectNo = scanner.nextInt();
//			if(selectNo == 1) {
//				createAccount();
//			}else if(selectNo == 2) {
//				accountList();
//			}else if(selectNo == 3) {
//				deposit();
//			}else if(selectNo == 4) {
//				withdraw();
//			}else if(selectNo == 5) {
//				run = false;
//			}
//			
//		}
//		System.out.println("프로그램 종료");
//		
//	}
//	//1. 계좌생성
//	private static void createAccount() {
//		System.out.println("++++++++++++++++");
//		System.out.println("계좌생성");
//		System.out.println("++++++++++++++++");
//		
//		System.out.println("계좌번호 : ");
//		String ano = scanner.next();
//		
//		System.out.println("예금주 : ");
//		String owner = scanner.next();
//		
//		System.out.println("최초 입금액 : ");
//		int balance = scanner.nextInt();
//		
//		BankApplication newAccount = new BankApplication(ano, owner, balance);
//		for(int i = 0; i < accountArray.length; i++) {
//			accountArray[i] = newAccount;
//			System.out.println("결과 : 계좌가 생성되었습니다.");
//			break;
//		}
//	}
//	//2. 계좌목록
//	private static void accountList() {
//		System.out.println("++++++++++++++++");
//		System.out.println("계좌목록");
//		System.out.println("++++++++++++++++");
//		for(int i = 0; i < accountArray.length; i++) {
//			BankApplication account = accountArray[i];
//			if(account != null) {
//				System.out.println(account.getAno());
//				System.out.println("               ");
//				System.out.println(account.getOwner());
//				System.out.println("               ");
//				System.out.println(account.getBalance());
//				System.out.println("               ");
//				
//			}
//		}
//	}
//	//3. 예금
//	private static void deposit() {
//		System.out.println("++++++++++++++++");
//		System.out.println("예금허가");
//		System.out.println("++++++++++++++++");
//		System.out.println("계좌번호 : ");
//		String ano = scanner.next();
//		System.out.println("++++++++++++++++");
//		System.out.println("입금액 : ");
//		int money = scanner.nextInt();
//		BankApplication account = findAccount(ano);
//		if(account == null) {
//			System.out.println("결과 : 계좌가 없습니다.");
//			return;
//		}
//		account.setBalance(account.getBalance() + money);
//		System.out.println("입금이 완료되었습니다.");
//	}
//	//4. 출금
//	private static void withdraw() {
//		System.out.println("++++++++++++++++");
//		System.out.println("출금허가");
//		System.out.println("++++++++++++++++");
//		System.out.println("계좌번호 : ");
//		String ano = scanner.next();
//		System.out.println("++++++++++++++++");
//		System.out.println("출금액 : ");
//		int money = scanner.nextInt();
//		BankApplication account = findAccount(ano);
//		if(account == null) {
//			System.out.println("결과 : 계좌가 없습니다.");
//			return;
//		}
//		account.setBalance(account.getBalance() - money);
//		System.out.println("출금이 완료되었습니다.");
//		
//	}
//	//
//	private static BankApplication findAccount(String ano) {
//		BankApplication account = null;
//		for(int i = 0; i < accountArray.length; i++) {
//			if(accountArray[i] != null) {
//				String dbAno = accountArray[i].getAno();
//				if(dbAno.equals(ano)) {
//					account = accountArray[i];
//							break;
//				}
//			}
//		}
//	}
//
//}
