package com.example.task2.WordNote;

import com.example.task2.utils.RandomNumberGenerator;
import com.example.task2.utils.RandomStringGenerator;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.LocalDate;

@Component
public class WordNoteFakeDAO {

    public WordNote getWordNote() {
        return WordNote.builder()
                .timestamp(LocalDate.now())
                .sentence(getGeneratedSentence())
                .build();
    }

    private String getGeneratedSentence() {
        StringBuilder sb = new StringBuilder();
        String randomString;
        int wordsNumber = RandomNumberGenerator.getRandomNumber(2, 10);
        for (int i = 0; i < wordsNumber + 1; i++) {
            randomString = RandomStringGenerator.randomString(RandomNumberGenerator.getRandomNumber(3, 15));
            if (i == 0) {
                randomString = StringUtils.capitalize(randomString);
            }
            sb.append(randomString);
            if (i != wordsNumber) {
                sb.append(" ");
            } else {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
