package ac.za.cput;

public class MyObj {
    private String name;
    private int age;

    public MyObj(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        MyObj myobj = (MyObj) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(myobj.name)
                && this.age == myobj.age){
            status = true;
        }
        return status;
    }
}
