package SimpleFactory;

public class mainSimpleFactory
{
    public static void main(String[] args)
    {
        // SIMPLE FACTORY IS NOT REALLY A DESIGN PATTERN
        RobotFactory factory = new RobotFactory();
        Robot robot1 = factory.createRobot("A");

        robot1.introduceYourself();
    }
}
