package fr.uga.l3miage.pc.api.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(description = "Join a game")
public class JoinGameRequest {

    @Schema(description = "game id")
    private final double gameId;

    @Schema(description = "username of the player joining the game", example = "oukkaly")
    private final String username;
}

