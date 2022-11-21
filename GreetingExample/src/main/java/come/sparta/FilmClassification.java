package come.sparta;

public class FilmClassification {
    public static String availableClassifications(int ageOfViewer) {
        String result;
        if (ageOfViewer <= 3) {
            result = "No films are available.";
        } else if (ageOfViewer <= 11) {
            result = "U, and PG films are available. 12A films are available if child is accompanied by adult.";
        } else if (ageOfViewer <= 14) {
            result = "U, PG, 12A and 12 films are available.";
        } else if (ageOfViewer <= 17) {
            result = "U, PG, 12A, 12 and 15 films are available.";
        } else {
            result = "All films are available.";
        }
        return result;
    }


}

