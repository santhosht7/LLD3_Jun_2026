package org.example.tictactoe.models;

public class BotPlayer extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    public BotPlayer(String name,
                     Symbol symbol,
                     BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }
}
