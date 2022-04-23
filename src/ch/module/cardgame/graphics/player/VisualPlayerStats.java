package ch.module.cardgame.graphics.player;

import ch.module.cardgame.graphics.text.NumberIndicator;
import ch.module.cardgame.graphics.utils.ColorPalette;
import ch.module.cardgame.player.Player;

import javax.swing.*;
import java.awt.*;

public class VisualPlayerStats extends JPanel {
    private final Player owner;
    private final NumberIndicator health;
    private final NumberIndicator energy;

    public VisualPlayerStats(Player owner) {
        this.owner = owner;
        health = new NumberIndicator(owner.getStats().getHealth() + "");
        energy = new NumberIndicator(owner.getStats().getEnergy() + "");
        visualizeStats();
        setVisible(true);
    }

    private void visualizeStats() {
        health.setForeground(ColorPalette.HEALTH);
        energy.setForeground(ColorPalette.ENERGY);
        add(health, BorderLayout.WEST);
        add(energy, BorderLayout.EAST);
    }

    public void rerender() {
        health.setText(owner.getStats().getHealth() + "");
        energy.setText(owner.getStats().getEnergy() + "");
        revalidate();
    }
}