public abstract class Title {
    private String title;
    private String literatureType;
    protected double rate = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;

    }

    public double calculateRoyalty() {
        double t = rate * calculatePoints();
        int n = 2;

        return Math.round(t * Math.pow(10, n)) / Math.pow(10, n);
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType() {
        double royalty = 0;
        switch (literatureType){
            case "BI": royalty = 3;break;
            case "TE": royalty = 3;break;
            case "LYRIK": royalty = 6;break;
            case "SKØN": royalty = 1.7;break;
            case "FAG": royalty = 1;break;
            default: royalty = 1;break;
        }
        return royalty;
    }
}
