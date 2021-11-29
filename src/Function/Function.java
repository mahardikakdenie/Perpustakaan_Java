/**
 * Function
 */
package Function;

import Main.Type;

public class Function {
    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.err.println("tidak bisa clear screen");
        }
    }

    public void setType(String name, String type, String publisher) {
        Type functionType = new Type(name, publisher, type);
        functionType.info();
    }
}