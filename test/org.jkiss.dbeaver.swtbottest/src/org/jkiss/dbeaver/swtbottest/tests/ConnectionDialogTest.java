package  org.jkiss.dbeaver.swtbottest.tests;

import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.Test;

public class ConnectionDialogTest extends BaseTest {

    @Test
    public void connectionDialogHasAllDB(){
       dBeaver.mainWindow.openConnectionDialog();
    }
}