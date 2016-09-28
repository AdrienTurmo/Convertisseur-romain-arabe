public class Convertisseur {

    public int RomanToArab(String RomanNumber) {

        char[] RomanChars = RomanNumber.toCharArray();
        int L = RomanChars.length;
        int[] ArabNumbers = new int[L];

        for (int i = 0 ; i<L ; i++) {
            ArabNumbers[i] = RomanToArabUnitaire(RomanChars[i]);
        }

        for (int i = 0 ; i<L-1 ; i++) {
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

        if (ArabNumber-1000>=0){
            return "M"+ArabToRoman(ArabNumber-1000);
        }
        if (ArabNumber-900>=0){
            return "CM"+ArabToRoman(ArabNumber-900);
        }
        if (ArabNumber-500>=0){
            return "D"+ArabToRoman(ArabNumber-500);
        }
        if (ArabNumber-400>=0){
            return "CD"+ArabToRoman(ArabNumber-400);
        }
        if (ArabNumber-100>=0){
            return "C"+ArabToRoman(ArabNumber-100);
        }
        if (ArabNumber-90>=0){
            return "XC"+ArabToRoman(ArabNumber-90);
        }
        if (ArabNumber-50>=0){
            return "L"+ArabToRoman(ArabNumber-50);
        }
        if (ArabNumber-40>=0){
            return "XL"+ArabToRoman(ArabNumber-40);
        }
        if (ArabNumber-10>=0){
            return "X"+ArabToRoman(ArabNumber-10);
        }
        if (ArabNumber-9>=0){
            return "IX"+ArabToRoman(ArabNumber-9);
        }
        if (ArabNumber-5>=0){
            return "V"+ArabToRoman(ArabNumber-5);
        }
        if (ArabNumber-4>=0){
            return "IV"+ArabToRoman(ArabNumber-4);
        }
        if (ArabNumber-1>=0){
            return "I"+ArabToRoman(ArabNumber-1);
        }


        return answer;

    }

    /////////////////////////////////////////////////

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

    /////////////////////////////////////////////////



}

