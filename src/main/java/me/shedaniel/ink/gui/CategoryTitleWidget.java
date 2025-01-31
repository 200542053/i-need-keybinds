package me.shedaniel.ink.gui;

import me.shedaniel.ink.ConfigObject;
import me.shedaniel.ink.HudState;
import me.shedaniel.ink.INeedKeybinds;

import java.awt.*;

import static me.shedaniel.ink.INeedKeybinds.*;

public class CategoryTitleWidget extends TitleWidget {
    
    public CategoryTitleWidget(Rectangle bounds, HudState hudState) {
        super(bounds, hudState);
    }
    
    @Override
    public void render(float var3, long ms) {
        if (INeedKeybinds.hudState == hudState || (INeedKeybinds.hudState == HudState.HIDDEN && lastState == hudState)) {
            Rectangle bounds = getBounds();
            ConfigObject.CategoryObject categoryObject = configObject.categories.get(category);
            drawCenteredString(font, (INeedKeybinds.category + 1) + " - " + categoryObject.name == null ? "Not Set" : categoryObject.name, bounds.x + bounds.width / 2, bounds.y + 4, 16777215);
        }
    }
    
}
