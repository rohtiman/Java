public class Person{
    protected String name;
    protected String address;

    public Person(){
        System.out.println("Inside Person:Constructor");
        name="";
        address="";
    }

    public Person(String vname, String vaddress){
        this.name = vname;
        this.address = vaddress;
    }

    public String getName(){//method asesor untuk menangani atribut pada sebuah class
        return name;
    }
    
    public String getAddress(){
        return address;
    }

    public void setName(String vname){
        this.name = vname;
    }

    public void setAddress(String vaddress){
        this.address=vaddress;
    }
}