package com.example.OrmDataBase.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "paylasimlar")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Integer Id;

    @Column(name = "blog_basliglari")
    String header;

    @Column(name = "blog_kontenti")
    String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id") // hansi sutunu foreign key olacagini gosterir
    User user; //reference edeceyi sutun

}
