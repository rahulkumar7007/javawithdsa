package encapsulation;



class Student {
    private int age ;
   private   String name ;

    public void   Age(int age ){
        this.age = age;

    }
public void Name(String  name ){
    this.name = name ;

}


public void detail(){
    System.out.println(age + " " + name );
}

}



class check {
    

}
public class setter {
    public static void main(String[] args) {
        System.out.println("welcome");
        Student ra = new Student();
        ra.Age(23);
        ra.Name("rahulkumar");

        // ra.show();
        ra.detail();
    }
}
