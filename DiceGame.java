import java.util.Random;
class DiceGame{
    public static void main(String args[]){
	System.out.println("Rolling dice...");
	Random rand = new Random();
	
	int num = rand.nextInt(6)+1;
	System.out.println("Die 1: " + num);
	
	int num2 = rand.nextInt(6)+1;
	System.out.println("Die 2: " + num2);
	System.out.println("Total value: " + (num+num2));
    }
}
