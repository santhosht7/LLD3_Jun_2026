package org.example.tictactoe.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerIndex;

    private Game(Builder builder) {
        this.board = new Board(builder.boardSize);
        this.players = builder.players;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerIndex = 0;

        // Randomize the players list
        Collections.shuffle(this.players);
    }

    // Builder class
    public static class Builder {
        private int boardSize;
        private List<Player> players;

        public Builder(int boardSize, List<Player> players) {
            this.boardSize = boardSize;
            this.players = players;
        }

        private void validate() {
            // validations before creating the game
        }

        public Game build() {
            validate();
            return new Game(this);
        }
    }

}
