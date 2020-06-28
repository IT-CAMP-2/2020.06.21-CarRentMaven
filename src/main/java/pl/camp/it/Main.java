package pl.camp.it;

import org.apache.commons.codec.digest.DigestUtils;
import pl.camp.it.gui.GUI;

public class Main {
    public static void main(String[] args) {
        //System.out.println(DigestUtils.md5Hex("mateusz"));
        GUI.showLoginScreen();
    }
}
