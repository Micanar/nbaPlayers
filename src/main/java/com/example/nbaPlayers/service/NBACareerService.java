package com.example.nbaPlayers.service;

import com.example.nbaPlayers.model.Player;
import com.example.nbaPlayers.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NBACareerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getLongestCareers() {
        List<Player> top20LongestCareers = playerRepository.findLongestCareers();
        return top20LongestCareers.stream().limit(20).collect(Collectors.toList());
    }
}

