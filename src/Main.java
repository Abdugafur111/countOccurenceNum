import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count[] = new int[100];
        counter(count);

        for(int i=0; i<count.length; i++){
            if(count[i]>0)
            System.out.println(i + " is " + count[i]);
        }

    }



    public static void counter(int[] count){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        do{

            if(num>=1 && num<=100);
            count[num]++;
        }while(num!=0);
    }
}
