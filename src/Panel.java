import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class Panel extends JPanel implements ActionListener {
    DecimalFormat df = new DecimalFormat("#.#######");       // Patern do wyswietlania wyniku
    private boolean resetLiczba2;
    private boolean nowaLiczba2;
    private String liczba1 = "";
    private String liczba2 = "";
    private char operator = '=';
    private final int PANEL_WIDTH = 230;
    private final int PANEL_HEIGHT = 290;
    private final int PTEKSTOWE_WIDTH = 230;
    private final int PTEKSTOWE_HEIGHT = 58;
    private final int BUTTON_WIDTH = 55;
    private final int BUTTON_HEIGHT = 45;

    JTextField poletekstowe = new JTextField();

    JButton AC = new JButton("C");

    JButton plusminus = new JButton("±");
    JButton procent = new JButton("%");
    JButton podzielone = new JButton("÷");
    JButton siedem = new JButton("7");
    JButton osiem = new JButton("8");
    JButton dziewiec = new JButton("9");
    JButton razy = new JButton("×");
    JButton cztery = new JButton("4");
    JButton piec = new JButton("5");
    JButton szesc = new JButton("6");
    JButton minus = new JButton("−");
    JButton jeden = new JButton("1");
    JButton dwa = new JButton("2");
    JButton trzy = new JButton("3");
    JButton dodac = new JButton("+");
    JButton usun = new JButton(("⌫"));
    JButton zero = new JButton("0");
    JButton przecinek = new JButton(".");
    JButton wynik = new JButton("=");
    Font fontNumbers = new Font(".AppleSystemUIFont", 0, 22);
    Font fontSpecialNumbers = new Font(".AppleSystemUIFont", 0, 25);

    Color fontColor = new Color(225,225,225);
    Color colorSpecialNumbers = new Color(0,100,130);

    Panel() {
        //DODAWANIE REAKCJI MYSZY NA PRZYCISKI
        ReakcjaMyszy reakcjaMyszy = new ReakcjaMyszy(this);
        AC.addMouseListener(reakcjaMyszy);
        plusminus.addMouseListener(reakcjaMyszy);
        procent.addMouseListener(reakcjaMyszy);
        usun.addMouseListener(reakcjaMyszy);

        przecinek.addMouseListener(reakcjaMyszy);
        zero.addMouseListener(reakcjaMyszy);
        jeden.addMouseListener(reakcjaMyszy);
        dwa.addMouseListener(reakcjaMyszy);
        trzy.addMouseListener(reakcjaMyszy);
        cztery.addMouseListener(reakcjaMyszy);
        piec.addMouseListener(reakcjaMyszy);
        szesc.addMouseListener(reakcjaMyszy);
        siedem.addMouseListener(reakcjaMyszy);
        osiem.addMouseListener(reakcjaMyszy);
        dziewiec.addMouseListener(reakcjaMyszy);

        podzielone.addMouseListener(reakcjaMyszy);
        razy.addMouseListener(reakcjaMyszy);
        dodac.addMouseListener(reakcjaMyszy);
        minus.addMouseListener(reakcjaMyszy);
        wynik.addMouseListener(reakcjaMyszy);

        //DODAWANIE REAKCJI NA KLAWIATURE
        ReakcjaKlawiatury reakcjaKlawiatury = new ReakcjaKlawiatury(this);
        AC.addKeyListener(reakcjaKlawiatury);
        plusminus.addKeyListener(reakcjaKlawiatury);
        procent.addKeyListener(reakcjaKlawiatury);
        usun.addKeyListener(reakcjaKlawiatury);

        przecinek.addKeyListener(reakcjaKlawiatury);
        zero.addKeyListener(reakcjaKlawiatury);
        jeden.addKeyListener(reakcjaKlawiatury);
        dwa.addKeyListener(reakcjaKlawiatury);
        trzy.addKeyListener(reakcjaKlawiatury);
        cztery.addKeyListener(reakcjaKlawiatury);
        piec.addKeyListener(reakcjaKlawiatury);
        szesc.addKeyListener(reakcjaKlawiatury);
        siedem.addKeyListener(reakcjaKlawiatury);
        osiem.addKeyListener(reakcjaKlawiatury);
        dziewiec.addKeyListener(reakcjaKlawiatury);

        podzielone.addKeyListener(reakcjaKlawiatury);
        razy.addKeyListener(reakcjaKlawiatury);
        dodac.addKeyListener(reakcjaKlawiatury);
        minus.addKeyListener(reakcjaKlawiatury);
        wynik.addKeyListener(reakcjaKlawiatury);


        //POLE TEKSTOWE
        poletekstowe.setPreferredSize(new Dimension(PTEKSTOWE_WIDTH, PTEKSTOWE_HEIGHT));
        poletekstowe.setFont(new Font("Heiti SC", 0, 46));
        poletekstowe.setBackground(new Color(40, 40, 40));
        poletekstowe.setForeground(Color.WHITE);
        poletekstowe.setText("0");
        poletekstowe.setHorizontalAlignment(SwingConstants.RIGHT);
        poletekstowe.setBorder(null);
        poletekstowe.setEditable(false);

        //PRZYCISKI
        AC.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        AC.setFont(new Font(".AppleSystemUIFont", 0, 20));
        AC.setBorderPainted(false);
        AC.setBackground(new Color(64, 64, 64));
        AC.setForeground(fontColor);
        AC.setOpaque(true);
        AC.setFocusPainted(false);
        AC.addActionListener(this);
        plusminus.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        plusminus.setBackground(new Color(64, 64, 64));
        plusminus.setFont(new Font("Monospaced", 0, 21));
        plusminus.setForeground(fontColor);
        plusminus.setBorderPainted(false);
        plusminus.setOpaque(true);
        plusminus.setFocusPainted(false);
        plusminus.addActionListener(this);
        procent.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        procent.setBackground(new Color(64, 64, 64));
        procent.setFont(new Font(".AppleSystemUIFont", 0, 19));
        procent.setForeground(fontColor);
        procent.setBorderPainted(false);
        procent.setOpaque(true);
        procent.setFocusPainted(false);
        procent.addActionListener(this);
        podzielone.setPreferredSize(new Dimension(BUTTON_WIDTH + 5, BUTTON_HEIGHT));
        podzielone.setBackground(colorSpecialNumbers);
        podzielone.setFont(fontSpecialNumbers);
        podzielone.setForeground(fontColor);
        podzielone.setBorderPainted(false);
        podzielone.setOpaque(true);
        podzielone.setFocusPainted(false);
        podzielone.addActionListener(this);

        siedem.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        siedem.setBorderPainted(false);
        siedem.setFont(fontNumbers);
        siedem.setBackground(new Color(96, 96, 96));
        siedem.setForeground(fontColor);
        siedem.setOpaque(true);
        siedem.setFocusPainted(false);
        siedem.addActionListener(this);
        osiem.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        osiem.setBackground(new Color(96, 96, 96));
        osiem.setFont(fontNumbers);
        osiem.setForeground(fontColor);
        osiem.setBorderPainted(false);
        osiem.setOpaque(true);
        osiem.setFocusPainted(false);
        osiem.addActionListener(this);
        dziewiec.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        dziewiec.setBackground(new Color(96, 96, 96));
        dziewiec.setFont(fontNumbers);
        dziewiec.setForeground(fontColor);
        dziewiec.setBorderPainted(false);
        dziewiec.setOpaque(true);
        dziewiec.setFocusPainted(false);
        dziewiec.addActionListener(this);
        razy.setPreferredSize(new Dimension(BUTTON_WIDTH + 5, BUTTON_HEIGHT));
        razy.setBackground(colorSpecialNumbers);
        razy.setFont(fontSpecialNumbers);
        razy.setForeground(fontColor);
        razy.setBorderPainted(false);
        razy.setOpaque(true);
        razy.setFocusPainted(false);
        razy.addActionListener(this);

        cztery.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        cztery.setBorderPainted(false);
        cztery.setBackground(new Color(96, 96, 96));
        cztery.setFont(fontNumbers);
        cztery.setForeground(fontColor);
        cztery.setOpaque(true);
        cztery.setFocusPainted(false);
        cztery.addActionListener(this);
        piec.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        piec.setBackground(new Color(96, 96, 96));
        piec.setFont(fontNumbers);
        piec.setForeground(fontColor);
        piec.setBorderPainted(false);
        piec.setOpaque(true);
        piec.setFocusPainted(false);
        piec.addActionListener(this);
        szesc.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        szesc.setBackground(new Color(96, 96, 96));
        szesc.setFont(fontNumbers);
        szesc.setForeground(fontColor);
        szesc.setBorderPainted(false);
        szesc.setOpaque(true);
        szesc.setFocusPainted(false);
        szesc.addActionListener(this);
        minus.setPreferredSize(new Dimension(BUTTON_WIDTH + 5, BUTTON_HEIGHT));
        minus.setBackground(colorSpecialNumbers);
        minus.setForeground(fontColor);
        minus.setFont(fontSpecialNumbers);
        minus.setBorderPainted(false);
        minus.setOpaque(true);
        minus.setFocusPainted(false);
        minus.addActionListener(this);

        jeden.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        jeden.setBorderPainted(false);
        jeden.setFont(fontNumbers);
        jeden.setBackground(new Color(96, 96, 96));
        jeden.setForeground(fontColor);
        jeden.setOpaque(true);
        jeden.setFocusPainted(false);
        jeden.addActionListener(this);
        dwa.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        dwa.setBackground(new Color(96, 96, 96));
        dwa.setFont(fontNumbers);
        dwa.setForeground(fontColor);
        dwa.setBorderPainted(false);
        dwa.setOpaque(true);
        dwa.setFocusPainted(false);
        dwa.addActionListener(this);
        trzy.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        trzy.setBackground(new Color(96, 96, 96));
        trzy.setFont(fontNumbers);
        trzy.setForeground(fontColor);
        trzy.setBorderPainted(false);
        trzy.setOpaque(true);
        trzy.setFocusPainted(false);
        trzy.addActionListener(this);
        dodac.setPreferredSize(new Dimension(BUTTON_WIDTH + 5, BUTTON_HEIGHT));
        dodac.setBackground(colorSpecialNumbers);
        dodac.setFont(fontSpecialNumbers);
        dodac.setForeground(fontColor);
        dodac.setBorderPainted(false);
        dodac.setOpaque(true);
        dodac.setFocusPainted(false);
        dodac.addActionListener(this);

        usun.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        usun.setBackground(new Color(64, 64, 64));
        usun.setFont(new Font(".AppleSystemUIFont", 0, 19));
        usun.setForeground(fontColor);
        usun.setBorderPainted(false);
        usun.setOpaque(true);
        usun.setFocusPainted(false);
        usun.addActionListener(this);
        zero.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        zero.setBackground(new Color(96, 96, 96));
        zero.setFont(fontNumbers);
        zero.setForeground(fontColor);
        zero.setBorderPainted(false);
        zero.setOpaque(true);
        zero.setFocusPainted(false);
        zero.addActionListener(this);
        przecinek.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
        przecinek.setBackground(new Color(96, 96, 96));
        przecinek.setFont(fontNumbers);
        przecinek.setForeground(fontColor);
        przecinek.setBorderPainted(false);
        przecinek.setOpaque(true);
        przecinek.setFocusPainted(false);
        przecinek.addActionListener(this);
        wynik.setPreferredSize(new Dimension(BUTTON_WIDTH + 5, BUTTON_HEIGHT));
        wynik.setBackground(colorSpecialNumbers);
        wynik.setFont(fontSpecialNumbers);
        wynik.setForeground(fontColor);
        wynik.setBorderPainted(false);
        wynik.setOpaque(true);
        wynik.setFocusPainted(false);
        wynik.addActionListener(this);


        //PANEL
        this.setLayout(new FlowLayout(0, 1, 1));
        this.add(poletekstowe);
        this.add(AC);
        this.add(plusminus);
        this.add(procent);
        this.add(podzielone);
        this.add(siedem);
        this.add(osiem);
        this.add(dziewiec);
        this.add(razy);
        this.add(cztery);
        this.add(piec);
        this.add(szesc);
        this.add(minus);
        this.add(jeden);
        this.add(dwa);
        this.add(trzy);
        this.add(dodac);
        this.add(usun);
        this.add(zero);
        this.add(przecinek);
        this.add(wynik);
        this.setBackground(new Color(40, 40, 40));
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.addKeyListener(reakcjaKlawiatury);
        this.setFocusable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == AC) {
            resetDanych();
        } else if (e.getSource() == plusminus) {
            reakcjaNaPlusMinus();
        } else if (e.getSource() == usun) {
            usunLiczbe();
        } else if (e.getSource() == zero) {
            reakcjeNaPrzycisk(zero);
        } else if (e.getSource() == jeden) {
            reakcjeNaPrzycisk(jeden);
        } else if (e.getSource() == dwa) {
            reakcjeNaPrzycisk(dwa);
        } else if (e.getSource() == trzy) {
            reakcjeNaPrzycisk(trzy);
        } else if (e.getSource() == cztery) {
            reakcjeNaPrzycisk(cztery);
        } else if (e.getSource() == piec) {
            reakcjeNaPrzycisk(piec);
        } else if (e.getSource() == szesc) {
            reakcjeNaPrzycisk(szesc);
        } else if (e.getSource() == siedem) {
            reakcjeNaPrzycisk(siedem);
        } else if (e.getSource() == osiem) {
            reakcjeNaPrzycisk(osiem);
        } else if (e.getSource() == dziewiec) {
            reakcjeNaPrzycisk(dziewiec);
        } else if (e.getSource() == przecinek) {
            reakcjeNaPrzycisk(przecinek);
        } else if (e.getSource() == dodac) {
            mrugniecie();
            if (nowaLiczba2) {
                obliczanieWyniku();
            }
            operator = '+';
        } else if (e.getSource() == minus) {
            mrugniecie();
            if (nowaLiczba2) {
                obliczanieWyniku();
            }
            operator = '-';
        } else if (e.getSource() == razy) {
            mrugniecie();
            if (nowaLiczba2) {
                obliczanieWyniku();
            }
            operator = 'x';
        } else if (e.getSource() == podzielone) {
            mrugniecie();
            if (nowaLiczba2) {
                obliczanieWyniku();
            }
            operator = '/';
        } else if (e.getSource() == wynik) {
            mrugniecie();
            obliczanieWyniku();
        } else if (e.getSource() == procent) {
            reakcjaNaProcent();
        }
    }



    // Obliczenia
    public void obliczanieWyniku() {
        boolean poprawnosc = poprawnoscLiczb();
        if (poprawnosc) {
            switch (operator) {
                case '+' -> {
                    liczba1 = String.valueOf(((Double.parseDouble(liczba1)) + (Double.parseDouble(liczba2)))).toString();
                    wyswietlanieWyniku();
                }
                case '-' -> {
                    liczba1 = String.valueOf(((Double.parseDouble(liczba1)) - (Double.parseDouble(liczba2)))).toString();
                    wyswietlanieWyniku();
                }
                case 'x' -> {
                    liczba1 = String.valueOf(((Double.parseDouble(liczba1)) * (Double.parseDouble(liczba2)))).toString();
                    wyswietlanieWyniku();
                }
                case '/' -> {
                    if (liczba2.equals("0")) {
                        resetDanych();
                    } else {
                        liczba1 = String.valueOf(((Double.parseDouble(liczba1)) / (Double.parseDouble(liczba2)))).toString();
                        wyswietlanieWyniku();
                    }
                }
            }
        }
        wielkoscCzcionki();
    }

    public void reakcjaNaPlusMinus() {
        if (operator == '=') {
            if (liczba1.startsWith("-")) {
                liczba1 = liczba1.substring(1);
            } else {
                liczba1 = "-" + liczba1;
            }
            if (liczba1.equals("")) {
                poletekstowe.setText("0");
            } else {
                poletekstowe.setText(liczba1);
            }
        } else {
            if (resetLiczba2) {
                liczba2 = "";
                resetLiczba2 = false;
            }
            if (liczba2.startsWith("-")) {
                liczba2 = liczba2.substring(1);
            } else {
                liczba2 = "-" + liczba2;
            }
            poletekstowe.setText(liczba2);
            nowaLiczba2 = true;
        }
        wielkoscCzcionki();
        mrugniecie();
    }

    public void reakcjaNaProcent() {
        mrugniecie();
        if (poletekstowe.getText().equals("0")) {
            resetDanych();
        } else {
            if (operator == '=') {
                liczba1 = String.valueOf(Double.parseDouble(liczba1) / (double) 100).toString();
                wyswietlanieWyniku();
            } else {
                liczba2 = String.valueOf(((Double.parseDouble(liczba1)) * ((Double.parseDouble(liczba2) / (double) 100)))).toString();
                poletekstowe.setText(df.format(Double.parseDouble(liczba2)));
            }
        }
        if (poletekstowe.getText().equals("0")) {
            resetDanych();
        }
    }

    public void usunLiczbe() {
        if (operator == '=') {
            if (liczba1.equals("")) {
                poletekstowe.setText("0");
            } else {
                liczba1 = liczba1.substring(0, liczba1.length() - 1);
                poletekstowe.setText(liczba1);
            }
        } else {
            if (resetLiczba2) {
                liczba2 = "";
                resetLiczba2 = false;
            }
            if (liczba2.equals("")) {
                poletekstowe.setText("0");
            } else {
                liczba2 = liczba2.substring(0, liczba2.length() - 1);
                poletekstowe.setText(liczba2);
            }
            nowaLiczba2 = true;
        }
        wielkoscCzcionki();
    }

    public void reakcjeNaPrzycisk(JButton button) {
        if (operator == '=') {
            if (button == przecinek && liczba1.contains(".")) {
            } else {
                liczba1 += button.getText();
                poletekstowe.setText(liczba1);
            }
        } else {
            if (resetLiczba2) {
                liczba2 = "";
                resetLiczba2 = false;
            }
            if (button == przecinek && liczba2.contains(".")) {
            } else {
                liczba2 += button.getText();
                poletekstowe.setText(liczba2);
                nowaLiczba2 = true;
            }
        }
        wielkoscCzcionki();
    }

    public void resetDanych() {
        poletekstowe.setText("0");
        if (liczba2.equals("0")) {
            poletekstowe.setText("Nie-liczba");
        }
        liczba1 = "";
        liczba2 = "";
        operator = '=';
        nowaLiczba2 = false;
        resetLiczba2 = false;
        mrugniecie();
        wielkoscCzcionki();
    }

    public void wielkoscCzcionki() {
        int[] wielkosc = {46, 42, 38, 34, 31, 28, 26, 24, 23, 22, 20, 19, 18, 18, 17, 16, 16, 15, 14, 14, 13, 12, 11, 11, 10, 10, 10, 10, 9, 9, 9, 9, 9, 9, 9};
        int dlugosc = poletekstowe.getText().length();
        for (int i = 0; i < wielkosc.length; i++) {
            if (dlugosc > wielkosc.length) {
                poletekstowe.setFont(new Font("Heiti SC", 0, 9));
                break;
            }
            if (dlugosc <= i + 8) {
                poletekstowe.setFont(new Font("Heiti SC", 0, wielkosc[i]));
                break;
            }
        }
    }

    public void mrugniecie() {
        Timer timer = new Timer(70, e -> {
            poletekstowe.setVisible(true);          // tą operacja wykona wtedy kiedy timer.start() zostanie wywołany
        });
        poletekstowe.setVisible(false); // ukryj pole tekstowe
        timer.setRepeats(false); // wykonaj kod tylko raz
        timer.start(); // rozpocznij odliczanie
    }

    public void wyswietlanieWyniku() {
        poletekstowe.setText(df.format(Double.parseDouble(liczba1)));
        resetLiczba2 = true;
        nowaLiczba2 = false;
    }

    public boolean poprawnoscLiczb() {
        if (liczba1.equals("")) {
            liczba1 = "0";
        }
        if (liczba2.equals("")) {
            return false;
        }
        return true;
    }
}
