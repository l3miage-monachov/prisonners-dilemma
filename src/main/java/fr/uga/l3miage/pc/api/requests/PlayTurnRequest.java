package fr.uga.l3miage.pc.api.requests;
import fr.uga.l3miage.pc.prisonersdilemma.enums.Action;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(description = "Player's turn")
public class PlayTurnRequest {
    @Schema(description = "game id")
    private final double gameId;

    @Schema(description = "username of the player joining the game", example = "oukkaly")
    private final String username;

    @Schema(description = "the action of the player", example = "BETRAY")
    private final Action action;
}
