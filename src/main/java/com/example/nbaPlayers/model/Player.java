package com.example.nbaPlayers.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "nba_players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "display_first_last")
    private String playerName;

    @Column(name = "from_year")
    private int startYear;

    @Column(name = "to_year")
    private int endYear;

    @Column(name = "team_name")
    private String teamName;

}
