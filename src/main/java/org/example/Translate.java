package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Translate {

   List<Language> languages = new ArrayList<>();

    public Translate(String ukraine,String english) {
        languages.add(new Language(ukraine,english));
    }
    public void addTranslate(String ukraine,String english){
        languages.add(new Language(ukraine,english));
    }
    public void showWord(String word){
        Language language = null;
        for (int i = 0; i < languages.size(); i++) {
          if(Objects.equals(languages.get(i).getUkraine(), word)){
              languages.get(i).show();
              int index= languages.get(i).getIndex();
              index ++;
              languages.get(i).setIndex(index);
          }
        }
    }
    public void showLowPopular(){
      sortLanguagesByIndex();
        int n=languages.size();
      if(n>10){
          n=10;
      }

        Language language = null;
        for (int i = 0; i < n; i++) {
                languages.get(i).show();
                int index= languages.get(i).getIndex();
                index ++;
                languages.get(i).setIndex(index);
        }
    }
    public void showUpPopular(){
        sortLanguagesByIndex();
        int n=languages.size();
        if(n>10){
            n=10;
        }
        Language language = null;
        for (int i = n - 1; i >= 0; i--) {
            languages.get(i).show();
            int index = languages.get(i).getIndex();
            index++;
            languages.get(i).setIndex(index);
        }
    }

    public void readWordAndTranslate(String word,String ukraine,String english){
        Language language = null;
        for (int i = 0; i < languages.size(); i++) {
            if(Objects.equals(languages.get(i).getUkraine(), word)){
                languages.get(i).setUkraine(ukraine);
                languages.get(i).setEnglish(english);
            }
        }
    }

    public void readWord(String word,String newWord){
        for (int i = 0; i < languages.size(); i++) {
            if(Objects.equals(languages.get(i).getUkraine(), word)){
                languages.get(i).setUkraine(newWord);
            }
        }
    }
    public void readTranslate(String word,String newWord){
        for (int i = 0; i < languages.size(); i++) {
            if(Objects.equals(languages.get(i).getEnglish(), word)){
                languages.get(i).setEnglish(newWord);
            }
        }
    }



    public void deleteWord(String word){
        Language language = null;
        for (int i = 0; i < languages.size(); i++) {
            if(Objects.equals(languages.get(i).getUkraine(), word)){
                languages.get(i).setUkraine("");
            }
        }
    }
    public void deleteTranslate(String translate){
        Language language = null;
        for (int i = 0; i < languages.size(); i++) {
            if(Objects.equals(languages.get(i).getEnglish(), translate)){
                languages.get(i).setEnglish("");
            }
        }
    }
    public void sortLanguagesByIndex() {
        int n = languages.size();
        Language temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (languages.get(j - 1).getIndex() > languages.get(j).getIndex()) {
                    temp = languages.get(j - 1);
                    languages.set(j - 1, languages.get(j));
                    languages.set(j, temp);
                }
            }
        }
    }
}
