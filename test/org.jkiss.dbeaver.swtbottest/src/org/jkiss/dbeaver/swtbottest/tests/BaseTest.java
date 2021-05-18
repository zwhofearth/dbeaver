package  org.jkiss.dbeaver.swtbottest.tests;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.jkiss.dbeaver.swtbottest.framework.DBeaver;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public abstract class BaseTest {

    public static DBeaver dBeaver;

    @BeforeClass
    public static void  init(){
        dBeaver = new DBeaver();
    }

}