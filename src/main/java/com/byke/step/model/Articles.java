package com.byke.step.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Article")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Articles {

    @Id
    private String article_id;
    private String title;
    private String content;
    private Enum<Visibility> visibility;
}
