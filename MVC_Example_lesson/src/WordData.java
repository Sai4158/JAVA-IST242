
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ffonseca
 */
class WordData
{

    private ArrayList<String> wordBank = new ArrayList();
    private ArrayList<String> guesses;
    int currentWord = 0;

    public WordData()
    {
        fillWordBank();
        getNewWord();
    }

    public void fillWordBank()
    {
        String word1 = "computer";
        String word2 = "house";
        String word3 = "board";
        wordBank.add(word1);
        wordBank.add(word2);
        wordBank.add(word3);

    }

    public String getNewWord()
    {
        currentWord = new Random().nextInt(wordBank.size());
        String randomWord = wordBank.get(currentWord);
        createGuesses(randomWord.length());
        System.out.println("new word=" + randomWord);
        return randomWord;
    }

    public boolean hasLetter(String s)
    {
        int i = wordBank.get(currentWord).indexOf(s);
        if (i < 0)
        {
            System.out.println("NO" + s);
            return false;
        }
        fillGuesses(s, i);
        return true;
    }

    public int getWordLength()
    {
        return wordBank.get(currentWord).length();
    }

    private void fillGuesses(String s, int i)
    {
        guesses.set(i, s);
    }

    private void createGuesses(int l)
    {
        guesses = new ArrayList();
        for (int i = 0; i < l; i++)
        {
            guesses.add(" ");
        }
    }

    public ArrayList<String> getGuesses()
    {
        return guesses;
    }

    public void setGuesses(ArrayList<String> guesses)
    {
        this.guesses = guesses;
    }

}
