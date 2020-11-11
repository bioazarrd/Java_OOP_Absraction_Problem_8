package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem0;

public class Galaxy {

    private int row;
    private int col;
    private int[][] matrix;

    public Galaxy(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new int[row][col];
        this.fillInMatrix();
    }

    private void fillInMatrix() {
        int amountGoingToCell = 0;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                this.matrix[i][j] = amountGoingToCell;
                amountGoingToCell++;
            }
        }
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }




    public void setZeros(int row, int col, int i) {
        this.matrix[row][col] = i;
    }





    public int getStarValue(int row, int col) {
        return this.matrix[row][col];
    }
}