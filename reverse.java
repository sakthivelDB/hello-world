import java.io.*;

class reverse

{
public static void main(String[]args)throws IOException

{

BufferedReader s=new BufferedReader(new InputStreamReader(System.in));

String a;
a=s.readLine();

a = new StringBuffer(a).reverse().toString()
;
 
System.out.println(a);

}
}