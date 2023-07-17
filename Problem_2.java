import java.util.Scanner;
public class Problem_2{
    public static void main (String[] args) {
        int i,n=1;
        Scanner s = new Scanner(System.in);
        i=s.nextInt();
        while(i>0){
            System.out.print(n+" ");
            n+=2;
            i--;
        }
        
    }
}
