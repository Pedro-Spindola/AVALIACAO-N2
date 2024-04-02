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
package exercicio1.application;

import exercicio1.util.Aluno;
import java.util.Scanner;

/**
 *
 * @author Lucas Alves - Pedro Spindola
 * @date 01/04/2024
 * @brief Class TesteAluno
 */
public class TesteAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicializando meus atributos
        String nomeDoAluno = null;
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0;

        // Cadastrar os dados do primeiro aluno.
        
        System.out.println("\n--- CADASTRAR 1º ALUNO ---\n");

        System.out.println("Informe o nome do Aluno: ");
        nomeDoAluno = scanner.nextLine();
        System.out.println("Informe a nota N1: ");
        n1 = scanner.nextDouble();
        System.out.println("Informe a nota N2: ");
        n2 = scanner.nextDouble();
        System.out.println("Informe a nota N3: ");
        n3 = scanner.nextDouble();
        System.out.println("Informe a nota N4: ");
        n4 = scanner.nextDouble();
        
        // Instanciar o primeiro aluno
        
        Aluno aluno1 = new Aluno(nomeDoAluno, n1, n2, n3, n4);
        
        // Cadastrar os dados do segundo aluno.
        
        System.out.println("\n--- CADASTRAR 2º ALUNO ---\n");
        
        scanner.nextLine();
        System.out.println("Informe o nome do Aluno: ");
        nomeDoAluno = scanner.nextLine();
        System.out.println("Informe a nota N1: ");
        n1 = scanner.nextDouble();
        System.out.println("Informe a nota N2: ");
        n2 = scanner.nextDouble();
        System.out.println("Informe a nota N3: ");
        n3 = scanner.nextDouble();
        System.out.println("Informe a nota N4: ");
        n4 = scanner.nextDouble();
        
        // Instanciar o segundo aluno
        
        Aluno aluno2 = new Aluno(nomeDoAluno, n1, n2, n3, n4);
        
        // Cadastrar os dados do terceiro aluno.
        
        System.out.println("\n--- CADASTRAR 3º ALUNO ---\n");
        
        scanner.nextLine();
        System.out.println("Informe o nome do Aluno: ");
        nomeDoAluno = scanner.nextLine();
        System.out.println("Informe a nota N1: ");
        n1 = scanner.nextDouble();
        System.out.println("Informe a nota N2: ");
        n2 = scanner.nextDouble();
        System.out.println("Informe a nota N3: ");
        n3 = scanner.nextDouble();
        System.out.println("Informe a nota N4: ");
        n4 = scanner.nextDouble();
        
        // Instanciar o terceiro aluno
        
        Aluno aluno3 = new Aluno(nomeDoAluno, n1, n2, n3, n4);
        
        // Mostrar a medias de todos os alunos.
        
        System.out.println(Aluno.getSomaDeMedia());

    }
}
