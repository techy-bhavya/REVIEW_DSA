public class towerOfHanoi
{
    public static void printTowerOfHanoi(int n, int A, int C, int B){
        if(n==0)
            return;
        printTowerOfHanoi(n-1,A,B,C);
        System.out.println("Moving disk "+n+" from "+A+" to "+ C);
        printTowerOfHanoi(n-1,B,C,A);
    }
    
	public static void main(String[] args) {
		printTowerOfHanoi(3,10,30,20); //send disks from A to C using B
		//2 raised to the power n-1 is minimum no of moves to do it.
	}
}







