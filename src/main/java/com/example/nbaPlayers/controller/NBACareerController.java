package com.example.nbaPlayers.controller;

import com.example.nbaPlayers.model.Player;
import com.example.nbaPlayers.service.NBACareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/nba")
public class NBACareerController {

    @Autowired
    private NBACareerService nbaCareerService;

    @GetMapping("/longest-careers")
    public ResponseEntity<List<Player>> getLongestCareers() {
        List<Player> longestCareers = nbaCareerService.getLongestCareers();
        return ResponseEntity.ok(longestCareers);
    }
}
