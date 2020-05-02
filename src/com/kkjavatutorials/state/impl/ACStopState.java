package com.kkjavatutorials.state.impl;

import com.kkjavatutorials.state.State;

public class ACStopState implements State {

	@Override
	public void doAction() {
		System.out.println("AC is turned OFF");
	}

}
