package com.example.task2.WordNote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordNoteService {

    private final WordNoteFakeDAO wordNoteFakeDAO;

    @Autowired
    public WordNoteService(WordNoteFakeDAO wordNoteFakeDAO) {
        this.wordNoteFakeDAO = wordNoteFakeDAO;
    }

    public WordNote getWordNote() {
        return wordNoteFakeDAO.getWordNote();
    }

    public List<WordNote> getWordNotes(Integer times) {
        return wordNoteFakeDAO.getWordNotes(times);
    }
}
