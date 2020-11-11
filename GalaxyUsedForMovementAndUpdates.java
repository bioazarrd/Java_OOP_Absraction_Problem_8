package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem0;
public class GalaxyUsedForMovementAndUpdates {

    private Galaxy galaxy;

    public GalaxyUsedForMovementAndUpdates(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public void evilAcrossGalaxy(int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow < this.galaxy.getRow() && evilCol < this.galaxy.getCol()) {
                galaxy.setZeros(evilRow, evilCol, 0);
            }
            evilRow--;
            evilCol--;
        }
    }


    public int playerAcrossGalaxy(int playerRow, int playerCol) {
        int sum = 0;

        while (playerRow >= 0 && playerCol < this.galaxy.getCol()) {
            if (playerRow < this.galaxy.getRow() && playerCol >= 0) {
                sum += galaxy.getStarValue(playerRow, playerCol);
            }
            playerRow--;
            playerCol++;
        }
        return sum;
    }



}
