
interface JumpBehavior {
    public void jump();
}
abstract class Person {
    protected JumpBehavior jumpBehavior;
    public Person(JumpBehavior jumpBehavior){
        this.jumpBehavior = jumpBehavior;
    }
    public void performJump(){
        jumpBehavior.jump();
    }
    
}
class JumpWithLegs implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("I'm Jumping");
    }
}
class AthletePerson extends Person {
    public AthletePerson(JumpBehavior jumpBehavior){
        super(jumpBehavior);
    }
    public void performJump(){
        jumpBehavior.jump();
    }
}
    class OlympicPerson extends Person{


        public OlympicPerson(JumpBehavior jumpBehavior) {
            super(jumpBehavior);
        }
        public void performJump(){
            jumpBehavior.jump();
        }
    }

class strategy {

    public static void main(String[] args){
                 JumpBehavior jumpWithLegs = new JumpWithLegs();
                 Person athletePerson = new AthletePerson(jumpWithLegs);
                 athletePerson.performJump();

             }
}
