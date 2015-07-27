import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class MyData {
	
	private int n; //number of items
	private int capacity; //max load weight
	private int[] weights; //the weights of the individual items
	private int[] profits; //the profit for each item type
	private int[] stock; //the total stock levels for each item type
	private int maxWeight; //the weight of the heaviest item type
	private int maxProfit; //the profit of the most profitable item type
	private int maxStock; //the stock level of the most frequent item type
	
    public MyData(String filename) throws IOException {
	    Scanner scanner = new Scanner(new File(filename));
	    n = scanner.nextInt();
	    capacity = scanner.nextInt();
	    weights = new int[n];
	    profits = new int[n];
	    stock = new int[n];
	    maxWeight = 0;
	    maxProfit = 0;
	    maxStock = 0;
	    for (int i=0;i<n;i++){
	        weights[i] = scanner.nextInt();
	        profits[i] = scanner.nextInt();
	        stock[i] = scanner.nextInt();
	        if (weights[i] > maxWeight) maxWeight = weights[i];
	        if (profits[i] > maxProfit) maxProfit = profits[i];
	        if (stock[i] > maxStock) maxStock = stock[i];
	        System.out.println(weights[i] + " " + profits[i] + " " + stock[i]);
	    }
	    scanner.close();
    }
    
    public int getSize() {
    	return n;
    }
    
    public int getCapacity() {
    	return capacity;
    }
    
    public int[] getWeights() {
    	return weights;
    }
    
    public int[] getProfits() {
    	return profits;
    }
    
    public int[] getStock() {
    	return stock;
    }
    
    public int getMaxWeight() {
    	return maxWeight;
    }
    
    public int getMaxProfit() {
    	return maxProfit;
    }

    public int getMaxStock() {
    	return maxStock;
    }
}
