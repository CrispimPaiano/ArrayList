/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class Exemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jennifer");
        nomes.add("Eu aqui");
        nomes.add("Poney");
        nomes.add("Homem da Cadeira Ambulante");

        int quantidadeDeItensNoArrayList = nomes.size();
        System.out.println(quantidadeDeItensNoArrayList);

        String maiorNome = "";

        if (nomes.get(0).length() > maiorNome.length()) {
            maiorNome = nomes.get(0);
        }

        if (nomes.get(1).length() > maiorNome.length()) {
            maiorNome = nomes.get(1);
        }
        if (nomes.get(2).length() > maiorNome.length()) {
            maiorNome = nomes.get(2);
        }
        if (nomes.get(3).length() > maiorNome.length()) {
            maiorNome = nomes.get(3);
        }

        String menorNome = "";

        for (int i = 65; i < 90; i++) {
            for (int j = 65; j < 90; j++) {
                menorNome += (char) i + "" + (char) j + "\n";
            }
        }
        System.out.println(menorNome);

        if (nomes.get(0).length() < menorNome.length()) {
            menorNome = nomes.get(1);
        }
        if (nomes.get(1).length() < menorNome.length()) {
            menorNome = nomes.get(1);
        }
        if (nomes.get(2).length() < menorNome.length()) {
            menorNome = nomes.get(2);
        }
        if (nomes.get(3).length() < menorNome.length()) {
            menorNome = nomes.get(3);
        }

        System.out.println("Maior Nome: " + maiorNome);
        System.out.println("Menor Nome: " + menorNome);

    }

}
