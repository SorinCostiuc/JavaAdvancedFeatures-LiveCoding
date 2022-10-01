package exercises.e7;

import java.util.Stack;

public class Magazine {
    private final int magazineSize;
    private final Stack<String> magazine;


    public Magazine(int magazineSize) {
        this.magazineSize = magazineSize;
        magazine = new Stack<>();
    }

    public void loadBullet(String bullet) {
        if (magazine.size() < magazineSize) {
            magazine.push(bullet);
        }
    }

    public boolean isLoaded() {
        return magazine.size() > 0;
    }

    public void shot() {
        if (isLoaded()) {
            System.out.println(magazine.pop());
        } else {
            System.out.println("Empty magazine");
        }
    }
}
