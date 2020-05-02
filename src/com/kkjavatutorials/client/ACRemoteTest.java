package com.kkjavatutorials.client;

import com.kkjavatutorials.state.ACContext;
import com.kkjavatutorials.state.State;
import com.kkjavatutorials.state.impl.ACStartState;
import com.kkjavatutorials.state.impl.ACStopState;

public class ACRemoteTest {

	public static void main(String[] args) {
		
		ACContext acContext = new ACContext();
		State AcStartState = new ACStartState();
		
		acContext.setState(AcStartState);
		
		acContext.doAction();
		
		System.out.println("-------------------------------");
		
		State AcStopState = new ACStopState();
		acContext.setState(AcStopState);
		acContext.doAction();
	}
}
