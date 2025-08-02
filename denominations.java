import java.util.*;
public class denominations{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter amount in rupees :");
int amount=sc.nextInt();
int thousandrupees=amount/1000;
amount%=1000;
int fivehundredrupees=amount/500;
amount%=500;
int remaining=amount;
System.out.println("1000s:"+thousandrupees);
System.out.println("500s:"+fivehundredrupees);
System.out.println("remaining:"+amount);
}
}
