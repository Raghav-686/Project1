import java.util.Scanner;

public class EmployeeSalary {
    int salary;
    int hrs;
    public void getinfo()
    {
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        int work=sc.nextInt();
    }
    public void AddSal()
    {
        if(salary < 500)
        {
            salary=salary+10;
        }
    }
    public void AddWork()
    {
        if(hrs > 6)
        {
            salary=salary+5;
        }
        System.out.println(salary);
    }

    public static void main(String[] args) {
        EmployeeSalary obj=new EmployeeSalary();
        obj.getinfo();
        obj.AddSal();
        obj.AddWork();
    }

}
