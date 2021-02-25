public class WebinarRepository {
    private Webinar[] webinars;
    private int index = 0;

    public WebinarRepository(int size) {
        webinars = new Webinar[size];
    }

    public void add(Webinar webinar) {
        if(index < webinars.length) {
            webinars[index++] = webinar;
        }
    }

    public void displayAll() {
        for (int i = 0; i < index; i++) {
//            System.out.println(webinars[i]);
            webinars[i].display();
        }
    }

    public Webinar find(String title, int p) {
        for (int i = 0; i < index; i++) {
            if(webinars[i].getTitle().equals(title)){
                return webinars[i];
            }
        }
        return null;
    }
}
