package org.example;

public class Language {

    private String ukraine;
    private String english;

    private int index=0;

    public Language(String ukraine, String english) {
        this.ukraine = ukraine;
        this.english = english;
    }

    public String getUkraine() {
        return ukraine;
    }

    public void setUkraine(String ukraine) {
        this.ukraine = ukraine;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    public void show(){
        System.out.println("Ukraine: " + ukraine + "  English : " + english);
    }
}
