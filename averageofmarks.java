import java.util.*;
public class avgofmarks{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks in maths subject:");
int m=sc.nextInt();
System.out.println("enter the marks in physics subject:");
int p=sc.nextInt();
System.out.println("enter the marks in chemistry subject:");
int c=sc.nextInt();
System.out.printf("enter the average of marks in 3 subjects:%.2f",+(m+p+c)/3f);
}
}


