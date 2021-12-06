public class Main {
    public static void main(String[] args) {

        Skill fighter = new Fighter("Fighter", 12);
        Skill archer = new Archer(fighter);
        Skill warrior = new Warrior(archer);

        fighter.giveDamage();
        archer.giveDamage();
        warrior.giveDamage();

    }
}
