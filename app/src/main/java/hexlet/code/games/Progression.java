package hexlet.code.games;


import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    static final int ROUNDS_COUNT = 3;

    public static void progressionGame() {

        String description = "What number is missing in the progression?";
        int progressionLength = (int) (Math.random() * ((10 - 5) + 1)) + 5;
        String[] numbersArr1;
        String[] numbersArr2;
        String[] numbersArr3;

        String[] questionsArr = new String[ROUNDS_COUNT];
        String[] hiddenElements = new String[3];

        numbersArr1 = finishGenerateSort(progressionLength);
        int hideNumber = (int) (Math.random() * ((numbersArr1.length - 1) + 1));
        hiddenElements[0] = numbersArr1[hideNumber];
        numbersArr1[hideNumber] = "..";
        questionsArr[0] = Arrays.toString(numbersArr1).replaceAll("[\\[\\]\"]", "").replace(',', ' ');

        numbersArr2 = finishGenerateSort(progressionLength);
        hideNumber = (int) (Math.random() * ((numbersArr1.length - 1) + 1));
        hiddenElements[1] = numbersArr2[hideNumber];
        numbersArr2[hideNumber] = "..";
        questionsArr[1] = Arrays.toString(numbersArr2).replaceAll("[\\[\\]\"]", "").replace(',', ' ');

        numbersArr3 = finishGenerateSort(progressionLength);
        hideNumber = (int) (Math.random() * ((numbersArr1.length - 1) + 1));
        hiddenElements[2] = numbersArr3[hideNumber];
        numbersArr3[hideNumber] = "..";
        questionsArr[2] = Arrays.toString(numbersArr3).replaceAll("[\\[\\]\"]", "").replace(',', ' ');

        String[] answersArr = new String[ROUNDS_COUNT];
        System.arraycopy(hiddenElements, 0, answersArr, 0, ROUNDS_COUNT);
        Engine.gameEngine(questionsArr, answersArr, description);
    }

    static String[] generateProgression(int startNum, String[] numbersArr, int magnCounter) {
        String[] newArr = new String[numbersArr.length];
        for (int i = 0; i < numbersArr.length; i++) {
            newArr[i] = String.valueOf(startNum + magnCounter);
            startNum += magnCounter;
        }
        return newArr;
    }

    static String[] finishGenerateSort(int progressionLenght) {
        int startNum = (int) (Math.random() * ((50 - 5) + 1)) + 5;
        int magnCounter = (int) (Math.random() * ((5 - 1) + 1)) + 1;
        String[] numbersArr = new String[progressionLenght];
        numbersArr = generateProgression(startNum, numbersArr, magnCounter);
        Arrays.sort(numbersArr);
        return numbersArr;
    }
}
