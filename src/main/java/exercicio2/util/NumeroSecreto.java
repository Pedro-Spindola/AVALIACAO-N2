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
package exercicio2.util;

import java.util.Random;

/**
 *
 * @author Lucas Alves - Pedro Spindola
 * @date 01/04/2024
 * @brief Class NumeroSecreto
 */
public class NumeroSecreto {
    
    // Inicializando meus atributos
    
    Random random = new Random();
    private int numeroAleatorio = -1;
    
    // Construtor vazio
    public NumeroSecreto() {
    }
    
    //Metodo para sortear um numero.
    public int sortear() {
        return random.nextInt(101); // Gera um número aleatório entre 0 e 100
    }
        
    public int adivinhar(int numb) {
        int numbRandom = sortear();
        if (numbRandom == numeroAleatorio){
            System.out.println("-2");
            return -2;
        } else if (numb < numbRandom){
            System.out.println("-1");
            return -1;
        } else if (numb == numbRandom){
            System.out.println("0");
            return 0;
        } else if (numb > numbRandom){
            System.out.println("1");
            return 1;
        }
        return -2;
    }
}
