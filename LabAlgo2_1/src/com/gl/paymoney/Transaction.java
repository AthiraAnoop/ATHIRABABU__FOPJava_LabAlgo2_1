package com.gl.paymoney;
import java.util.Scanner;

public class Transaction {
	private int numOfTransact;
	private int[] transactList;
	
	public  Transaction() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		this.numOfTransact=sc.nextInt();
		this.transactList=new int[this.numOfTransact];
		int transactionValue=0;
		for(int i=0;i<numOfTransact;i++) {
			transactionValue++;
			System.out.println("Enter the transaction value at "+ transactionValue);
			this.transactList[i]=sc.nextInt();
		}	
	}
	
	public void checkTargetAcheive(int dailyTarget) {
		int sum=0;
		int transactionCount=0;
		for(int i=0;i<numOfTransact;i++) {
			sum+=this.transactList[i];
			transactionCount++;
			if(sum>=dailyTarget) {
				System.out.println("Target achieved after "+ transactionCount +" transactions");
			    return;
			}
		}
		System.out.println("Target is not achieved.");
	}
	
	public static void main(String[] args) {
		Transaction trans=new Transaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of targets that needs to be achieved:");
		int numOfTargets = sc.nextInt();
		for (int i=1;i<=numOfTargets;i++) {
			System.out.println("Enter the value of target");
			int dailyTarget = sc.nextInt();
			trans.checkTargetAcheive(dailyTarget);
		}
		
	}
}
