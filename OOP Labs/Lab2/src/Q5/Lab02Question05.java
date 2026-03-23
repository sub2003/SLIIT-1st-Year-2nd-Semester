package Q5;

import java.util.Scanner;
public class Lab02Question05 {

    public String longestWord(String words[]){
        int wordLength=0;
        String longestWord="";
        for(int i=0;i<5;i++){

            if(wordLength<words[i].length()){
                wordLength=words[i].length();
                longestWord=words[i];
            }
            else if (wordLength==words[i].length()){
                wordLength=words[i].length();
                longestWord=longestWord+" , "+words[i];
            }

        }
        return longestWord;

    }
    public int calcCharacters(String words[]){


        int calcCharacters=0;
        for(int i=0;i< words.length;i++){
            calcCharacters=calcCharacters+words[i].length();
        }
        return calcCharacters;
    }
    public String[] evenNumCharacters(String words[]) {

        String evenWords[] = new String[words.length];
        int j = 0;

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() % 2 == 0) {
                evenWords[j] = words[i];
                j++;
            }
        }

        return evenWords;
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        String words[]=new String[5];

        for(int i=0;i<5;i++) {
            System.out.print("Enter "+(i+1)+" word : ");
            words[i]=scn.nextLine();
        }

        Lab02Question05 obj=new Lab02Question05();
        String longestWord=obj.longestWord(words);

        System.out.println("Longest word = "+longestWord);

        int calCharacters=obj.calcCharacters(words);

        System.out.println("The total number of characters in all word = "+calCharacters);

        String evenW[]=new String[words.length];
        evenW= obj.evenNumCharacters(words);

        System.out.print("The words with even number of characters = ");

        for (int i=0;i<evenW.length;i++){
            System.out.print(evenW[i]);
            if(i!=evenW.length-1){
                System.out.print(",");
            }

        }
    }
}
