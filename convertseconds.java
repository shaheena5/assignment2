import java.util.*;
public class convertseconds{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter total seconds:");
int totalseconds=sc.nextInt();
int hours=totalseconds/3600;
int remainingseconds=totalseconds%3600;
int minutes=remainingseconds/60;
int seconds=remainingseconds%60;
System.out.println("Hours:"+hours);
System.out.println("minutes:"+minutes);
System.out.println("seconds:"+seconds);
}
}


