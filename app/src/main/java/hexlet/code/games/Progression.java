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
        final int startNumMax = 50;
        final int startNumMin = 5;
        final int magCounterMax = 5;
        final int magCounterMin = 1;
        final int elementToHideMin = 5;

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int startNum = (int) (Math.random() * ((startNumMax - startNumMin) + 1)) + startNumMin;
            int magCounter = (int) (Math.random() * ((magCounterMax - magCounterMin) + 1)) + magCounterMin;
            int elementToHide = (int) (Math.random() * ((progressionLen - elementToHideMin)));
            String[] tempArr = new String[progressionLen];

            for (int j = 0; j < progressionLen; j++) {
                tempArr[j] = String.valueOf(startNum + magCounter);
                startNum += magCounter;
            }
            Arrays.sort(tempArr);
            answersArr[i] = tempArr[elementToHide];
            tempArr[elementToHide] = "..";
            String s = Arrays.toString(tempArr).replaceAll("[\\[\\]\"]", "").replace(',', ' ').replace("  ", " ");
            questionsArr[i] = s;
        }
        Engine.gameEngine(questionsArr, answersArr, description);
    }
}
