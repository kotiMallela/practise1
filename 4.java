import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
if(a>100 && a<1000){
 if(a%2==0){
int b = a%3;
System.out.println(b);
}
else if (a%2==1){
int b = a%2;
System.out.println(b);
}
}
else{
System.out.println("wrong number");
}
}
}