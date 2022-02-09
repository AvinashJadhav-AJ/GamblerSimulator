package com.BridgeLabz.java;

public class GamblerSimulator {
	public static void main(String[] Args ) {
		int stake = 100;
		int bet =1;
		System.out.println("Weclome To Gambler Simulator");
		double Betting = Math.floor(Math.random() * 100) % 2;
		if ( Betting == bet ) {
			stake ++;
			System.out.println("Gambler is Winning $1");
			System.out.println("stake= " + stake);
		}
		else {
			stake --;
			System.out.println("Gambler is loseing $1");
			
		}
	}

}
