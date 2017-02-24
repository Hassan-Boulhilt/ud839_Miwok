package com.example.android.miwok;
/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * it contains a translation of word Miwok to word English and word English to word Miwok
 * Created by Hassan on 23/02/2017.
 */

 class Word {
    // Private fields or states of translation Miwok and English
    private String wordEnglish;
    private String wordMiwok;
    // Public empty constructor Word
    public Word(){}

    /**
     * Public constructor Word where we initialize the states or instance variables
     * @param wordEnglish Default language
     * @param wordMiwok   Translated language
     */
     Word(String wordEnglish, String wordMiwok){
        this.wordEnglish = wordEnglish;
        this.wordMiwok = wordMiwok;
    }

    /**
     * method with no arguments that return word translation in English
     * @return wordEnglish
     */
     String getWordEnglish(){
        return wordEnglish;
    }

    /**
     * method with no parameters  that return word translation in Miwok
     * @return wordMiwok
     */
    String getWordMiwok(){
        return wordMiwok;
    }

    /**
     * Method with parameters that return a specific word translated to English word
     * @param str string hold any word Miwok
     * @return str English word after translation
     *
     */
     String getWordEnglish(String str){
        return str = wordEnglish;
    }

    /**
     * Method with parameters that return a specific word translated to Miwok word
     * @param str string hold any word English
     * @return str Miwok word after translation
     */
    String getWordMiwok(String str){
        return str=  wordMiwok;
    }
}
