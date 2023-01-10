package com.bridgelabz.basiccoreprogram;
public class FlipCoin {

	public static void main(String[] args) {
		 int coinFlip;
        int heads = 0;
        int tails = 0;
        System.out.print("Enter the number of times to flip the coin(Positive number): ");
        Scanner sc = new Scanner(System.in);
        coinFlip = sc.nextInt();
        for(int i = 0; i < coinFlip; i++){
            if(Math.random() < 0.5) {
                heads++;
            }
            else {
                tails++;
            }
        }
        System.out.println("Number of Head flips: "+heads+"\nNumber of Tail flips: "+tails);
        //Calculating percentage
        double tailCount = tails / (double) coinFlip* 100 ;
        double headCount = heads/ (double) coinFlip* 100 ;
        System.out.println("Head Percentage: "+headCount+"\nTail Percentage: "+tailCount);

	}
}
