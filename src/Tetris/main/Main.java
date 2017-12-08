package Tetris.main;

import java.awt.AWTException;

import Tetris.view.InputSpeedLevelView;

public class Main {
	
	public static void main(String[] args) throws AWTException {
		new InputSpeedLevelView().setVisible(true);
	}
}
