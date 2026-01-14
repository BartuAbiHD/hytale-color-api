package me.bartuabihd.hytaleutils;

import java.util.*;
import com.hypixel.hytale.server.core.*;

public class ChatColor
{
    private static final Map<Character, String> COLORS;

    public static Message parse(final String text) {
        final Message message = Message.empty();
        final StringBuilder currentText = new StringBuilder();
        String currentColor = "#ffffff";
        for (int i = 0; i < text.length(); ++i) {
            final char ch = text.charAt(i);
            if (ch == '&' && i + 1 < text.length()) {
                final String newColor = ChatColor.COLORS.get(Character.toLowerCase(text.charAt(i + 1)));
                if (newColor != null) {
                    if (currentText.length() > 0) {
                        message.insert(Message.raw(currentText.toString()).color(currentColor));
                        currentText.setLength(0);
                    }
                    currentColor = newColor;
                    ++i;
                    continue;
                }
            }
            currentText.append(ch);
        }
        if (currentText.length() > 0) {
            message.insert(Message.raw(currentText.toString()).color(currentColor));
        }
        return message;
    }

    static {
        COLORS = Map.ofEntries(new Map.Entry[] { Map.entry((Object)'0', (Object)"#000000"), Map.entry((Object)'1', (Object)"#0000aa"), Map.entry((Object)'2', (Object)"#00aa00"), Map.entry((Object)'3', (Object)"#00aaaa"), Map.entry((Object)'4', (Object)"#aa0000"), Map.entry((Object)'5', (Object)"#aa00aa"), Map.entry((Object)'6', (Object)"#ffaa00"), Map.entry((Object)'7', (Object)"#aaaaaa"), Map.entry((Object)'8', (Object)"#555555"), Map.entry((Object)'9', (Object)"#5555ff"), Map.entry((Object)'a', (Object)"#55ff55"), Map.entry((Object)'b', (Object)"#55ffff"), Map.entry((Object)'c', (Object)"#ff5555"), Map.entry((Object)'d', (Object)"#ff55ff"), Map.entry((Object)'e', (Object)"#ffff55"), Map.entry((Object)'f', (Object)"#ffffff"), Map.entry((Object)'r', (Object)"#ffffff") });
    }
}
