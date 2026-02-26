public class onlineclass {
    
    public static void main(String[] args) {
        // 1 2 3 
        // 5 6 7
        int[][] A = { {1,2,3}, {5, 6 , 7}  }; 
        int[][] B = {{9, 7, 4}, {7, 1, 2}};
        // 10 9 7
        // 12 7 9
        
        // A[0][0] = 1
        // A[0][1] = 2
        //
        //
        // A[1][2] = 7
        for (int r = 0; r <2; r++ )
        {
            for (int j=0; j <3; j++)
                System.out.print ("    "+A[r][j]);
            System.out.println();
        }
    }
}