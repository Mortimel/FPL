package com.FPLBE.FPLBE.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
    void getById(int id);

    @Override
    Optional<Player> findById(Integer integer);
}
