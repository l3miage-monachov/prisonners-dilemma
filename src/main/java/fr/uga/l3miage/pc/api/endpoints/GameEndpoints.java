package fr.uga.l3miage.pc.api.endpoints;

import fr.uga.l3miage.pc.api.requests.GameCreationRequest;
import fr.uga.l3miage.pc.api.requests.JoinGameRequest;
import fr.uga.l3miage.pc.api.requests.PlayTurnRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/v1.0/game")
public interface GameEndpoints {


    @Operation(description = "Create a game")
    @ApiResponse(responseCode = "200", description = "Game created")
    @ResponseStatus(HttpStatus.OK)
    long createGame(@RequestBody GameCreationRequest gameCreationRequest);


    @Operation(description = "Join a game than has already been created")
    @ApiResponse(responseCode = "200", description = "Game joined")
    @ResponseStatus(HttpStatus.OK)
    void joinGame(@RequestBody JoinGameRequest joinGameRequest);


    @Operation(description = "play your turn")
    @ApiResponse(responseCode = "200", description = "Game joined")
    @ResponseStatus(HttpStatus.OK)
    void playTurn(@RequestBody PlayTurnRequest playTurnRequest);


}
