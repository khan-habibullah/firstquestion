package prime;
import java.util.Scanner;
public class prim {
	public static void main(String[] args) {		
Scanner myobj = new Scanner(System.in);
int a,b,c,i,j,count=0;
System.out.println("please enter starting number");
a=myobj.nextInt();
System.out.println("please enter ending number");
b=myobj.nextInt();
System.out.printf("the numbers between the given numbers ", a , b);
for(i = a; i <=b; i++)
{
	for( j = 2; j < i; j++)
	{
		if(i % j == 0)
		{
			count = 0;
			break;
		}
		else
		{
			count = 1;
		}
	}
	if(count== 1)
	{
		System.out.println(i);
	}
}
}
}