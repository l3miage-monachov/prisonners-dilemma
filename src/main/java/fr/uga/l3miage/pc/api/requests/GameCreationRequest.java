package fr.uga.l3miage.pc.api.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(description = "Day creation")
public class GameCreationRequest {
    @Schema(description = "amount of turns during a single game")
    private final int turnAmount;

    @Schema(description = "username of the player creating th game", example = "bougaysti")
    private final String username;
}
