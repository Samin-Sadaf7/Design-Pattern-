public class ImageFileSender extends FileSender{
    @Override
    protected void addTitle(){
        System.out.println("This is an Image File title");
    }
    @Override
    protected void attachFile(){
        System.out.println("Attaching an Image file");
    }
    @Override
    protected void addComment(){
        System.out.println("Adding personal comment on the attached image file");
    }
}
