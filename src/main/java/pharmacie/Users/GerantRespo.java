package pharmacie.Users;
import java.util.Scanner;
import pharmacie.Services.GestionConseils;
import pharmacie.Services.GestionQuestions;

public class GerantRespo {
    public GerantRespo() {
        }

    public int reponse() {
        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        return x;
    }
}


