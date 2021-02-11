package com.kodilla.cards.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardDto {
    private Long id;
    private CardType type;
    private String number;
    private String expiryDate;
    private String cvc;
}
