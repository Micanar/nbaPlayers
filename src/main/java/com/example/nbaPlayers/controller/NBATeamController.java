package com.example.nbaPlayers.controller;

import com.example.nbaPlayers.model.Team;
import com.example.nbaPlayers.service.NBATeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/nba")
public class NBATeamController {

    @Autowired
    private NBATeamService nbaTeamService;

    @GetMapping("/players-per-team")
    public ResponseEntity<List<Object[]>> getPlayersPerTeam() {
        List<Object[]> playersPerTeam = nbaTeamService.getPlayersPerTeam();
        return ResponseEntity.ok(playersPerTeam);
    }
}
