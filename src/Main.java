public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(1000);
        boss.setDefenceType("physical");
        System.out.println(" boss health: " + boss.getHealth() + " boss damage: " + boss.getDamage() + " boss defensType: " + boss.getDefenceType());
        createHeroes();

    }
    public static Hero[] createHeroes() {
        Hero hero = new Hero(500, 50, "magical");
        Hero hero1 = new Hero(500, 60);
        Hero superhero = new Hero(800, 100, "physical");

        Hero[] heroes = {hero, hero1, superhero};

        for (Hero hero7 : heroes) {
            System.out.println(heroes);
        }
        return heroes;
    }

}