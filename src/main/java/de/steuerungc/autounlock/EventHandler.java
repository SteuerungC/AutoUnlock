package de.steuerungc.autounlock;

import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * Created by Martin on 16.04.2016.
 */
public class EventHandler implements Listener {
    private BackendHandler bh;

    public EventHandler (BackendHandler bh) {
        this.bh = bh;
    }

    @org.bukkit.event.EventHandler
    public void onPlayerChat (AsyncPlayerChatEvent apce) {
        apce.setCancelled(true);
        try {
            switch (ExpressionChecker.isValid(bh.giveWords(1), bh.giveAllowedExpressions(1), bh.giveDeniedExpressions(1), apce.getMessage())) {
                case ExpressionChecker.OK:
                    apce.getPlayer().sendMessage("§aJoa ... das war richtig :)");
                    break;
                case ExpressionChecker.UNKNOWN:
                    apce.getPlayer().sendMessage("§cHmm ... weder richtig noch falsch :|");
                    break;
                case ExpressionChecker.FAILED:
                    apce.getPlayer().sendMessage("§cTja ... das war falsch :(");
                    break;
                default:
                    apce.getPlayer().sendMessage("§cWie auch immer ... nope?");
            }
        } catch (Exception ex) {
            apce.getPlayer().sendMessage("§4EXCEPTION!!! Alles kaputt :(");
            ex.printStackTrace();
        }
    }
}
