class TernaryO1{

    public static void main(String args[]){

        int x=2343;

        if (x%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");

        System.out.println("Another Way To do is byyyyyy Ternary Operator");

        String result=(x%2==0)?"Even":"odd";

        System.out.print(result);
    }
}