package constructor;


class Student {
    private String name ;
    private int age ;

    public void setName(String name ){
        this.name = name ;

    }

    public void setAge(int age ){
        this.age = age;

    }


    public String getName(){
        return name;

    }

    public int getAge(){
        return age;

    }
}
public class cons {
    public static void main(String[] args) {
        
        System.out.println("welcome to constructor");

        Student ra = new Student();
        ra.setName("rahul kumar " );
        ra.setAge(34);

        System.out.println(ra.getName());
        System.out.println(ra.getAge());
        // ra.getAge();
        // ra.getName();

        // String name = ra.getName();
        // System.out.println(name);
        // int age = ra.getAge();
        // System.out.println(age);


    }
}
