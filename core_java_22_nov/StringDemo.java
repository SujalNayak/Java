//package core_java_22_nov;
//
//import java.util.Iterator;
//import java.util.Scanner;
////
////public class StringDemo {
////	public static void main(String args[]) {
//////+shift+f =>formatting
////		Scanner scr = new Scanner(System.in);
////		System.out.print("Enter Name : ");
////		String name = scr.next(); // next() single word scan
////		System.out.println(name);
////// right click - > run as java application
////// + shift + F II
////		int length = name.length();
////		System.out.println("total char : " + length);
////	}
////}
//
//
////public class StringDemo{
////	public static void main(String[] args) {
////		Scanner scr = new Scanner(System.in);
////		System.out.println("Enter String 1 : ");
////		String string1 = scr.next();
////		System.out.println("Enter String 2 : ");
////		String string2 = scr.next();
////		int len1 = string1.length();
////		int len2 = string2.length();
////		if (len1 == len2) {
////			System.out.println("Possibility");
////
////		} else {
////			System.out.println("Not Same...");
////		}
////	}
////
////}
//
////public class StringDemo {
////	public static void main(String[] args) {
////		int ispossible = 0;
////		Scanner scr = new Scanner(System.in);
////		System.out.println("Enter String 1 : ");
////		String string1 = scr.next();
////		System.out.println("Enter String 2 : ");
////		String string2 = scr.next();
////		int len1 = string1.length();
////		int len2 = string2.length();
////		if (len1 == len2) {
//////			System.out.println("Possibility");
////			for (int i = 0; i < string1.length(); i++) {
////				if (string1.charAt(i) == string2.charAt(i)) {
////					ispossible = 0;
////				} else {
////					ispossible = 1;
////				}
////			}
////			if (ispossible == 0) {
////				System.out.println("Same...");
////			} else {
////				System.out.println("Not Same...");
////			}
////
////		} else {
////			System.out.println("Not Same...");
////		}
////	}
////
////}
//
//
////public class StringDemo
////{
////	public static void main(String[] args) {
////		Scanner scr = new Scanner(System.in);
////		System.out.println("Enter String: ");
////		String str = scr.nextLine();
////		System.out.println(str);
////		String totalwords[] = str.split(" ");
////		int words = 0;
////		for (int i = 0; i< totalwords.length; i++){
//////			System.out.println(totalwords[i]);
////			if(totalwords[i].length() != 0)
////			{
////				words++;
////			}
////		}
////		System.out.println("Total Words : "+words);
////	}
////}
//
//
//
//
//
////public class StringDemo{
////public static void main(String[] args) {
////    String str = new String("royal");
////    System.out.println(str);
////    str.concat("edu");
////    System.out.println("after Concat=>"+ str); 
////    StringBuffer sb = new StringBuffer("royal");
////    System.out.println(sb); sb.append("eud");
////    System.out.println("After Append => " + sb);
////    sb.reverse(); System.out.println(sb);
////    System.out.println(sb.length());
////    String rev = sb.toString();
////    System.out.println(rev); 
////    //take 1 string from user and check its palindrome
////    }
////}
//
//
//
//
//public class StringDemo{
//	public static void main(String[] args) {
//				String str = new String("jony jony yes papa");
//				System.out.println(str);
//				/*
//				str.concat("edu");
//				System.out.println("After concat: "+str);
//				
//				StringBuffer sb = new StringBuffer("royal");
//				System.out.println(sb);
//				sb.append("eud");
//				System.out.println("After append: "+sb);
//				
//				sb.reverse();
//				System.out.println(sb);
//				System.out.println(sb.length());
//				
//				String rev = sb.toString();
//				System.out.println(rev);
//				*/
//				StringBuffer sb = new StringBuffer(str);
//				sb.delete(0,1);
//				sb.insert(0,"J");
//				sb.delete(5,6);
//				sb.insert(5,"J");
////		String str = new String("jony jony yes papa");
////		System.out.println(str);
////		/*
////		str.concat("edu");
////		System.out.println("After concat: "+str);
////		
////		StringBuffer sb = new StringBuffer("royal");
////		System.out.println(sb);
////		sb.append("eud");
////		System.out.println("After append: "+sb);
////		
////		sb.reverse();
////		System.out.println(sb);
////		System.out.println(sb.length());
////		
////		String rev = sb.toString();
////		System.out.println(rev);
////		*/
////		StringBuffer sb = new StringBuffer(str);
////		sb.delete(0,1);
////		sb.insert(0,"J");
////		sb.delete(5,6);
////		sb.insert(5,"J");
////		sb.delete(10,11);
////		sb.insert(10,"Y");
////		sb.delete(14,15);
////		sb.insert(14,"P");
////		String rev = sb.toString();
////		System.out.println(rev);
////		/*
////		if(rev.equals(str)) {
////			System.out.println("palindrome!!");
////		}
////		else {
////			System.out.println("Not palindrome!!");
////		}
//		
//		
//	}
//	}
//}
//
//
//
//
//
//
//
//
