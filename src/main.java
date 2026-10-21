public class main {

    public static void main(String[] args){

        Title t1 = new PrintedBook("Book1", "TE", 140, 166);
        Title t2 = new AudioBook("Book2","FAG",140,120);
        Title t3 = new EBook("BooK3","BI",97,50,205,360000,false);
        Title t4 = new AudioBook("Book4","LYRIK",140,180);

        System.out.println("Point for book1: " + t1.calculatePoints());
        System.out.println();
        System.out.println("Point for book2: " + t2.calculatePoints());
        System.out.println();
        System.out.println("Point for book3: " + t3.calculatePoints());
        System.out.println();
        System.out.println("Point for book4: " + t4.calculatePoints());
    }
}
