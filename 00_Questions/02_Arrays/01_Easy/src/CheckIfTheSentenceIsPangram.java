https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {

    }

    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26){
            return false;
        }
        if (noOfLetters(sentence)==26){
            return true;
        }
        return false;
    }

    int noOfLetters(String sentence){
        int count = 0;
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < sentence.length(); j++){
                if(abc[i] == sentence.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
