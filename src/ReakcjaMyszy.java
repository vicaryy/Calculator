import java.awt.*;
import java.awt.event.*;

public class ReakcjaMyszy implements MouseListener {

    Panel panel;
    Color colorSpecialNumbers = new Color(0,100,130);
    Color colorSpecialNumbersMouseEntered = new Color(0,105,125);

    Color colorSpecialNumbersPressed = new Color(0,80,110);

    ReakcjaMyszy(Panel panel) {
        this.panel = panel;

    }


    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == panel.AC) {
            panel.AC.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.plusminus) {
            panel.plusminus.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.procent) {
            panel.procent.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.usun) {
            panel.usun.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.przecinek) {
            panel.przecinek.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.zero) {
            panel.zero.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.jeden) {
            panel.jeden.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.dwa) {
            panel.dwa.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.trzy) {
            panel.trzy.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.cztery) {
            panel.cztery.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.piec) {
            panel.piec.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.szesc) {
            panel.szesc.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.siedem) {
            panel.siedem.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.osiem) {
            panel.osiem.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.dziewiec) {
            panel.dziewiec.setBackground(new Color(148, 148, 148));
        } else if (e.getSource() == panel.podzielone) {
            panel.podzielone.setBackground(colorSpecialNumbersPressed);
        } else if (e.getSource() == panel.razy) {
            panel.razy.setBackground(colorSpecialNumbersPressed);
        } else if (e.getSource() == panel.dodac) {
            panel.dodac.setBackground(colorSpecialNumbersPressed);
        } else if (e.getSource() == panel.minus) {
            panel.minus.setBackground(colorSpecialNumbersPressed);
        } else if (e.getSource() == panel.wynik) {
            panel.wynik.setBackground(colorSpecialNumbersPressed);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == panel.AC) {
            panel.AC.setBackground(new Color(64, 64, 64));
        } else if (e.getSource() == panel.plusminus) {
            panel.plusminus.setBackground(new Color(64, 64, 64));
        } else if (e.getSource() == panel.procent) {
            panel.procent.setBackground(new Color(64, 64, 64));
        } else if (e.getSource() == panel.usun) {
            panel.usun.setBackground(new Color(64, 64, 64));
        } else if (e.getSource() == panel.przecinek) {
            panel.przecinek.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.zero) {
            panel.zero.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.jeden) {
            panel.jeden.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.dwa) {
            panel.dwa.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.trzy) {
            panel.trzy.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.cztery) {
            panel.cztery.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.piec) {
            panel.piec.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.szesc) {
            panel.szesc.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.siedem) {
            panel.siedem.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.osiem) {
            panel.osiem.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.dziewiec) {
            panel.dziewiec.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.podzielone) {
            panel.podzielone.setBackground(colorSpecialNumbers);
        } else if (e.getSource() == panel.razy) {
            panel.razy.setBackground(colorSpecialNumbers);
        } else if (e.getSource() == panel.dodac) {
            panel.dodac.setBackground(colorSpecialNumbers);
        } else if (e.getSource() == panel.minus) {
            panel.minus.setBackground(colorSpecialNumbers);
        } else if (e.getSource() == panel.wynik) {
            panel.wynik.setBackground(colorSpecialNumbers);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == panel.AC) {
            panel.AC.setBackground(new Color(67, 67, 67));
        } else if (e.getSource() == panel.plusminus) {
            panel.plusminus.setBackground(new Color(67, 67, 67));
        } else if (e.getSource() == panel.procent) {
            panel.procent.setBackground(new Color(67, 67, 67));
        } else if (e.getSource() == panel.usun) {
            panel.usun.setBackground(new Color(67, 67, 67));
        } else if (e.getSource() == panel.przecinek) {
            panel.przecinek.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.zero) {
            panel.zero.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.jeden) {
            panel.jeden.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.dwa) {
            panel.dwa.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.trzy) {
            panel.trzy.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.cztery) {
            panel.cztery.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.piec) {
            panel.piec.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.szesc) {
            panel.szesc.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.siedem) {
            panel.siedem.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.osiem) {
            panel.osiem.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.dziewiec) {
            panel.dziewiec.setBackground(new Color(99, 99, 99));
        } else if (e.getSource() == panel.podzielone) {
            panel.podzielone.setBackground(colorSpecialNumbersMouseEntered);
        } else if (e.getSource() == panel.razy) {
            panel.razy.setBackground(colorSpecialNumbersMouseEntered);
        } else if (e.getSource() == panel.dodac) {
            panel.dodac.setBackground(colorSpecialNumbersMouseEntered);
        } else if (e.getSource() == panel.minus) {
            panel.minus.setBackground(colorSpecialNumbersMouseEntered);
        } else if (e.getSource() == panel.wynik) {
            panel.wynik.setBackground(colorSpecialNumbersMouseEntered);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == panel.AC) {
            panel.AC.setBackground(new Color(64, 64, 64));
        } else if (e.getSource() == panel.plusminus) {
            panel.plusminus.setBackground(new Color(64, 64, 64));
        } else if (e.getSource() == panel.procent) {
            panel.procent.setBackground(new Color(64, 64, 64));
        } else if (e.getSource() == panel.usun) {
            panel.usun.setBackground(new Color(64, 64, 64));
        } else if (e.getSource() == panel.przecinek) {
            panel.przecinek.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.zero) {
            panel.zero.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.jeden) {
            panel.jeden.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.dwa) {
            panel.dwa.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.trzy) {
            panel.trzy.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.cztery) {
            panel.cztery.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.piec) {
            panel.piec.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.szesc) {
            panel.szesc.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.siedem) {
            panel.siedem.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.osiem) {
            panel.osiem.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.dziewiec) {
            panel.dziewiec.setBackground(new Color(96, 96, 96));
        } else if (e.getSource() == panel.podzielone) {
            panel.podzielone.setBackground(colorSpecialNumbers);
        } else if (e.getSource() == panel.razy) {
            panel.razy.setBackground(colorSpecialNumbers);
        } else if (e.getSource() == panel.dodac) {
            panel.dodac.setBackground(colorSpecialNumbers);
        } else if (e.getSource() == panel.minus) {
            panel.minus.setBackground(colorSpecialNumbers);
        } else if (e.getSource() == panel.wynik) {
            panel.wynik.setBackground(colorSpecialNumbers);
        }
    }
}