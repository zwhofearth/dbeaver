package org.jkiss.dbeaver.swtbottest.framework;

import org.eclipse.swtbot.swt.finder.waits.Conditions;
import static org.jkiss.dbeaver.swtbottest.framework.DBeaver.bot;
import static org.jkiss.dbeaver.swtbottest.framework.Constants.NEW_DATABASE_CONNECTION;
import static org.jkiss.dbeaver.swtbottest.framework.Constants.CONNECT_TO_DATABASE;

public class MainWindow{

    public void openConnectionDialog(){
        bot.toolbarButton(NEW_DATABASE_CONNECTION).click();
//        bot.waitUntil(Conditions.shellIsActive(CONNECT_TO_DATABASE));
    }
}