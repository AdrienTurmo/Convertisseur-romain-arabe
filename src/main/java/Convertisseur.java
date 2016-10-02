public class Convertisseur {


    public int romanToArab(String romanNumber) {
        int[] arabNumbersConverted = convertEachRomanLetterToNumber(romanNumber);
        int[] arabNumbersRelative = makeNumberNegativeWhenNumberIsLessThanTheFollowingOne(arabNumbersConverted);
        return sum(arabNumbersRelative);
    }

    public String arabToRoman(int arabNumber) {
        String answer = "";
        int[] specialNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int index = 0; index < 13; index++) {
            int specialNumber = specialNumbers[index];
            if (arabNumber - specialNumber >= 0) {
                return romanLetters[index] + arabToRoman(arabNumber - specialNumber);
            }
        }
        return answer;
    }

    private int romanToArabUnit(char romanLetter) {
        int answer = 0;
        switch (romanLetter) {
            case 'I':
                answer = 1;
                break;
            case 'V':
                answer = 5;
                break;
            case 'X':
                answer = 10;
                break;
            case 'L':
                answer = 50;
                break;
            case 'C':
                answer = 100;
                break;
            case 'D':
                answer = 500;
                break;
            case 'M':
                answer = 1000;
                break;
        }
        return answer;
    }

    private int sum(int[] intArray) {
        int sum = 0;
        for (int anIntArray : intArray) {
            sum += anIntArray;
        }
        return sum;
    }

    private int[] convertEachRomanLetterToNumber(String romanNumber) {
        char[] romanChars = romanNumber.toCharArray();
        int numberOfLetters = romanChars.length;
        int[] arabNumbers = new int[numberOfLetters];
        for (int index = 0; index < arabNumbers.length; index++) {
            arabNumbers[index] = romanToArabUnit(romanChars[index]);
        }
        return arabNumbers;
    }

    private int[] makeNumberNegativeWhenNumberIsLessThanTheFollowingOne(int[] arabNumbersConverted) {
        int[] arabNumbersRelative = new int[arabNumbersConverted.length];
        int numberOfNumberToCheck = arabNumbersRelative.length - 1;
        for (int index = 0; index < numberOfNumberToCheck; index++) {
            int numberToCheck = arabNumbersConverted[index];
            arabNumbersRelative[index] = (numberToCheck < arabNumbersConverted[index + 1]) ? -numberToCheck : numberToCheck;
        }
        arabNumbersRelative[numberOfNumberToCheck] = arabNumbersConverted[numberOfNumberToCheck];
        return arabNumbersRelative;
    }

}

