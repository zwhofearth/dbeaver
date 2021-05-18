package  org.jkiss.dbeaver.swtbottest.tests;

import org.junit.Test;

public class ConnectionDialogTest extends BaseTest {

    @Test
    public void connectionDialogHasAllDB(){
    		dBeaver.mainWindow.openConnectionDialog();
    }
}