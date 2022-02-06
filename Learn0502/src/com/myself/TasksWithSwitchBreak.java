package com.myself;

public class TasksWithSwitchBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <20; i++) {
			// Terminate loop when is 8
			if (i==8)
				break;
			System.out.println("I:" + i);
		}
		System.out.println("Loop was terminated");
	}

}
