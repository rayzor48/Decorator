public class DecoratorFighter implements Skill{
    private Skill skill;
    private String name;
    private float damage;


    public DecoratorFighter(String name, Skill skill, float damage) {
        this.name = name;
        this.skill = skill;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    @Override
    public void giveDamage() {
        System.out.println(name + " : i give " + (skill.getDamage() + damage) + " damage");
    }

    @Override
    public float getDamage() {
        return damage + skill.getDamage();
    }
}
