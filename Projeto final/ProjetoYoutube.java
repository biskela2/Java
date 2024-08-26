package com.mycompany.projetoyoutube;
public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 7 de HTML 5");
        
        Gafonhoto g[] = new Gafonhoto[2];
        g[0] = new Gafonhoto("José", 22, "M", "JJ");
        g[1] = new Gafonhoto("Elisa", 20, "F", "Eli");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        
        Visualizacao vis[] = new Visualizacao [5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(35.0f);
        System.out.println(vis[0].toString());
        
    }
}
