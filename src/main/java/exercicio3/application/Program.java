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
package exercicio3.application;

import exercicio3.util.Album;
import exercicio3.util.Movie;
import exercicio3.util.StockKeeper;
import java.util.Scanner;

/**
 *
 * @author Lucas Alves - Pedro Spindola
 * @date 01/04/2024
 * @brief Class Program
 */
public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockKeeper stock = new StockKeeper("Estoque");
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        Album album1 = new Album();
        Album album2 = new Album();
        
        String nomeFilme, diretorFilme, artistaAlbum, nomeAlbum;
        double precoFilme, precoAlbum;
        int numeroCopiasFilme, numeroCopiasAlbum;
        
        System.out.println("Digite o nome do filme:");
        nomeFilme = scanner.next();
        System.out.println("Digite o diretor do filme:");
        diretorFilme = scanner.next();
        System.out.println("Digite o preço do filme:");
        precoFilme = scanner.nextDouble();
        System.out.println("Digite o número de cópias do filme:");
        numeroCopiasFilme = scanner.nextInt();
        stock.manageMovie(movie1, nomeFilme, diretorFilme, precoFilme, numeroCopiasFilme);
        
        System.out.println("Digite o nome do filme:");
        nomeFilme = scanner.next();
        System.out.println("Digite o diretor do filme:");
        diretorFilme = scanner.next();
        System.out.println("Digite o preço do filme:");
        precoFilme = scanner.nextDouble();
        System.out.println("Digite o número de cópias do filme:");
        numeroCopiasFilme = scanner.nextInt();
        stock.manageMovie(movie2, nomeFilme, diretorFilme, precoFilme, numeroCopiasFilme);
        
        System.out.println("Digite o nome do artista:");
        artistaAlbum = scanner.next();
        System.out.println("Digite o diretor do album:");
        nomeAlbum = scanner.next();
        System.out.println("Digite o preço do album:");
        precoAlbum = scanner.nextDouble();
        System.out.println("Digite o número de cópias do album:");
        numeroCopiasAlbum = scanner.nextInt();
        stock.manageAlbum(album1, nomeFilme, artistaAlbum, precoAlbum, numeroCopiasAlbum);
        
        System.out.println("Digite o nome do artista:");
        artistaAlbum = scanner.next();
        System.out.println("Digite o diretor do album:");
        nomeAlbum = scanner.next();
        System.out.println("Digite o preço do album:");
        precoAlbum = scanner.nextDouble();
        System.out.println("Digite o número de cópias do album:");
        numeroCopiasAlbum = scanner.nextInt();
        stock.manageAlbum(album1, nomeFilme, artistaAlbum, precoAlbum, numeroCopiasAlbum);
        
        
        }
}
