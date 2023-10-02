package com.mafanasiev.quiz.category;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "quiz_category")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuizCategory {
    @Id
    private Long id;
    private String name;

    @Override
    public String toString(){
        return this.getClass().getName() + ":" + id;
    }
}
