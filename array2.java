public class array2 {

    public static void main(String args[]){

        // int num[][]={{41,234},{234,34}};

        // System.out.print(num[1][0]);

        int num1[][]=new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                // if((i+j)%2==0){
                //     num1[i][j]=0;
                // }
                // else{
                //     num1[i][j]=1;
                // }

                num1[i][j]=(int)(Math.random()*10);
            }
        }

        

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        
        // Enhanced for loop 
        
        for(int n[]: num1){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    

    }
    
}
