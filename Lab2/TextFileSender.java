public class TextFileSender extends FileSender {
    @Override
    protected void addTitle(){
        System.out.println("This is a Text File title");
    }
    @Override
    protected void attachFile(){
        System.out.println("Attaching a text file");
    }
    @Override
    protected void addComment(){
        System.out.println("Adding personal comment on the attached text file");
    }
}
