public class Main {
    public static void main(String[] args) {
        // Problème 1 : Parcours du tableau
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }

        // Problème 2 : Division (remarque : division par zéro à vérifier)
        double result = calculateValue(5, 1);
        System.out.println("Result: " + result);

        // Problème 3 : Correction de la boucle infinie
        int count = 10;
        // Pour sortir de la boucle, on décrémente 'count'
        while (count > 0) {
            System.out.println("Count: " + count);
            count--; // décrémentation
        }

        // Problème 4 : Accès correct à un indice valide de la chaîne
        String message = "Bonjour";
        System.out.println("Longueur du message : " + message.length());
        // Par exemple, accéder à l'indice 2 (valide puisque 0 <= 2 < 7)
        char character = message.charAt(2);
        System.out.println("Caractère à l'indice 2 : " + character);

        // Problème 5 : Comparaison correcte de chaînes
        String str1 = "Hello";
        String str2 = new String("Hello");
        // Utiliser equals() pour comparer le contenu des chaînes
        System.out.println("Comparaison de chaînes avec equals : " + str1.equals(str2));

        // Problème 6 : Instanciation correcte pour éviter NullPointerException
        Main mainObj = new Main();
        mainObj.method();
    }

    // Méthode pour la division avec vérification pour éviter la division par zéro
    public static int calculateValue(int a, int b) {
        if(b == 0) {
            System.out.println("Erreur: division par zéro");
            return 0; // ou lever une exception selon le besoin
        }
        return a / b;
    }

    // Méthode d'instance
    public void method() {
        System.out.println("Méthode appelée !");
    }
}
