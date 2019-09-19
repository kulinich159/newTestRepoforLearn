package login.libs;

public class WorkWithArray {

    public int[][] createMatrix(int x, int y, int value) {


        int[][] massivMassiv2 = new int[x][y];

//        for (int i = 0; i < x; i++) {
////
////            for (int j = 0; j < y; j++) {
////
////                massivMassiv2[i][j] = value;
//////              System.out.print(massivMassiv2[i][j] + " ");
////    }
////
//////              System.out.println("");
////
        printMatrix(massivMassiv2);
////
////        }
        return massivMassiv2;

    }

    // Заполнение диагонали матрицы - перепроверить - не работает

    public int [][] fillRigtDiagonal(int[][] tempMatrix, int value) {

        // Проверка на то что матрица с квадратной \равной стороной  (добавить проверку на минусовое значение для матрицы)
//        for (int i = 0; i < tempMatrix.length; i++) {
//            if (tempMatrix.length != tempMatrix[i].length){
//                System.out.println("Not square");
//                return tempMatrix;
//            }
//        }

        for (int i = 0; i < tempMatrix.length ; i++) {
            for (int j = 0; j < tempMatrix[i].length; j++) {
                if (i == (tempMatrix[i].length-1)-j) {
                    tempMatrix[i][j] = 1;
                    System.out.print(tempMatrix[i][j] + " ");

                } else {
                    tempMatrix[i][j] = 0;
                    System.out.print(tempMatrix[i][j] + " ");
                }
            }

        }

        printMatrix(tempMatrix);
        return tempMatrix;
    }

    public  void  printMatrix (int [][] tempMatrix) {

        for (int i = 0; i < tempMatrix.length; i++) {
            for (int j = 0; j < tempMatrix[i].length; j++) {
                System.out.print(tempMatrix[i][j]+ " ");

            }

            System.out.println();


        }
    }

}
