package com.example.bulletin;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;


    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;


    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

  /*  @Builder
    public Question(Integer id, String subject, String content, LocalDateTime createDate) {
        this.id = id;
        this.subject = subject;
        this.content = content;
        this.createDate = createDate;
    }

    public void changeSubject(String subject) {
        this.subject = subject;
    }

    public void changeContent(String content) {
        this.content = content;
    }
    public Question() {
    }*/


}
