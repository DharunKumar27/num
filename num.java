import java.util.Scanner;
class number{
public static void main(String args[])
{
Scanner tt=new Scanner(System.in);
int a;
System.out.println("enter the value:");
a=tt.nextInt();
if(a>0){
System.out.println("positive");
}else if(a==0)
{
System.out.println("zero");
}else{
System.out.println("negative");
}
}
}
