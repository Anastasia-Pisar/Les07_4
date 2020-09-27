package by.htp.les07task4.main;

import by.htp.les07task4.entity.Time;
import by.htp.les07task4.logic.Logic;
import by.htp.les07task4.view.Print;

public class Main {
	
	public static void main (String[] args) {
		
		Time time = new Time();
		Logic logic = new Logic();
		Print print = new Print();
		
		
		print.print(time);
		logic.increase(time, 1, 1, 1);
		print.print(time);
		logic.increase(time, 10, 10, 10);
		print.print(time);
		logic.increase(time, 10, 10, 10);
		print.print(time);
		logic.increase(time, 1, 71, 21);
		print.print(time);
		logic.increase(time, 0, 0, 20);
		print.print(time);
		logic.increase(time, 5, 61, 1);
		print.print(time);
		
		System.out.println();
		
		logic.decrease(time, 1, 1, 1);
		print.print(time);
		logic.decrease(time, 0, 61, 1);
		print.print(time);
		logic.decrease(time, 1, 1, 0);
		print.print(time);
		logic.decrease(time, 5, 1, 41);
		print.print(time);
		logic.decrease(time, 10, 0, 10);
		print.print(time);	
	}
}
