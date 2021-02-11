package com.kodilla.cards.mapper;

import com.kodilla.cards.domain.Card;
import com.kodilla.cards.domain.CardDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CardMapper {
    public Card mapToCard(CardDto cardDto){
        return new Card(cardDto.getId(), cardDto.getType(), cardDto.getNumber(), cardDto.getExpiryDate(), cardDto.getCvc());
    }

    public CardDto mapToCardDto(Card card){
        return new CardDto(card.getId(),card.getType(), card.getNumber(),card.getExpiryDate(),card.getCvc());
    }

    public List<Card> mapToListCard(List<CardDto> cardDtoList){
        return cardDtoList.stream()
                .map(x -> new Card(x.getId(),x.getType(),x.getNumber(),x.getExpiryDate(),x.getCvc()))
                .collect(Collectors.toList());
    }

    public List<CardDto> mapToListCardDto(List<Card> cardList){
        return cardList.stream()
                .map(x -> new CardDto(x.getId(),x.getType(),x.getNumber(),x.getExpiryDate(),x.getCvc()))
                .collect(Collectors.toList());
    }
}
