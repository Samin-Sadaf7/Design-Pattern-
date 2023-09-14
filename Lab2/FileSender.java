public abstract class FileSender {
    public final void sendFile(){
            addTitle();
            attachFile();
            addComment();
            send();
        }
    protected abstract void addTitle();
    protected abstract void attachFile();
    protected abstract void addComment();
    protected void send(){
        System.out.println("Sending ... sent");
    }
}
