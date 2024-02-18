package com.tatolee.projectC.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "board-table")
public class BoardEntity {
    @Id
    private Long id;
    @Column
    private String title;
    @Column
    private String writer;
    @Column
    private String pass;
    @Column
    private String contents;
    @Column
    private int hits;
}
