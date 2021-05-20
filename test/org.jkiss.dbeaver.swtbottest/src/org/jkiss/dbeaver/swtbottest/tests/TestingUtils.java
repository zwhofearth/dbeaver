package org.jkiss.dbeaver.swtbottest.tests;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


public class TestingUtils {
	
	 public String NEW_DATABASE_CONNECTION = "New Database Connection"; 
	 public String CONNECT_TO_DATABASE = "Connect to a database";
	
	protected static SWTWorkbenchBot bot;
	
	public static void initDBeaverTests(){
		bot = new SWTWorkbenchBot();
		SWTBotShell shell = bot.activeShell();
		System.out.print("1");
		SWTBotPreferences.KEYBOARD_LAYOUT = "EN_US";
		shell.pressShortcut(Keystrokes.LF);
		bot.sleep(500);
	}

	public static void afterClass() {
		bot.resetWorkbench();
	}
}
