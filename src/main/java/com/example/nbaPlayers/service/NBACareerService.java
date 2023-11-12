package com.example.nbaPlayers.service;

import com.example.nbaPlayers.model.Player;
import com.example.nbaPlayers.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NBACareerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getLongestCareers() {
        Pageable pageable = PageRequest.of(0,20);
        List<Player> top20LongestCareers = playerRepository.findLongestCareers(pageable);
        return top20LongestCareers;
    }
}

