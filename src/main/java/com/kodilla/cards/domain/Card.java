package com.kodilla.cards.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="cards")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="type")
    private CardType type;
    @Column(name="number")
    private String number;
    @Column(name="expiryDate")
    private String expiryDate;
    @Column(name="cvc")
    private String cvc;
}
