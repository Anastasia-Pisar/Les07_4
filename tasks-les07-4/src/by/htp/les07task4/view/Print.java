package by.htp.les07task4.view;

import by.htp.les07task4.entity.Time;

public class Print {

	public void print(Time time) {

		System.out.println("Время: ");
		if (time.getHour() < 24) {
			System.out.print(time.getHour() + "h : ");
		}
		if (time.getMinute() < 60) {
			System.out.print(time.getMinute() + "m : ");
		}
		if (time.getSecond() < 60) {
			System.out.println(time.getSecond() + "s");
		}
	}
}
