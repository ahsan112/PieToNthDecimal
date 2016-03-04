import java.util.*;
import java.text.DecimalFormat;

public class PiToNthDecimal {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a number: Max Limit 15");
    int num = in.nextInt();
    
    if(num > 15){
        System.out.println("Error Max Limit Exceeded");
        System.exit(0);
    }
    
    else {
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(num);
        double pie = Math.PI;
        System.out.println(df.format(pie));
        }
    
    
    }
}
