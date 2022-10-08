//write a program to print grades
public class grades {
    public static void main(String[] args) {
        int m=100;
        if(m<25)
        {
            System.out.println("the grade is f:");
        }
        else if(m<45)
        {
            System.out.println("the grade is e:");
        }
        else if(m<50)
        {
            System.out.println("the grade is d");
        }
        else if(m<60)
        {
            System.out.println("the grade is c");
        }
        else if(m<80)
        {
            System.out.println("the grade is b");;
        }
        else
        {
            System.out.println("the grade is a");
        }
    }
}
