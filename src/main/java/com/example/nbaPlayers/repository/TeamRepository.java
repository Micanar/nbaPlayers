package com.example.nbaPlayers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nbaPlayers.model.Team;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    @Query("SELECT t.teamId, t.teamName, COUNT(t) AS playerCount " +
            "FROM Team t WHERE t.rosterstatus <> 0 " +
            "GROUP BY t.teamId,t.teamName")
    List<Object[]> countPlayersPerTeam();
}
