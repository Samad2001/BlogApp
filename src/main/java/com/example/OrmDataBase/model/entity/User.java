package com.example.OrmDataBase.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "istifadeciler") //jpa terefinde table olaraq taninmasi ucun
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tam_ad")//sutun oldugunu bildirir
    private String fullName;

    @Column(name = "tevellud")
    private LocalDate age;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    List<Blog> blogs;

}
