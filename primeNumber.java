package oop25_10;
public class primeNumber {
public static void main(String[] args) {
	System.out.println("prime number between 1 to 100 is:");
	int n;
	int i=0
			;
	for(n=2;n<100;n++) {
		boolean flag=true;
        for ( i = 2; i <Math.sqrt(n); i++) {
            if (n % i == 0) {
            	 flag=false;
            	break;
            	
            }
        }
	
            if(flag);
            {
            	System.out.println(n+" ");
            }
}
}
}