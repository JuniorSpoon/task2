package com.example.task2.WordNote;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class WordNote {

    private LocalDate timestamp;
    private String sentence;

}
