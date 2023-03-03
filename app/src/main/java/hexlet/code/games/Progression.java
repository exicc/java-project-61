package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.RandomGen;

import java.util.Arrays;

public class Progression {
    static final int ROUNDS_COUNT = Engine.getRoundsCount();
    static final int PROGRESSION_STEP_MAX_VALUE = 10;
    static final int PROGRESSION_STEP_MIN_VALUE = 1;
    static final int START_ELEMENT_MAX_VALUE = 50;
    static final int START_ELEMENT_MIN_VALUE = 5;
    static final int MIN_PROGRESSION_SIZE = 5;
    static final int MAX_PROGRESSION_SIZE = 10;
    static final String DESCRIPTION = "What number is missing in the progression?";

    public static void progressionGame() {



        int progressionSize = RandomGen.getRandomNumbersInRange(MAX_PROGRESSION_SIZE,
                MIN_PROGRESSION_SIZE);

        String[] questionsArr = new String[ROUNDS_COUNT];
        String[] answersArr = new String[ROUNDS_COUNT];


        for (int i = 0; i < ROUNDS_COUNT; i++) {

            int progressionStep = RandomGen.getRandomNumbersInRange(PROGRESSION_STEP_MAX_VALUE,
                    PROGRESSION_STEP_MIN_VALUE);

            int startElement = RandomGen.getRandomNumbersInRange(START_ELEMENT_MAX_VALUE,
                    START_ELEMENT_MIN_VALUE);

            int elementToHide = RandomGen.getRandomNumber(progressionSize);

            String[] tempArr = new String[progressionSize];

            for (int j = 0; j < progressionSize; j++) {

                tempArr[j] = String.valueOf(startElement);
                startElement += progressionStep;
            }
            answersArr[i] = tempArr[elementToHide];
            tempArr[elementToHide] = "..";
            String s = Arrays.toString(tempArr)
                    .replaceAll("[\\[\\]\"]", "")
                    .replace(',', ' ')
                    .replace("  ", " ");
            questionsArr[i] = s;
        }
        Engine.gameEngine(questionsArr, answersArr, DESCRIPTION);
    }
    // TODO реализовать генерацию прогрессии в функции
    //public static progressionGeneration()
}
