package fr.uga.l3miage.pc.prisonersdilemma.models;
import fr.uga.l3miage.pc.prisonersdilemma.enums.Action;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;
@Entity
@Getter
@SuperBuilder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TurnEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int turnNumber;

    private int scorePlayerOne;

    private int scorePlayerTwo;

    @ManyToOne
    private GameEntity game;
}



