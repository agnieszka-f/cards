package com.kodilla.cards.controller;

import com.kodilla.cards.domain.Card;
import com.kodilla.cards.domain.CardType;
import com.kodilla.cards.domain.GetCardResponse;
import com.kodilla.cards.mapper.CardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/cards")
@Slf4j
@RefreshScope
public class CardController {
    @Autowired
    CardMapper cardMapper;

    @GetMapping(value = "/{customerId}")
    public GetCardResponse getCards(@PathVariable Long customerId){

        log.info("Get cards for customerID: {}",customerId);

        List<Card> cards = new ArrayList<>();
        cards.add(new Card(1L, CardType.DEBIT_CARD,"1235 3453 1232 7654","07/24","248"));
        cards.add(new Card(2L, CardType.CREDIT_CARD,"1754 6382 4328 3456","01/24","148"));
        return new GetCardResponse(cardMapper.mapToListCardDto(cards));
    }

}
