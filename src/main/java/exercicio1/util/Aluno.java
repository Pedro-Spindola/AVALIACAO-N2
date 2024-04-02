/*
 * Copyright (C) 2024 aluno
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package exercicio1.util;

/**
 *
 * @author Lucas Alves - Pedro Spindola
 * @date 01/04/2024
 * @brief Class Aluno
 */
public class Aluno {
    
    // Inicializando meus atributos
    private String nomeDoAluno;
    private double n1, n2, n3, n4;
    private double valormedia;
    private static int numeroDeAlunos = 0;
    private static double somaDeMedia = 0;
    
    // Construtor da minha class
    
    public Aluno(String nomeDoAluno, double n1, double n2, double n3, double n4) {
        this.nomeDoAluno = nomeDoAluno;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        valormedia = media();
        numeroDeAlunos++;
        somaDeMedia += valormedia;
    }
    
    // Metodo que vai calcular a media do aluno
    
    public double media() {
        return valormedia = (((n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 * 4)) / 10);
    }
    
    // Metodo para comparar a media de um aluno com outro especifico aluno
    
    public void compararMedia(Aluno alunoX) {
        double mediaAlunoX = alunoX.getValormedia();
        if (valormedia == mediaAlunoX) {
            System.out.println("0");
        } else if (valormedia < mediaAlunoX) {
            System.out.println("-1");
        } else if (valormedia > mediaAlunoX) {
            System.out.println("1");
        }
    }

    public double getValormedia() {
        return valormedia;
    }

    public static double getSomaDeMedia() {
        somaDeMedia = somaDeMedia / numeroDeAlunos;
        return somaDeMedia;
    }

}
