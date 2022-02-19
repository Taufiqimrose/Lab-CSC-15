// Name - Mohammad Taufique Imrose
//Student ID - 302763110
package Main;


public class Homework6 {

public static void main(String[] args) {
Arithmetic ar;
ar=new Arithmetic(15,16);
System.out.println(ar);
System.out.println(ar.add());
System.out.println(ar.subtract());
System.out.println(ar.multiply());
System.out.println(ar.divide());
System.out.println(ar.modulo());
  
ar.changeValues(30, 31);
System.out.println("\nAfter changing the value");
System.out.println(ar);
System.out.println(ar.add());
System.out.println(ar.subtract());
System.out.println(ar.multiply());
System.out.println(ar.divide());
System.out.println(ar.modulo());
  
System.out.println("Static method : "+Arithmetic.staticAdd(21, 25));
}
  
}