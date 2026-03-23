package Q3;

import Q2.Lab02Question02;

import java.util.Scanner;
public class Lab02Question03 {


    public static void main(String[]args){

        Scanner scn=new Scanner(System.in);

        String sentence="";

        System.out.print("Enter a sentence : ");
        sentence=scn.nextLine();

        String words[]=sentence.split(" ");

        Lab02Question03 obj=new Lab02Question03();
        String longest=obj.longestWord(words);
        System.out.println("The longest word is : "+longest);
        obj.displayReverse(sentence);


    }
    public String longestWord(String words[]){

        String longestWord="";
        for(int i =0;i< words.length;i++){
            if(longestWord.length()<words[i].length()){
                longestWord=words[i];
            }
        }
        return longestWord;
    }
    public void displayReverse(String sentence){
        String reversedSentence=new StringBuilder(sentence).reverse().toString();
        System.out.print("The reversed sentence of "+sentence+" : "+reversedSentence);
    }
}
