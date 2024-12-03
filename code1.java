public class code1
{
 public static void main(String[] args) 
 {
 //int a=44;
 //System.out.println("a"); adding comma means individual value
 //System.out.println(a); and without comma means assingh value to a

 //(implicit type casting)
 // byte a=45;
 //double b;
 //b=a;
 //System.out.println(b); #chota value bde me dala gya h
 

 //(explicit typoe casting)
 double a=45.0;
 int b;
 b=(int)a;
System.out.println(b); //bda value chote me daalne k liye thoda usko guide krna pdega
 } //here result is 45 there is loss of precision(data) in explicit  type casting  
}