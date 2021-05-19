package org.jkiss.dbeaver.swtbottest.framework;

import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;

import static org.jkiss.dbeaver.swtbottest.framework.DBeaver.bot;
import static org.jkiss.dbeaver.swtbottest.framework.Constants.NEW_DATABASE_CONNECTION;
import static org.jkiss.dbeaver.swtbottest.framework.Constants.CONNECT_TO_DATABASE;

public class MainWindow{

    public void openConnectionDialog(){
    	bot.tree().getTreeItem("DBeaver Sample Database (SQLite)").expand();
    	bot.tree().getTreeItem("DBeaver Sample Database (SQLite)").getNode("Таблицы").expand();
    	bot.tree().getTreeItem("DBeaver Sample Database (SQLite)").getNode("Таблицы").getNode("Album").select();
    	bot.tree().getTreeItem("DBeaver Sample Database (SQLite)").getNode("Таблицы").getNode("Album").doubleClick();
    	bot.editorByTitle("Album").show();
    }
}