package encapsulation;

class Student{
     private int age ;
     private String name ;

      public void Data(int age   ){
       
        this.age = age ;
        
      }

      
      public void Data1(String name ){
       
       this.name = name;
      }

     public void show (){
        System.out.println(age + " " +name );

     }
}


public class rahul {
    public static void main(String[] args) {
        
        System.out.println("welcome to encapsulation");
        Student ra = new Student();
        Student r = new Student();
        Student ma = new Student();

        

    //   ra.name = "rahulklumar";
    //   ra.age = 45;
    //   ra.Data(45);
    //   ra.Data(495);
    // ra.Data(45 );
    // // ra.Data(4048);
    //    r.Data(564);
    //    ra.Data1("rahul ");
    ra.Data(34);
    r.Data(56);

    ra.Data1("rahulkumar");
    r.Data1("pankaj");
    ma.Data(234);
    ma.Data1("kiran devi");

       
      ra.show();
      r.show();
      ma.show();

    }
}
