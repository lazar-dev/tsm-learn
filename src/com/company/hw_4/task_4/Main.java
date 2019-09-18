package com.company.hw_4.task_4;

public class Main {

    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        Word(text, "alert");
        Word(text, "add");
        Word(text, "good");
        Word(text, "plan");
        Word(text, "game");
            }

    public static void Word(String fulltext, String word){
        String[] str = fulltext.split(word);
        if (str.length>1){
            System.out.println("Слово: " + word +" Встречается в тексте "+ (str.length -1) + " раз.");
        }
        else System.out.println("Слово " + word + " Не встречается в тексте ");
    }
}
