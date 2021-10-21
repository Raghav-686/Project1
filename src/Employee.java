public class Employee
{
    String name;
    int yearofjoining;
    String address;
    public void output()
    {
        System.out.println(name+"    "+yearofjoining+"    "+address);
    }
}
class main
{
    public static void main(String[] args) {
        Employee obj1=new Employee();
        Employee obj2=new Employee();
        Employee obj3=new Employee();
        obj1.name="Aman";
        obj1.yearofjoining=2021;
        obj1.address="Chandigarh";
        obj2.name="Sunil";
        obj2.yearofjoining=2000;
        obj2.address="Mathura";
        obj3.name="Rohan";
        obj3.yearofjoining=2010;
        obj3.address="Agra";
        System.out.println("Name"+"    "+"Year"+"    "+"Address");
        obj1.output();
        obj2.output();
        obj3.output();
    }
}