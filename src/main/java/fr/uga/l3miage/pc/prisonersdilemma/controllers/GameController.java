package fr.uga.l3miage.pc.prisonersdilemma.controllers;

import fr.uga.l3miage.pc.api.endpoints.GameEndpoints;
import fr.uga.l3miage.pc.api.requests.GameCreationRequest;
import fr.uga.l3miage.pc.api.requests.JoinGameRequest;
import fr.uga.l3miage.pc.api.requests.PlayTurnRequest;
import fr.uga.l3miage.pc.prisonersdilemma.services.GameService;
import fr.uga.l3miage.pc.prisonersdilemma.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;


@Controller
@RequiredArgsConstructor
public class GameController implements GameEndpoints {

    private final GameService gameService;
    private final PlayerService playerService;


    @Override
    public long createGame(GameCreationRequest gameCreationRequest) {
        return 0;
    }

    @Override
    public void joinGame(JoinGameRequest joinGameRequest) {

    }

    @Override
    public void playTurn(PlayTurnRequest playTurnRequest) {

    }
}
