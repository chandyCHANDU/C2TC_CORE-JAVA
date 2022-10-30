package com.tns.program;
interface Runnable
{
public void run(int speed);
}
public class Interface1 {
	public static void main(String[] args) {
		int speed=100;
		Runnable r=(carSpeed)->
		{
			System.out.println("Running at the speed of"+carSpeed);
			
		};
		r.run(speed);
		Runnable r1=(int carSpeed)->
		{
			System.out.println("Running at the speed of"+carSpeed);
		};
		r1.run(speed);

	}

}
