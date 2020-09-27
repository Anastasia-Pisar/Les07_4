package by.htp.les07task4.logic;

import by.htp.les07task4.entity.Time;

public class Logic {

	public boolean increase(Time time, int newHour, int newMinute, int newSecond) {
		
		if (newHour >= 0 && newMinute >= 0 && newSecond >= 0) {
			
			int a = 0;
			int second = 0;
			int minute = 0;
			int hour = 0;

			second = time.getSecond() + newSecond;
			if (second > 59) {
				second = second - 60;
				a++;
			}
			time.setSecond(second);

			minute = time.getMinute() + newMinute + a;
			a = 0;
			if (minute > 59) {
				minute = minute - 60;
				a++;
			}
			time.setMinute(minute);

			hour = time.getHour() + newHour + a;
			if (hour > 23) {
				hour = hour - 24;
			}
			time.setHour(hour);
			
			return true;
		}
		return false;
	}

	public boolean decrease(Time time, int pastHour, int pastMinute, int pastSecond) {
		
		if (pastHour >= 0 && pastMinute >= 0 && pastSecond >= 0) {
			
			int a = 0;
			int second = 0;
			int minute = 0;
			int hour = 0;

			second = time.getSecond() - pastSecond;
			if (second < 0) {
				second = second + 60;
				a++;
			}
			time.setSecond(second);

			minute = time.getMinute() - pastMinute - a;
			a = 0;
			if (minute < 0) {
				minute = minute + 60;
				a++;
			}
			time.setMinute(minute);

			hour = time.getHour() - pastHour - a;
			if (hour < 0) {
				hour = hour + 24;
			}
			time.setHour(hour);
			
			return true;
		}
		return false;
	}
}
