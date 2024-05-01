package com.example.spring_project_new.domain;


import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
public class BoardVO {
    private Integer no;
    private String title;
    private String content;
    private String writer;
    private String passwd;
    private LocalDate addDate;
    private Integer hit;
}
