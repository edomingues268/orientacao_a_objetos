import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Musica> musica = new ArrayList<>(); 

        musica.add(new Musica("Boate Azul", "Bruno e Marrone"));
        musica.add(new Musica("Sem medo de ser feliz", "Zezé di camargo e Luciano"));
        musica.add(new Musica("God is", "Kanye west"));

        for(Musica m : musica){
            System.out.println("Tocando " + m.getTitulo() + " " + m.getArtista());
        }

    }
}
