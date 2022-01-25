public class IterativeStatement {
public static void main(String[] args) {
int i,j;
forloop:for(i=0;i<10;i++){
j=i+1;
whileloop:while(j<20){
System.out.println(j);
if(j==12)
break forloop;
else if(j==15)
continue whileloop;
j++;
}
 }
}
}
