package com.disney.mundo.model.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "characters")
public class Character {
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE )
     Long id;
     String image;
     Integer age;
     Double weight;
     String story;


     //TODO movies
}
