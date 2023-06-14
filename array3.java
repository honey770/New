public class array3 {

    public static void main(String args[]){

        int num1[][]=new int[3][]; // Jagged array in this type of array We know the rows but not the columns

        num1[0]=new int[3];
        num1[1]=new int[5];
        num1[2]=new int[7];

        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num1[i].length;j++){

                num1[i][j]=(int)(Math.random()*100);
            }
        }

        //Enhanced for loop 

        for(int n[]:num1){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        System.out.println("Three Dimensional Array");


        int num[][][]=new int[4][5][6];

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                for(int k=0;k<num[i][j].length;k++){
                    num[i][j][k]=(int)(Math.random()*10);
                }
            }
        }

        for(int n[][]:num){
            for(int m[]:n){
                for(int k:m ){

                    System.out.print(k+" ");
                }
                System.out.println(" ");
            }
            System.out.println();
        }

        System.out.println("4 Dimensional Array");

        int num3[][][][]=new int[2][4][5][2];

        for(int i=0;i<num3.length;i++){
            for(int j=0;j<num3[i].length;j++){
                for(int k=0;k<num3[i][j].length;k++){
                    for(int l=0;l<num3[i][j][k].length;l++){
                        num3[i][j][k][l]=(int)(Math.random()*10);
                    }
                }
            }
        }

        for(int n[][][]:num3){
            for(int m[][]:n){
                for(int k[]:m ){
                    for(int l:k){
                        System.out.print(l+" ");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    
}
