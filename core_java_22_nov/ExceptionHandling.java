//package core_java_22_nov;
//
//import java.util.Scanner;
//
//public class ExceptionHandling {
////	public static void main(String[] args) {
////		Scanner scr = new Scanner(System.in);
////		System.out.println("Enter email");
////		String email = scr.next();
////		if (!email.contains("icici.com")) {
////			throw new EmailException();
////
////		}
////
////		System.out.println("email -> " + email);
////
////		System.out.println("Enter  number");
////		int a = scr.nextInt();
////		System.out.println(a);
////
////	}
////
////}
////
////
////class EmailException extends RuntimeException {
////	public EmailException() {
////		super("Invalid Email Exception");
////	}
//	
//
//		public static void main(String[] args) {
//			Scanner scr = new Scanner(System.in);
//			System.out.println("Enter number:");
//			int a = scr.nextInt();
//			System.out.println(a);
//			
//			scr.close();
//		}
//		
//		void add() {
//			Scanner scr = null;
//			try {
//				scr = new Scanner (System. in);
//				System.out.println("Enter number:");
//				int a = scr.nextInt();
//				System.out.println(a);
//				} finally {
//				scr.close();
//				}
//		}
//	
//		
//		void sub() {
//			try (Scanner scr = new Scanner (System. in);
//					{
//						System.out.println("Enter number");
//						int a = scr.nextInt();
//						System.out.println(a);
//					)
//					void mul () {
//}
//					}}}}