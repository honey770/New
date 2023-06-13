// Adding two numbers in different class 
// Creating an Cal class and creating an add function or method in it


class cal{

    public int add(int n1,int n2){

        return n1+n2;
    }
}

public class oops1 {
    public static void main(String args[]){

        cal c=new cal();

        int num1=23;
        int num2=234;

        int r=c.add(num1,num2);

        System.out.println(r);


    }
}
