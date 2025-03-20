import java.util.Scanner;
import java.lang.Math;
import java.io.FileWriter;
import java.io.FileReader;

class Esercizio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner reader;
        FileWriter writer;

        String inputFileName, outputFileName, riga;

        System.out.println("Nome del file di input");
        inputFileName = input.nextLine();
        System.out.println("Nome del file di output");
        outputFileName = input.nextLine();
        reader = new Scanner(new File(InputFileName));
        writer = new FileWriter(OutputFileName);
        do {
            riga = reader.nextLine();
            riga = inverti(riga);
            writer.write(riga + "\n");
        } while (!reader.hasNextLine());
        reader.close();
        writer.close();
    }
    
    public static String inverti(String riga) {
        int n, i;
        String agir;

        n = riga.length();
        for (i = n - 1; i >= 0; i--) {
            agir = agir + riga.charAt(i);
        }
        
        return agir;
    }
}
