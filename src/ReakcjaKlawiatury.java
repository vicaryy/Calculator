import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ReakcjaKlawiatury implements KeyListener {
    Panel panel;
    Color colorSpecialNumbers = new Color(0,100,130);
    Color colorSpecialNumbersPressed = new Color(0,80,110);

    ReakcjaKlawiatury(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
            panel.AC.setBackground(new Color(96, 96, 96));
            panel.AC.doClick();
        } else if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
            panel.usun.setBackground(new Color(96, 96, 96));
            panel.usun.doClick();
        } else if (e.getKeyChar() == '.') {
            panel.przecinek.setBackground(new Color(148, 148, 148));
            panel.przecinek.doClick();
        } else if (e.getKeyChar() == '0') {
            panel.zero.setBackground(new Color(148, 148, 148));
            panel.zero.doClick();
        } else if (e.getKeyChar() == '1') {
            panel.jeden.setBackground(new Color(148, 148, 148));
            panel.jeden.doClick();
        } else if (e.getKeyChar() == '2') {
            panel.dwa.setBackground(new Color(148, 148, 148));
            panel.dwa.doClick();
        } else if (e.getKeyChar() == '3') {
            panel.trzy.setBackground(new Color(148, 148, 148));
            panel.trzy.doClick();
        } else if (e.getKeyChar() == '4') {
            panel.cztery.setBackground(new Color(148, 148, 148));
            panel.cztery.doClick();
        } else if (e.getKeyChar() == '5') {
            panel.piec.setBackground(new Color(148, 148, 148));
            panel.piec.doClick();
        } else if (e.getKeyChar() == '6') {
            panel.szesc.setBackground(new Color(148, 148, 148));
            panel.szesc.doClick();
        } else if (e.getKeyChar() == '7') {
            panel.siedem.setBackground(new Color(148, 148, 148));
            panel.siedem.doClick();
        } else if (e.getKeyChar() == '8') {
            panel.osiem.setBackground(new Color(148, 148, 148));
            panel.osiem.doClick();
        } else if (e.getKeyChar() == '9') {
            panel.dziewiec.setBackground(new Color(148, 148, 148));
            panel.dziewiec.doClick();
        } else if (e.getKeyChar() == '/') {
            panel.podzielone.setBackground(colorSpecialNumbersPressed);
            panel.podzielone.doClick();
        } else if (e.getKeyChar() == '-') {
            panel.minus.setBackground(colorSpecialNumbersPressed);
            panel.minus.doClick();
        } else if (e.getKeyChar() == '=') {
            panel.wynik.setBackground(colorSpecialNumbersPressed);
            panel.wynik.doClick();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 45 && e.isShiftDown()) {
            panel.plusminus.setBackground(new Color(96, 96, 96));
            panel.plusminus.doClick();
        } else if (e.getKeyCode() == 61 && e.isShiftDown()) {
            panel.dodac.setBackground(colorSpecialNumbersPressed);
            panel.dodac.doClick();
        } else if (e.getKeyCode() == 56 && e.isShiftDown()) {
            panel.razy.setBackground(colorSpecialNumbersPressed);
            panel.razy.doClick();
        } else if (e.getKeyCode() == 53 && e.isShiftDown()) {
            panel.procent.setBackground(colorSpecialNumbersPressed);
            panel.procent.doClick();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyChar() == '0') {
            panel.zero.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyChar() == '1') {
            panel.jeden.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyChar() == '2') {
            panel.dwa.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyChar() == '3') {
            panel.trzy.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyChar() == '4') {
            panel.cztery.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyChar() == '5') {
            panel.piec.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyChar() == '6') {
            panel.szesc.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyChar() == '7') {
            panel.siedem.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyChar() == '8') {
            panel.osiem.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyChar() == '9') {
            panel.dziewiec.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyChar() == '/') {
            panel.podzielone.setBackground(colorSpecialNumbers);
        } else if (e.getKeyChar() == '-') {
            panel.minus.setBackground(colorSpecialNumbers);
        } else if (e.getKeyChar() == '=') {
            panel.wynik.setBackground(colorSpecialNumbers);
        } else if (e.getKeyChar() == '.') {
            panel.przecinek.setBackground(new Color(96, 96, 96));
        } else if (e.getKeyCode() == 45 && e.isShiftDown()) {
            panel.plusminus.setBackground(new Color(64, 64, 64));
        } else if (e.getKeyCode() == 61 && e.isShiftDown()) {
            panel.dodac.setBackground(colorSpecialNumbers);
        } else if (e.getKeyCode() == 56 && e.isShiftDown()) {
            panel.razy.setBackground(colorSpecialNumbers);
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            panel.AC.setBackground(new Color(64, 64, 64));
        } else if (e.getKeyCode() == 53 && e.isShiftDown()) {
            panel.procent.setBackground(new Color(64, 64, 64));
        } else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            panel.usun.setBackground(new Color(64, 64, 64));
        }
    }
}