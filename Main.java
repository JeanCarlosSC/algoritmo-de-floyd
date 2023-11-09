public class Main{
    public static void main(String[] args) {
        int[][] d = new int[][] {
            {0, 1, 4, 100, 100},
            {100, 0, 100, 100, 100},
            {100, 6, 0, 100, 100},
            {2, 100, 100, 0, 100},
            {100, 100, 3, 6, 0}
        };
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                for (int k = 0; k < 5; k++) {
                    if(d[i][j]+d[j][k]<d[i][k]) {
                        d[i][k]=d[i][j]+d[j][k];
                    }
                }
            }
            imprimir(d);
            System.out.println();
        }
    }

    private static void imprimir(int[][] d) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
    }
}