package com.kodilla.cards.repository;

import com.kodilla.cards.domain.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CardRepository extends CrudRepository<Card, Long> {
}
