package com.example.task2.WordNote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/t2/note")
public class WordNoteController {

    private final WordNoteService wordNoteService;

    @Autowired
    public WordNoteController(WordNoteService wordNoteService) {
        this.wordNoteService = wordNoteService;
    }

    @GetMapping
    public WordNote getWordNote() {
        return wordNoteService.getWordNote();
    }
}
