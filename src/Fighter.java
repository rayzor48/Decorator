public class Fighter implements Skill{

    private String name;
    private float damage;

    public Fighter(String name, float damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public void giveDamage() {
        System.out.println(name + " : i give " + damage + " damage");
    }

    @Override
    public float getDamage() {
        return damage;
    }
}
