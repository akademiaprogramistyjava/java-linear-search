public class Webinar {
    private String title;
    private String description;
    private String link;

    public Webinar(String title, String description, String link) {
        this.title = title;
        this.description = description;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Webinar{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", link='" + link + '\'' +
                '}';
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Description: "+description);
        System.out.println("Link: "+link);
    }
}
