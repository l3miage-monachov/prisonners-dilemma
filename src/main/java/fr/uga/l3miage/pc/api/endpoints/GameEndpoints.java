package fr.uga.l3miage.pc.api.endpoints;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/v1.0/game")
public interface GameEndpoints {


    @Operation(description = "Create a game")
    @ApiResponse(responseCode = "200", description = "Game created")
    @ResponseStatus(HttpStatus.OK)
    int createGame(int turnAmount);


    @Operation(description = "Join a game than has already been created")
    @ApiResponse(responseCode = "200", description = "Game joined")
    @ResponseStatus(HttpStatus.OK)
    void joinGame(int gameId);



}
