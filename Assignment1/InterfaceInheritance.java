   interface PlayerEat {
      void eat();
    }
      interface PlayerTravel {
      void travel();
    }
      class Player implements PlayerEat, PlayerTravel {
      public void eat() {
      System.out.println("Player is eating");
    }
       public void travel() {
       System.out.println("player is travelling");
    }
    }
       public class Demo {
       public static void main(String args[]) {
       Player a = new Player();
       a.eat();
       a.travel();
    }
    }
