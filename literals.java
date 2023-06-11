class Literals{

    public static void main(String a[]){

        int num=10_00_00_00; // using "_" to make it readable 
        int num1=0b1010;     // for Binary number
        int n=0x01E;         // for Hexadecimal number
        double num2=21e10;
        char c='a';          // char can also treat it as integer 
        boolean b=true;

        System.out.println("Int intialised by binary number : "+num1);
        System.out.println("Int intialised by Hexadecimal number : "+n);
        System.out.println("Interger number with _ under score :-"+num);
        System.out.println("Double using e "+num2);
        System.out.println("Character "+c);
        c++; // incrimenting the char value with one a->b 
        System.out.println("Character after incriment "+c);

    }
}