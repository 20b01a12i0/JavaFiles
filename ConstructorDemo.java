class Student{
int regdno;
int marks;
public Student(){
regdno=0;
marks=0;
}
public Student(int regdno,int marks){
this.regdno=regdno;
this.marks=marks;
}
public void displayStudent(){
System.out.println("regdno:"+regdno);
System.out.println("Marks:"+marks);
}
}
public class ConstructorDemo {
public static void main(String[] args) {
Student st1=new Student();
Student st2=new Student(1208,98);
st1.displayStudent();
st2.displayStudent();
}
}
