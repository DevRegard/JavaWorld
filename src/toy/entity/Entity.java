package toy.entity;

public class Entity
{
    private int id;
    private int health;
    private String name;
//    private Skill skill;

    public Entity() {}

//    public Entity(int id, int health, String name, Skill skill)
//    {
//        this.id = id;
//        this.health = health;
//        this.name = name;
//        this.skill = skill;
//    }

    // Method: 임시 생성자
    public Entity(int id, int health, String name, Skill skill)
    {
        this.id = id;
        this.health = health;
        this.name = name;
    }
}
