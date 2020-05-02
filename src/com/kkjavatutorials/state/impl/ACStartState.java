package com.kkjavatutorials.state.impl;

import com.kkjavatutorials.state.State;

public class ACStartState implements State {

	@Override
	public void doAction() {
		System.out.println("AC is turned ON");
	}

}
