package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		String komanda = "";
		do {
			 
			 komanda = scr.nextLine();
			 if(komanda.isEmpty()) {
				 continue;
			 }
			 
			 String[] kom = komanda.split(" ");
			 if(kom.length!=3) {
				 continue;
			 }
			
		}while(!komanda.equals("End"));
	}

}
