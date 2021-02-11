package com.kodilla.cards.service;

import com.kodilla.cards.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbCardService {
    @Autowired
    private CardRepository cardRepository;
}
