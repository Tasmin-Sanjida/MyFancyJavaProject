import java.util.Scanner;  
public class TestClass 
{  
public static void main(String[] args)  
{  
int m, j, row;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number of rows you want to print: ");  
row = sc.nextInt();          
for (m= 0; m<= row-1; m++)  
{
System.out.println("");
for (j=0; j<=m; j++)   
{  
System.out.print("*"+ " ");
}  
} 
System.out.println(""); 
for (m=row-1; m>=0; m--)  
{  
for(j=0; j <= m-1;j++)  
{  
System.out.print("*"+ " ");  
}  
System.out.println("");  
}  
}  
} 