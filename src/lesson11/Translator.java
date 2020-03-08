package lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Translator {
    private HashMap<String, String> wordsMap = new HashMap<>();
    private Set<Map.Entry<String, String>> set = wordsMap.entrySet();
    private String key;
    private String value;

    static String parseOneWord(String sentence) {
        if (sentence.indexOf(" ") <= 0) {
            return sentence;
        }
        return sentence.substring(0, sentence.indexOf(" "));
    }

    public HashMap<String, String> getWordsMap() {
        return wordsMap;
    }

    public void setWordsMap(HashMap<String, String> wordsMap) {
        this.wordsMap = wordsMap;
        set = wordsMap.entrySet();
    }

    public void setWord(String key, String value) {
        this.key = key;
        this.value = value;
        addWords();
    }

    private void addWords() {
        wordsMap.put(key, value);
    }

    public String translateSentence(String sentence) {
        String currentWord;
        StringBuilder translatedSentence = new StringBuilder();
        int wordAmount = wordCounter(sentence);
        for (int j = 0; j < wordAmount; j++) {
            currentWord = parseOneWord(sentence);
            sentence = sentence.substring(sentence.indexOf(" ") + 1);
            currentWord = translateWord(currentWord);
            translatedSentence.append(" ").append(currentWord);
        }
        return translatedSentence.toString();
    }

    private int wordCounter(String sentence) {
        String trimmedText = sentence;
        int counter = 1;
        while (trimmedText.indexOf(" ") > 0) {
            trimmedText = trimmedText.substring((trimmedText.indexOf(" ") + 1));
            counter++;
        }
        return counter;
    }

    private String translateWord(String wordToTranslate) {
        String translatedWord;
        for (Map.Entry<String, String> item : set) {
            if (item.getKey().equals(wordToTranslate)) {
                translatedWord = item.getValue();
                return translatedWord;
            }
        }
        return wordToTranslate;
    }
}
