public class VideoFileSender extends FileSender {
    @Override
    protected void addTitle(){
        System.out.println("This is a Video File title");
    }
    @Override
    protected void attachFile(){
        System.out.println("Attaching a Video file");
    }
    @Override
    protected void addComment(){
        System.out.println("Adding personal comment on the attached Video file");
    }
}
