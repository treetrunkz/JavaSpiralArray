public class mala {

public static void main(String[] args) {

printArray(gPerSquare(3));

}

public static int[][] gPerSquare(int dimensions){

int[][] spiralArray = new int[dimensions][dimensions];

int ceiling = (int)Math.ceil((dimensions) / 2.0);

int j;
int dimension = dimensions;
int currentNum = 0;


for(int i=0 ; i < ceiling; i++){


for(j=0; j < dimensions; j++){

spiralArray[i][i+j] = currentNum++;

}

for(j= 1; j < dimensions; j++){

spiralArray[i+j][dimensions - 1 - i] = currentNum++;

}

for(j = dimensions - 2; j > 0; j--){

spiralArray[dimensions - 1- i][i + j] = currentNum++;

}

for(j = dimensions - 2; j > 0; j--){

spiralArray[i+j][i] = currentNum++;

}

dimensions -= 2;
}

return spiralArray;



}

public static void printArray(int[][] array) {

for(int row[] : array){

for(int elem : row){

System.out.printf("%3d", elem);

//width of each print with width controller

}
System.out.println();


}
}
}