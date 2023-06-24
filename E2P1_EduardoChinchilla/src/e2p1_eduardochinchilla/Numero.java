package e2p1_eduardochinchilla;

public class Numero {

    private int base;
    private String numero;
    public Numero(){
        
    }
    public Numero(int base, int numero) {
        this.base = base;
        this.numero = decToBase(numero);
    }

    public char numToChar(int entero) {
        if (entero == 10) {
            char numChar = 'a';
            return numChar;
        } else if (entero == 11) {
            char numChar = 'b';
            return numChar;
        } else if (entero == 12) {
            char numChar = 'c';
            return numChar;
        } else if (entero == 13) {
            char numChar = 'd';
            return numChar;
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
        } else{
           return 'x';
        }
    }
    public int chartoNum(char numChar) {
        int numEntero = 0;
        if (numChar == 'a') {
            numEntero = 10;
            return numEntero;
        } else if (numChar == 'b') {
            numEntero = 11;
            return numEntero;
        } else if (numChar == 'c') {
            numEntero = 12;
            return numEntero;
        } else if (numChar == 'd') {
            numEntero = 13;
            return numEntero;
        } else if (numChar == 'e') {
            numEntero = 14;
            return numEntero;
        } else if (numChar == 'f') {
            numEntero = 15;
            return numEntero;
        } else if (numChar == 'g') {
            numEntero = 16;
            return numEntero;
        } else if (numChar == 'h') {
            numEntero = 17;
            return numEntero;
        } else if (numChar == 'i') {
            numEntero = 18;
            return numEntero;
        } else if (numChar == 'j') {
            numEntero = 19;
            return numEntero;
        } else if (numChar == 'k') {
            numEntero = 20;
            return numEntero;
        } else if (numChar == 'l') {
            numEntero = 21;
            return numEntero;
        } else if (numChar == 'm') {
            numEntero = 22;
            return numEntero;
        } else if (numChar == 'n') {
            numEntero = 23;
            return numEntero;
        } else if (numChar == 'o') {
            numEntero = 24;
            return numEntero;
        } else if (numChar == 'p') {
            numEntero = 25;
            return numEntero;
        } else if (numChar == 'q') {
            numEntero = 26;
            return numEntero;
        } else if (numChar == 'r') {
            numEntero = 27;
            return numEntero;
        } else if (numChar == 's') {
            numEntero = 28;
            return numEntero;
        } else if (numChar == 't') {
            numEntero = 29;
            return numEntero;
        } else if (numChar == 'u') {
            numEntero = 30;
            return numEntero;
        } else if (numChar == 'v') {
            numEntero = 31;
            return numEntero;
        } else if (numChar == 'w') {
            numEntero = 32;
            return numEntero;
        } else if (numChar == 'x') {
            numEntero = 33;
            return numEntero;
        } else if (numChar == 'y') {
            numEntero = 34;
            return numEntero;
        } else if (numChar == 'z') {
            numEntero = 35;
            return numEntero;
        } else {
            return numEntero;
        }

    }

    public String decToBase(int numero) {

        int residuo;
        int resultado;

        resultado = numero / base;//cuantas veces 
        residuo = numero % base;// residuo

        String numcadena = Integer.toString(resultado);
        String numcadena2 = Character.toString(numToChar(residuo));
        String sfinal = numcadena + numcadena2;

        return sfinal;

    }

    public String baseToDec(String numCadena) {

        String resulFinal;
        int cont = 1;
        
        int resultado = Integer.parseInt(numCadena, getBase());
        resulFinal = Integer.toString(resultado);

        return resulFinal;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
