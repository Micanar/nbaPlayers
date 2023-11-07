package com.example.nbaPlayers.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "nba_players")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long teamId;
    @Column(name = "team_name")
    private String teamName;
    @Transient
    private Long playerCount;
    @Column(name = "rosterstatus")
    private int rosterstatus;


}
