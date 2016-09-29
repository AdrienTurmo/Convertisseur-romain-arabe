import static javafx.scene.input.KeyCode.L;

public class Convertisseur {


    public int RomanToArab(String RomanNumber) {

        char[] RomanChars = RomanNumber.toCharArray();
        int length_RomanNumber = RomanChars.length;
        int[] ArabNumbers = new int[length_RomanNumber];
        for (int i = 0;i<length_RomanNumber;i++) {
            ArabNumbers[i] = RomanToArabUnitaire(RomanChars[i]);
        }
        for (int i = 0;i<length_RomanNumber-1;i++) {
            int First = ArabNumbers[i];
            int Next = ArabNumbers[i+1];
            if (First < Next ) {
                ArabNumbers[i] = -First;
            }
        }

        return SumArray(ArabNumbers);
    }

    public String ArabToRoman(int ArabNumber) {
        String answer = "";
        int[] SpecialNumbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] RomanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for (int i=0;i<13;i++){
            int NumberComparedTo = SpecialNumbers[i];
            if (ArabNumber-NumberComparedTo>=0){
                return RomanLetters[i]+ArabToRoman(ArabNumber-NumberComparedTo);
            }
        }
        return answer;
    }



    private int RomanToArabUnitaire(char RomanLetter) {
        int answer = 0;
        switch(RomanLetter) {
            case 'I': answer = 1;
                break;
            case 'V': answer = 5;
                break;
            case 'X': answer = 10;
                break;
            case 'L': answer = 50;
                break;
            case 'C': answer = 100;
                break;
            case 'D': answer = 500;
                break;
            case 'M': answer = 1000;
                break;
        }
        return answer;
    }

    private int SumArray(int[] IntArray) {
        int sum = 0;
        for (int i = 0 ; i < IntArray.length ; i++){
            sum = sum + IntArray[i];
        }
        return sum;
    }



}

