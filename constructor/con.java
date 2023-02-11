package constructor;
import java.util.*;





class rahul{
 String name;
 int age;

  public rahul(){
  Scanner ra = new Scanner(System.in);
  System.out.println("entetr the first name ");
  String name = ra.nextLine();
  System.out.println("enter your age");
  int age  = ra.nextInt();

  System.out.println("your name is :" + name );
  System.out.println("your age is :" + age );

  


    }


   
}
public class con {
    public static void main(String[] args) {
        System.out.println("welocomce to java constructor");
       rahul pa =new rahul();

      
  
        
    }

 
}
