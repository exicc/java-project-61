package hexlet.code.games;


import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    static final int ROUNDS_COUNT = 3;

    public static void progressionGame() {

        String description = "What number is missing in the progression?";
        final int progressionLen = (int) (Math.random() * ((10 - 5) + 1)) + 5;
        String[] questionsArr = new String[ROUNDS_COUNT];
        String[] answersArr = new String[ROUNDS_COUNT];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int startNum = (int) (Math.random() * ((50 - 5) + 1)) + 5;
            int magCounter = (int) (Math.random() * ((5 - 1) + 1)) + 1;
            int elementToHide = (int) (Math.random() * ((progressionLen - 5)));
            String[] tempArr = new String[progressionLen];

            for (int j = 0; j < progressionLen; j++) {
                tempArr[j] = String.valueOf(startNum + magCounter);
                startNum += magCounter;
            }
            Arrays.sort(tempArr);
            answersArr[i] = tempArr[elementToHide];
            tempArr[elementToHide] = "..";
            questionsArr[i] = Arrays.toString(tempArr).replaceAll("[\\[\\]\"]", "").replace(',', ' ').replace("  ", " ");
        }
        Engine.gameEngine(questionsArr, answersArr, description);
    }
}
