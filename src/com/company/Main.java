import java.util.Scanner;

class Skaiciuotuvas {
    public int sk1;
    public int sk2;
    public double rez;
    public char o;

    double atimti() {
        return sk1 - sk2;
    }

    double sudeti(int sk1, int sk2) {
        return sk1 + sk2;
    }

    void dalinti() {
        rez = sk1 / sk2;
    }

    void dauginti(int sk1, int sk2) {
        rez = sk1 * sk2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Skaiciuotuvas skc = new Skaiciuotuvas();

        while (true) {
            System.out.println("Programa skaičiuojanti operacijas: '- + / * &'");
            System.out.println("Įveskite pirmą skaičių : ");
            skc.sk1 = sc.nextInt();
            System.out.println("Įveskite antrą skaičių : ");
            skc.sk2 = sc.nextInt();
            System.out.println("Įveskite funkciją : '* / + - &'");
            skc.o = sc.next().charAt(0);

            if (skc.o == '-') {
                skc.rez = skc.atimti();
                System.out.println(skc.sk1 + " " + skc.o + " " + skc.sk2 + " = " + skc.rez);


            } else if (skc.o == '+') {
                skc.rez = skc.sudeti(skc.sk1, skc.sk2);
                System.out.println(skc.sk1 + " " + skc.o + " " + skc.sk2 + " = " + skc.rez);


            } else if (skc.o == '/') {
                if (skc.sk2 == 0) {
                    System.out.println("Dalyba iš nulio negalima.");
                    return;
                }
                skc.dalinti();
                System.out.println(skc.sk1 + " " + skc.o + " " + skc.sk2 + " = " + skc.rez);

            } else if (skc.o == '*') {
                skc.dauginti(skc.sk1, skc.sk2);
                System.out.println(skc.sk1 + " " + skc.o + " " + skc.sk2 + " = " + skc.rez);

            } else if (skc.o == '&') {
                double ats = 1;
                for (double i = 100; i <= 199; i++) {
                    ats = ((skc.sk2 + skc.sk1) * skc.sk2 + (skc.sk2 - skc.sk1) / skc.sk1 * i);
                    if (ats < 100) {
                        System.out.println(" (" + skc.sk2 + " + " + skc.sk1 + ")" + " * " + skc.sk2 + " + " + "(" + skc.sk2 + " - " + skc.sk1 + ")" + " / " + skc.sk1 + " * " + i + " = " + ats + " < " + 100);
                    } else if (ats == 100) {
                        System.out.println(" (" + skc.sk2 + " + " + skc.sk1 + ")" + " * " + skc.sk2 + " + " + "(" + skc.sk2 + " - " + skc.sk1 + ")" + " / " + skc.sk1 + " * " + i + " = " + ats + " = " + 100);
                    } else if (ats > 100) {
                        System.out.println(" (" + skc.sk2 + " + " + skc.sk1 + ")" + " * " + skc.sk2 + " + " + "(" + skc.sk2 + " - " + skc.sk1 + ")" + " / " + skc.sk1 + " * " + i + " = " + ats + " > " + 100);
                    }
                }
            } else {
                System.out.println("Operacija negalima.");
            }
            System.out.println("Ar dar norite toliau skaičiuoti? Jei įvesite taip, bus tęsiamas skaičiavimas : ");
            String kartoti = sc.next();

            if (!kartoti.equals("taip")) {
                System.out.println("Programa baigė darbą");
                break;

            }
        }
    }
}
