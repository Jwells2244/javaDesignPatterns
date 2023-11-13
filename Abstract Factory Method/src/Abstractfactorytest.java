public class Abstractfactorytest {
    public static void main(String args[]){
        Broomstick broomstick = new Broomstick("Hogwarts");
        MagicWand wand = new MagicWand("hogwarts");
        Owl Hegwig = new Owl("Hogwarts");
        System.out.println("Broomstick id number:" + broomstick.idNum);
        System.out.println("Broomstick school id:" + broomstick.schoolID);
        System.out.println("Wand id number:" + wand.idNum);
        System.out.println("Wand school id:" + wand.schoolID);
        System.out.println("Owl id number:" + Hegwig.idNum);
        System.out.println("Owl school id:" + Hegwig.schoolID);
    }
}
