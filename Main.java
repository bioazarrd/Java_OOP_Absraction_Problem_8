package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        int[] dimensions = readArrayFromInput(scanner.nextLine());
        Galaxy myGalaxy = new Galaxy(dimensions[0], dimensions[1]);

        Player newPlayer = new Player();

        GalaxyUsedForMovementAndUpdates galaxyUsedForMovementAndUpdates = new GalaxyUsedForMovementAndUpdates(myGalaxy);


        //int matrixRow = dimensions[0];
        //int matrixCol = dimensions[1];
        //int value = 0;
        //for (int i = 0; i < matrixRow; i++) {
        //    for (int j = 0; j < matrixCol; j++) {
        //        matrix[i][j] = value++;
        //    }
        //}



        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {
            int[] player = readArrayFromInput(command);
            int playerRow = player[0];
            int playerCol = player[1];



            command = scanner.nextLine();
            int[] evil = readArrayFromInput(command);
            int evilRow = evil[0];
            int evilCol = evil[1];
            galaxyUsedForMovementAndUpdates.evilAcrossGalaxy(evilRow, evilCol);


            int totalScore = galaxyUsedForMovementAndUpdates.playerAcrossGalaxy(playerRow, playerCol);
            newPlayer.scoreToAdd(totalScore);


            command = scanner.nextLine();
        }
        System.out.println(newPlayer.getScore());
    }




    private static int[] readArrayFromInput(String s) {
        int[] result =  Arrays
                .stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return result;
    }
}