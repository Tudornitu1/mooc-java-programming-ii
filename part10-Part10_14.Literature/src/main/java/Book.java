public class Book {
    
    private String title;
    private int recAge;

    public Book(String title, int recAge) {
        this.title = title;
        this.recAge = recAge;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRecAge() {
        return recAge;
    }

    public void setRecAge(int recAge) {
        this.recAge = recAge;
    }
    
    @Override
    public String toString(){
        return this.title+"(recommended for "+this.recAge+" year-olds or older)";
    }

    

}
