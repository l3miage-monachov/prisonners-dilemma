package fr.uga.l3miage.pc.prisonersdilemma.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@SuperBuilder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameEntity {

    @Id
    private int gameID;

    private int totalScore;

    @OneToMany
    @JoinColumn(name = "gamePlayer", referencedColumnName = "username")
    private List<PlayerEntity> players;

    //cascade = CascadeType.ALL, orphanRemoval = true
}
