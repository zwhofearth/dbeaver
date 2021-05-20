package org.jkiss.dbeaver.swtbottest.framework;

import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;

import static org.jkiss.dbeaver.swtbottest.framework.DBeaver.bot;
import static org.jkiss.dbeaver.swtbottest.framework.Constants.NEW_DATABASE_CONNECTION;
import static org.jkiss.dbeaver.swtbottest.framework.Constants.CONNECT_TO_DATABASE;

public class MainWindow{

    public void openConnectionDialog(){
    	SWTBotShell shell = bot.activeShell();
    	SWTBotPreferences.KEYBOARD_LAYOUT = "EN_US";
    	shell.pressShortcut(Keystrokes.LF);
    	bot.sleep(5000);
    }
}