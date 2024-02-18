package com.tatolee.projectC.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardDTO {
    private Long id;
    private String title;
    private String writer;
    private String pass;
    private String contents;
    private int hits;
}
