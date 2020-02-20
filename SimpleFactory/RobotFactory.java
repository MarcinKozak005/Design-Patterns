package SimpleFactory;

// SIMPLE FACTORY IS NOT REALLY A DESIGN PATTERN
public class RobotFactory
{
    Robot createRobot(String type)
    {
        if(type.equals("A"))
        {
            return new RobotA();
        }
        else
        {
            return new RobotB();
        }

    }
}
