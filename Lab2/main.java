public class main {
    public static void main(String args[]){
        TextFileSender textFileSender = new TextFileSender();
        textFileSender.sendFile();
        ImageFileSender imageFileSender = new ImageFileSender();
        imageFileSender.sendFile();
        VideoFileSender videoFileSender = new VideoFileSender();
        videoFileSender.sendFile();
        ThreeDFileSender three3dFileSender = new ThreeDFileSender();
        three3dFileSender.sendFile();
    }
}
