package ch.module.cardgame.graphics.playfield;

import ch.module.cardgame.graphics.Board;
import ch.module.cardgame.graphics.cardfield.VisualCardFieldRow;
import ch.module.cardgame.graphics.hand.VisualHand;
import ch.module.cardgame.graphics.player.VisualPlayerStats;
import ch.module.cardgame.player.Player;

import javax.swing.*;

public class VisualPlayerSide {
    private final Player owner;
    private final Board board;
    private final VisualPlayerStats stats;
    private final VisualHand hand;
    private final VisualCardFieldRow cardFieldRow;

    public VisualPlayerSide(Player owner, Board board) {
        this.board = board;
        this.owner = owner;
        stats = new VisualPlayerStats(owner);
        hand = new VisualHand(owner);
        cardFieldRow = new VisualCardFieldRow();
    }

    public void renderBottomUp() {
        board.add(stats);
        board.add(Box.createVerticalGlue());
        board.add(hand);
        board.add(Box.createVerticalGlue());
        board.add(cardFieldRow);
    }

    public void renderTopDown() {
        board.add(cardFieldRow);
        board.add(Box.createVerticalGlue());
        board.add(hand);
        board.add(Box.createVerticalGlue());
        board.add(stats);
    }
}
