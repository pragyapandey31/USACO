/*
ID: pragya.2
LANG: JAVA
TASK: ride
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class ride{

public static int calculate(String m)
{int sum=1;
for(int i=0;i<m.length();i++)
{
char c=m.charAt(i);
int d=(int)c-64;
sum=sum*d;


}
//System.out.println(sum);
return(sum%47);
}

    public static void main(String[] args)throws IOException {

 BufferedReader f = new BufferedReader(new FileReader("ride.in"));

PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
// String st = new String(f.readLine());

    //    Scanner in = new Scanner(System.in);
String a=f.readLine();
String b=f.readLine();       
if(calculate(a)==calculate(b))
{
out.println("GO");


}
else
{
out.println("STAY");

}
out.close();
}
}



    
    
   
