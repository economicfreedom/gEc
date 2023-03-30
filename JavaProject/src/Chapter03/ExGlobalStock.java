package Chapter03;

import java.util.Scanner;

public class ExGlobalStock {
public static void main(String[] args) {
	int sellingAmount = 0; //매도금액
	int purchaseAmount = 0; //매수금액
	double transferTax = 0; //양도세
	Scanner sc = new Scanner(System.in);
	
	System.out.print("매수금액을 입력하세요: ");
	purchaseAmount = sc.nextInt();
	System.out.print("매도금액을 입력하세요: ");
	sellingAmount = sc.nextInt();
	
	if(sellingAmount>purchaseAmount) {
		transferTax=(sellingAmount-purchaseAmount)*0.22;
	}else {
		transferTax = 0;
	}

	System.out.print("양도세 = "+transferTax);
	
//	if (sellingAmount>purchaseAmount) {
//		transferTax=(sellingAmount-purchaseAmount)*(22/100);
//	} else if (sellingAmount <= purchaseAmount) {
//		transferTax=0;
//	} else {
//		
//	}
	
	}
}

