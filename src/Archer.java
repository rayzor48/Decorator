public class Archer extends DecoratorFighter{

    public Archer(Skill fighter) {
        super("Archer", fighter, 22);
    }
    //расширяем возможности класса
    public void takeBow(){
        System.out.println(super.getName() + ": i take bow");
    }
}
