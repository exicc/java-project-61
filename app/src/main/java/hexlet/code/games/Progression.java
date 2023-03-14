package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    static final int STEP_MAX_VALUE = 10;
    static final int STEP_MIN_VALUE = 1;
    static final int FIRST_ELEMENT_MAX_VALUE = 50;
    static final int FIRST_ELEMENT_MIN_VALUE = 5;
    static final int MIN_PROGRESSION_SIZE = 5;
    static final int MAX_PROGRESSION_SIZE = 10;
    static final String DESCRIPTION = "What number is missing in the progression?";

    public static void progressionGame() {


        int progressionSize = Utils.generateNumberInRange(MIN_PROGRESSION_SIZE, MAX_PROGRESSION_SIZE
        );

        String[] questionsArr = new String[Engine.ROUNDS_COUNT];
        String[] answersArr = new String[Engine.ROUNDS_COUNT];


        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int first = Utils.generateNumberInRange(FIRST_ELEMENT_MIN_VALUE, FIRST_ELEMENT_MAX_VALUE);
            int step = Utils.generateNumberInRange(STEP_MIN_VALUE, STEP_MAX_VALUE);
            int hiddenMemberIndex = Utils.generateNumberInRange(0, progressionSize - 1);

            String[] progression = makeProgression(first, progressionSize, step);
            String answer = progression[hiddenMemberIndex];
            answersArr[i] = answer;
            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);
            questionsArr[i] = question;

        }
        Engine.gameEngine(questionsArr, answersArr, DESCRIPTION);
    }

    public static String[] makeProgression(int startElement, int progressionSize, int progressionStep) {
        String[] tempArr = new String[progressionSize];
        for (int i = 0; i < progressionSize; i++) {
            tempArr[i] = String.valueOf(startElement);
            startElement += progressionStep;
        }
        return tempArr;
    }
}
