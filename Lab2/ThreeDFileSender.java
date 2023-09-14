public class ThreeDFileSender extends FileSender {
    @Override
    protected void addTitle(){
        System.out.println("This is a 3D File title");
    }
    @Override
    protected void attachFile(){
        System.out.println("Attaching a 3D file");
    }
    @Override
    protected void addComment(){
        System.out.println("Adding personal comment on the attached 3D file");
    }
}
