package org.jkiss.dbeaver.swtbottest.tests;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.jkiss.dbeaver.swtbottest.tests.TestingUtils.bot;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SapleSQLiteTest {

	@BeforeClass
	public static void beforeClass() {
		TestingUtils.initDBeaverTests();
	}

	@AfterClass
	public static void afterClass() {
		TestingUtils.afterClass();
	}

	@Test
	public void expandPojectTreeAndShowDataTest() {
		bot.tree().getTreeItem("DBeaver Sample Database (SQLite)").expand();
		bot.button("Download").click();
		bot.sleep(1000); // waitUntil()!!!
		bot.tree().getTreeItem("DBeaver Sample Database (SQLite)").getNode("Tables").expand();
		bot.tree().getTreeItem("DBeaver Sample Database (SQLite)").getNode("Tables").getNode("Invoice").select();
		bot.tree().getTreeItem("DBeaver Sample Database (SQLite)").getNode("Tables").getNode("Invoice").expand();
		bot.tree().getTreeItem("DBeaver Sample Database (SQLite)").getNode("Tables").getNode("Invoice").doubleClick();
		bot.editorByTitle("Invoice").show();
		bot.cTabItem("Data").activate();
	}

	@Test
	public void addNewRowTest() {
		bot.toolbarButtonWithTooltip("Add new row (Alt+Insert)").click();
		Keyboard keyboard = KeyboardFactory.getSWTKeyboard();
		keyboard.pressShortcut(Keystrokes.LF);
		keyboard.typeText("1");
		keyboard.pressShortcut(Keystrokes.TAB);
		keyboard.typeText("2");
		keyboard.pressShortcut(Keystrokes.TAB);
		keyboard.typeText("2007-01-04 00:00:00");
		keyboard.pressShortcut(Keystrokes.TAB);
		keyboard.typeText("");
		keyboard.pressShortcut(Keystrokes.TAB);
		keyboard.typeText("The city");
		keyboard.pressShortcut(Keystrokes.TAB);
		keyboard.typeText("state");
		keyboard.pressShortcut(Keystrokes.TAB);
		keyboard.typeText("country");
		keyboard.pressShortcut(Keystrokes.TAB);
		keyboard.typeText("111111");
		keyboard.pressShortcut(Keystrokes.TAB);
		keyboard.typeText("13");
		keyboard.pressShortcut(Keystrokes.TAB);
		keyboard.typeText("2");
		bot.toolbarButton("Save").click();
		// check number of rows
	}
}
