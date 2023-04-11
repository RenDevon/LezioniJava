import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mains {

    public static void main(String[] args) {
        String gente = ";scemo;beppe;scemo;enrico;mel;";
        gente = gente.substring(1);
        List<String> arrayDiStringhe = Arrays.asList(gente.split(";"));
        List<String> arrayDiStringheDivise = new ArrayList<>(arrayDiStringhe);

        List<String> stringhePulite = new ArrayList<>();
        for (int i = 0; i < arrayDiStringheDivise.size(); i++) {
            String elementoCorrente = arrayDiStringheDivise.get(i);
            if (!stringhePulite.contains(elementoCorrente)) {
                stringhePulite.add(elementoCorrente);
                System.out.println(stringhePulite);
            }
        }
    }
}