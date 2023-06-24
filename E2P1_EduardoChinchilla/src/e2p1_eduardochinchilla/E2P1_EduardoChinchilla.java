package e2p1_eduardochinchilla;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.*;
import java.util.*;
import javax.swing.JOptionPane;

public class E2P1_EduardoChinchilla {

    static ArrayList<Numero> num = new ArrayList<>();
    static Scanner read = new Scanner(System.in);
    static Numero num2 = new Numero();

    public static void main(String[] args) {
        int x = 0;
        botones();
        menu(x);

    }

    public static void botones() {

        JFrame frame = new JFrame();
        JButton boton1 = new JButton();
        JButton boton2 = new JButton();
        JButton boton3 = new JButton();
        JLabel label = new JLabel();

        label.setText("Examen 2");
        label.setBounds(150, 0, 200, 150);
        label.setVisible(true);
        label.setLayout(null);

        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.gray);

        frame.add(boton1);
        boton1.setText("Numeros");
        boton1.setBounds(150, 100, 200, 100);

        frame.add(boton2);
        boton2.setText("Operaciones");
        boton2.setBounds(150, 225, 200, 100);

        frame.add(boton3);
        boton3.setText("Salir");
        boton3.setBounds(150, 350, 200, 100);

        frame.add(label);
        frame.setVisible(true);

        boton1.addActionListener(e -> {
            menu(1);
        });

        boton2.addActionListener(e -> {
            menu(2);
        });
        boton3.addActionListener(e -> {
            menu(3);
            System.exit(0);
        });
    }

    public static void menu(int x) {

        switch (x) {
            case 1: {

                JOptionPane.showMessageDialog(null, "Ha entrado a numeros");
                int op = 0;
                while (op != 3) {
                    System.out.println("1. Agregar Numero");
                    System.out.println("2. Eliminar Numero");
                    System.out.println("3. Menu Principal");

                    op = read.nextInt();

                    switch (op) {
                        case 1: {

                            System.out.println("Ingrese la base ");
                            int base = read.nextInt();
                            System.out.println("Ingrese el valor del numero decimal: ");
                            int numDecimal = read.nextInt();

                            while (base < 2 || base > 35 && numDecimal < 1) {
                                System.out.println("Error, ingrese de nuevo");
                                System.out.println("Ingrese la base ");
                                base = read.nextInt();
                                System.out.println("Ingrese el valor del numero decimal: ");
                                numDecimal = read.nextInt();
                            }
                            
                            Numero n = new Numero(base, numDecimal);
                            num.add(n);
                            break;
                        }
                        case 2: {
                            while (num.size()>0){
                            System.out.println("Eliminar ");
                            System.out.println(impr());
                            System.out.println("Ingrese el indice a remover");
                            int opcion = read.nextInt();
                            num.remove(opcion);
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Salir al Menu");
                            break;
                        }
                    }
                }

                break;
            }
            case 2: {
                JOptionPane.showMessageDialog(null, "Ha entrado a operaciones");
                int opcion = 0;
                while (opcion != 4) {
                    System.out.println("1. Sumar Numeros");
                    System.out.println("2. Restar Numeros");
                    System.out.println("3. Multiplicar Numeros");
                    System.out.println("4. Menu principal");

                    opcion = read.nextInt();

                    switch (opcion) {
                        case 1: {
                            System.out.println(impr());
                            System.out.println("Ingrese el primer indice a hacer la suma");
                            int op = read.nextInt();
                            
                            System.out.println("Ingrese el segundo indice a hacer la suma");
                            int op2 = read.nextInt();
                            
                            if (num.get(op).getBase() == num.get(op2).getBase()){
                                int sumap1 = Integer.parseInt(num.get(op).getNumero(),num.get(op).getBase());
                                int sumap2 = Integer.parseInt(num.get(op2).getNumero(),num.get(op2).getBase());
                                int sumapFinal = sumap1 + sumap2;
                                num2.setBase(num.get(op).getBase());
                                String sumaFinal = num2.decToBase(sumapFinal);
                                JOptionPane.showConfirmDialog(null,sumaFinal);
                            }
                            else if(num.get(op).getBase() > num.get(op2).getBase()){
                                String sDecimal = num.get(op2).baseToDec(num.get(op2).getNumero());
                                String sBase = num2.decToBase(Integer.parseInt(sDecimal));
                                num2.setBase(num.get(op).getBase());
                                int sumap1 = Integer.parseInt(num.get(op).getNumero(),num.get(op).getBase());
                                int sumap2 = Integer.parseInt(sBase,num.get(op).getBase());
                                int sumapFinal = sumap1+sumap2;
                                
                                String sumaFinal = num2.decToBase(sumapFinal);
                                JOptionPane.showConfirmDialog(null,sumaFinal);
                            }else if(num.get(op2).getBase() > num.get(op).getBase()){
                                String sDecimal = num.get(op).baseToDec(num.get(op).getNumero());
                                String sBase = num2.decToBase(Integer.parseInt(sDecimal));
                                num2.setBase(num.get(op).getBase());
                                int sumap1 = Integer.parseInt(num.get(op2).getNumero(),num.get(op2).getBase());
                                int sumap2 = Integer.parseInt(sBase,num.get(op2).getBase());
                                int sumapFinal = sumap1+sumap2;
                                
                                String sumaFinal = num2.decToBase(sumapFinal);
                                JOptionPane.showConfirmDialog(null,sumaFinal);
                            }
                            
                            break;
                        }
                        case 2: {
                            System.out.println(impr());
                            System.out.println("Ingrese el primer indice a hacer la resta");
                            int op = read.nextInt();
                            
                            System.out.println("Ingrese el segundo indice a hacer la resta");
                            int op2 = read.nextInt();
                            
                            if (num.get(op).getBase() == num.get(op2).getBase()){
                                int sumap1 = Integer.parseInt(num.get(op).getNumero(),num.get(op).getBase());
                                int sumap2 = Integer.parseInt(num.get(op2).getNumero(),num.get(op2).getBase());
                                int sumapFinal = sumap1 - sumap2;
                                num2.setBase(num.get(op).getBase());
                                String sumaFinal = num2.decToBase(sumapFinal);
                                JOptionPane.showConfirmDialog(null,sumaFinal);
                            }
                            else if(num.get(op).getBase() > num.get(op2).getBase()){
                                String sDecimal = num.get(op2).baseToDec(num.get(op2).getNumero());
                                String sBase = num2.decToBase(Integer.parseInt(sDecimal));
                                num2.setBase(num.get(op).getBase());
                                int sumap1 = Integer.parseInt(num.get(op).getNumero(),num.get(op).getBase());
                                int sumap2 = Integer.parseInt(sBase,num.get(op).getBase());
                                int sumapFinal = sumap1-sumap2;
                                
                                String sumaFinal = num2.decToBase(sumapFinal);
                                JOptionPane.showConfirmDialog(null,sumaFinal);
                            }else if(num.get(op2).getBase() > num.get(op).getBase()){
                                String sDecimal = num.get(op).baseToDec(num.get(op).getNumero());
                                String sBase = num2.decToBase(Integer.parseInt(sDecimal));
                                num2.setBase(num.get(op).getBase());
                                int sumap1 = Integer.parseInt(num.get(op2).getNumero(),num.get(op2).getBase());
                                int sumap2 = Integer.parseInt(sBase,num.get(op2).getBase());
                                int sumapFinal = sumap1-sumap2;
                                
                                String sumaFinal = num2.decToBase(sumapFinal);
                                JOptionPane.showMessageDialog(null,sumaFinal);
                            }
                        }
                        case 3: {
                            System.out.println(impr());
                            System.out.println("Ingrese el primer indice a hacer la suma");
                            int op = read.nextInt();
                            
                            System.out.println("Ingrese el segundo indice a hacer la suma");
                            int op2 = read.nextInt();
                            
                            if (num.get(op).getBase() == num.get(op2).getBase()){
                                int sumap1 = Integer.parseInt(num.get(op).getNumero(),num.get(op).getBase());
                                int sumap2 = Integer.parseInt(num.get(op2).getNumero(),num.get(op2).getBase());
                                int sumapFinal = sumap1 * sumap2;
                                num2.setBase(num.get(op).getBase());
                                String sumaFinal = num2.decToBase(sumapFinal);
                                JOptionPane.showConfirmDialog(null,sumaFinal);
                            }
                            else if(num.get(op).getBase() > num.get(op2).getBase()){
                                String sDecimal = num.get(op2).baseToDec(num.get(op2).getNumero());
                                String sBase = num2.decToBase(Integer.parseInt(sDecimal));
                                num2.setBase(num.get(op).getBase());
                                int sumap1 = Integer.parseInt(num.get(op).getNumero(),num.get(op).getBase());
                                int sumap2 = Integer.parseInt(sBase,num.get(op).getBase());
                                int sumapFinal = sumap1*sumap2;
                                
                                String sumaFinal = num2.decToBase(sumapFinal);
                                JOptionPane.showConfirmDialog(null,sumaFinal);
                            }else if(num.get(op2).getBase() > num.get(op).getBase()){
                                String sDecimal = num.get(op).baseToDec(num.get(op).getNumero());
                                String sBase = num2.decToBase(Integer.parseInt(sDecimal));
                                num2.setBase(num.get(op).getBase());
                                int sumap1 = Integer.parseInt(num.get(op2).getNumero(),num.get(op2).getBase());
                                int sumap2 = Integer.parseInt(sBase,num.get(op2).getBase());
                                int sumapFinal = sumap1*sumap2;
                                
                                String sumaFinal = num2.decToBase(sumapFinal);
                                JOptionPane.showConfirmDialog(null,sumaFinal);
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("Salir");
                            break;
                        }
                    }
                }
                break;
            }
            case 3: {
                System.out.println("Salio");
                break;
            }
        }

    }
    public static String impr(){
        String s = "";
        for (int i = 0; i < num.size(); i++) {
            s += i +")" +" " + num.get(i).getNumero()+ " Base " + num.get(i).getBase()+ " :"+ " " + num.get(i).baseToDec(num.get(i).getNumero()) + " "+"\n";
        }
        
        
        return s;
    }
}
