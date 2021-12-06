public class Warrior extends DecoratorFighter {

    public Warrior(Skill fighter) {
        super("Warrior", fighter, 6);
    }
    //расширяем возможности класса
    public void takeShield(){
        System.out.println(super.getName() + ": i take bow");
    }

}
