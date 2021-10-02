package clases;

import javax.swing.Timer;

class Logica {

    private Timer t;
    private int h, m, s, cs;

    public void avanzar() {
        ++cs;
        if (cs == 100) {
            cs = 0;
            ++s;
        }
        if (s == 60) {
            s = 0;
            ++m;
        }
        if (m == 60) {
            m = 0;
            ++h;
        }
    }

    public String escrito() {
        String tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s + ":" + (cs <= 9 ? "0" : "") + cs;
    return tiempo;
    }

    public Logica() {
    }
    
}
