package toy.entity.monster;

import toy.entity.Entity;

public class Zombie extends Entity
{
    private static boolean attack;

    Zombie(){}

    public static boolean frontAttack(String view)
    {
        if (view == "발견")
        {
            System.out.println("공격한다.");
            return attack == true;
        }
        else if (view == "미발견")
        {
            System.out.println("공격하지 않는다.");
            return attack == false;
        }
        else
        {
            System.out.println("\"좀비는 아모고토 모른다.\"");
            return attack == false;
        }
    }
}