public class Operators {
public static void main(String[] args) {
int x=5,y=9;
System.out.println("Addition:"+(x+y));
System.out.println("Subtraction:"+(x-y));
System.out.println("Multiplication:"+(x*y));
System.out.println("Division:"+(y/x));
System.out.println("Reminder:"+(y%x));
System.out.println("Increment operators:"+(++x)+" "+(x++));
System.out.println("Decrement operators:"+(--x)+" "+(x--));
int t=(y<x)?x:y;
System.out.println("Ternary operator:"+t);
}
}
