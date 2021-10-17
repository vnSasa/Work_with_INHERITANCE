package ua.yaremechko.inheritance.robot;

public class Application {

	public static void main(String[] args) {

		Robot r = new Robot("Robot");

		Robot rd = new RobotDancer("RobotDancer");
		rd.work("just dancing");

		Robot cr = new CoffeRobot("CoffeRobot");
		cr.work("make coffee");

		Robot rc = new RobotCoocker("RobotCoocker");
		rc.work("just cooking");

		Robot[] robot = { r, rd, cr, rc };
		for (int i = 0; i < robot.length; i++) {
			System.out.println(robot[i]);
		}
	}

}
