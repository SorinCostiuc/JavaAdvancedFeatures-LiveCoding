package exercises.e7;

public class Weapon {
    public static void main(String[] args) {
        /*
        Create a class imitating a weapon magazine. The class should be able to define the size of the magazine
using the constructor. Implement the methods:
        - loadBullet(String bullet) → adding a cartridge to the magazine, does not allow loading more cartridges
than the capacity of the magazine
        - isLoaded() → returns information about whether the weapon is loaded (at least one cartridge) or not
        - shot() → each call shots one bullet (prints string value in console) - the last loaded cartridge - and
prepares the next one, loaded before the last one, if there are no more cartridges, it prints "empty
magazine" in the console
         */
        Magazine magazine = new Magazine(12);
        magazine.loadBullet("1");
        magazine.loadBullet("2");
        magazine.loadBullet("3");
        magazine.loadBullet("4");
        magazine.loadBullet("5");
        magazine.loadBullet("6");
        magazine.loadBullet("7");

        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();
        magazine.shot();

    }
}
