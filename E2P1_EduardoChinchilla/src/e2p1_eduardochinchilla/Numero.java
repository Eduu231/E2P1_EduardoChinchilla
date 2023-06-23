package e2p1_eduardochinchilla;

public class Numero {

    private int base;
    private String numero;

    public Numero(int base, int numero) {
        this.base = base;
        this.numero = decToBase(numero);
    }

    public char numToChar(int entero) {
        if (entero == 10) {
            char numChar = 'a';
            return (char) numChar;

        } else if (entero == 11) {
            char numChar = 'b';
            return (char) numChar;
        } else if (entero == 12) {
            char numChar = 'c';
            return (char) numChar;
        } else if (entero == 13) {
            char numChar = 'd';
            return (char) numChar;
        } else if (entero == 14) {
            char numChar = 'e';
            return numChar;
        } else if (entero == 15) {
            char numChar = 'f';
            return numChar;
        } else if (entero == 16) {
            char numChar = 'g';
            return numChar;
        } else if (entero == 17) {
            char numChar = 'h';
            return numChar;
        } else if (entero == 18) {
            char numChar = 'i';
            return numChar;
        } else if (entero == 19) {
            char numChar = 'j';
            return numChar;
        } else if (entero == 20) {
            char numChar = 'k';
            return numChar;
        } else if (entero == 21) {
            char numChar = 'l';
            return numChar;
        } else if (entero == 22) {
            char numChar = 'm';
            return numChar;
        } else if (entero == 23) {
            char numChar = 'n';
            return numChar;
        } else if (entero == 24) {
            char numChar = 'o';
            return numChar;
        } else if (entero == 25) {
            char numChar = 'p';
            return numChar;
        } else if (entero == 26) {
            char numChar = 'q';
            return numChar;
        } else if (entero == 27) {
            char numChar = 'r';
            return numChar;
        } else if (entero == 28) {
            char numChar = 's';
            return numChar;
        } else if (entero == 29) {
            char numChar = 't';
            return numChar;
        } else if (entero == 30) {
            char numChar = 'u';
            return numChar;
        } else if (entero == 31) {
            char numChar = 'v';
            return numChar;
        } else if (entero == 32) {
            char numChar = 'w';
            return numChar;
        } else if (entero == 33) {
            char numChar = 'x';
            return numChar;
        } else if (entero == 34) {
            char numChar = 'y';
            return numChar;
        } else if (entero == 35) {
            char numChar = 'z';
            return numChar;
        } else {
            int a = Integer.parseInt(numero);
            char z = (char) a;
            return z;

        }
    }

    public int chartoNum(char numChar) {
        if (numChar == 'a') {
            char numEntero = 10;
            return numEntero;
        } else if (numChar == 'b') {
            char numEntero = 11;
            return numEntero;
        } else if (numChar == 'c') {
            char numEntero = 12;
            return numEntero;
        } else if (numChar == 'd') {
            char numEntero = 13;
            return numEntero;
        } else if (numChar == 'e') {
            char numEntero = 14;
            return numEntero;
        } else if (numChar == 'f') {
            char numEntero = 15;
            return numEntero;
        } else if (numChar == 'g') {
            char numEntero = 16;
            return numEntero;
        } else if (numChar == 'h') {
            char numEntero = 17;
            return numEntero;
        } else if (numChar == 'i') {
            char numEntero = 18;
            return numEntero;
        } else if (numChar == 'j') {
            char numEntero = 19;
            return numEntero;
        } else if (numChar == 'k') {
            char numEntero = 20;
            return numEntero;
        } else if (numChar == 'l') {
            char numEntero = 21;
            return numEntero;
        } else if (numChar == 'm') {
            char numEntero = 22;
            return numEntero;
        } else if (numChar == 'n') {
            char numEntero = 23;
            return numEntero;
        } else if (numChar == 'o') {
            char numEntero = 24;
            return numEntero;
        } else if (numChar == 'p') {
            char numEntero = 25;
            return numEntero;
        } else if (numChar == 'q') {
            char numEntero = 26;
            return numEntero;
        } else if (numChar == 'r') {
            char numEntero = 27;
            return numEntero;
        } else if (numChar == 's') {
            char numEntero = 28;
            return numEntero;
        } else if (numChar == 't') {
            char numEntero = 29;
            return numEntero;
        } else if (numChar == 'u') {
            char numEntero = 30;
            return numEntero;
        } else if (numChar == 'v') {
            char numEntero = 31;
            return numEntero;
        } else if (numChar == 'w') {
            char numEntero = 32;
            return numEntero;
        } else if (numChar == 'x') {
            char numEntero = 33;
            return numEntero;
        } else if (numChar == 'y') {
            char numEntero = 34;
            return numEntero;
        } else if (numChar == 'z') {
            char numEntero = 35;
            return numEntero;
        } else {
            return 0;
        }
    }

    public String decToBase(int numero) {

        int residuo;
        int resultado;

        resultado = numero / base;//cuantas veces 
        residuo = numero % base;// residuo

        String numcadena = Integer.toString(resultado);
        String numcadena2 = Integer.toString(numToChar(residuo));
        String sfinal = numcadena + " " + numcadena2;

        return sfinal;

    }

    public int baseToDec(String numCadena) {
        int resultado = 0;
        int cont = 0;
        for (int i = numCadena.length(); i <= 0; i--) {
            int num = Integer.parseInt(numCadena);
            resultado = (int) Math.pow(num, cont);
            cont++;
        }

        return resultado;
    }
}
