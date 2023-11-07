package com.example.nbaPlayers.repository;

import com.example.nbaPlayers.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    @Query("SELECT p FROM Player p ORDER BY p.endYear-p.startYear DESC ")
    List<Player> findLongestCareers();
}
