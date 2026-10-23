public class main {

    public static void main(String[] args){

        Title t1 = new PrintedBook("Book1", "TE", 140, 166);
        Title t2 = new AudioBook("Book2","FAG",140,120);
        Title t3 = new EBook("BooK3","BI",97,50,205,360000,false);
        Title t4 = new AudioBook("Book4","LYRIK",140,180);
        Title t5 = new PrintedBook("Book5", "SKØN", 111, 111);

        System.out.println("Point for book1: " + t1.calculateRoyalty());
        System.out.println();
        System.out.println("Point for book2: " + t2.calculateRoyalty());
        System.out.println();
        System.out.println("Point for book3: " + t3.calculateRoyalty());
        System.out.println();
        System.out.println("Point for book4: " + t4.calculateRoyalty());
        System.out.println();
        System.out.println("Point for book5: " + t5.calculateRoyalty());
    }
}
