package fr.uga.l3miage.pc.prisonersdilemma.models;

import fr.uga.l3miage.pc.prisonersdilemma.enums.Action;

import javax.persistence.*;

public class PlayerTurnAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Action action;
}
