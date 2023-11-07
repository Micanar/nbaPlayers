    package com.example.nbaPlayers.service;


    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import com.example.nbaPlayers.repository.TeamRepository;

    import java.util.List;

    @Service
    public class NBATeamService {

        @Autowired
        private TeamRepository teamRepository;

        public  List<Object[]> getPlayersPerTeam() {
            return teamRepository.countPlayersPerTeam();
        }
    }
