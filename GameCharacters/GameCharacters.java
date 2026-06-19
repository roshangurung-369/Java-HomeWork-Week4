class GameCharacter {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int attack() {
        return 0;
    }
}

class Warrior extends GameCharacter {

    private int strength = 50;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public int attack() {
        return strength;
    }
}

class Archer extends GameCharacter {

    private int arrowCount;

    public Archer(String name, int arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override
    public int attack() {
        return arrowCount * 10;
    }
}

class Mage extends GameCharacter {

    private int mana;

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    public int attack() {
        return mana * 8;
    }
}

public class GameCharacters {
    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Thor"),
                new Archer("Robin", 5),
                new Mage("Merlin", 20)
        };

        for (GameCharacter gc : characters) {
            System.out.println(gc.getName() + " deals " + gc.attack() + " damage");
        }
    }
}