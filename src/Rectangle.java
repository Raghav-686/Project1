import java.util.Scanner;

public class Rectangle {
    int Length;
    int Breadth;

    Rectangle(int Length,int Breadth)
    {
        this.Length=Length;
        this.Breadth=Breadth;
    }

    public int area()
    {
        return Length*Breadth;
    }
    public int perimeter()
    {
        return 2*(Length+Breadth);
    }
}
class Output
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        Rectangle obj=new Rectangle(a,b);
        Rectangle obj1=new Rectangle(c,d);
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
        System.out.println(obj1.area());
        System.out.println(obj1.perimeter());

    }
}
