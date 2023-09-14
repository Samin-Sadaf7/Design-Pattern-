public class FormalTextStrategy implements TextGenerationStrategy{
   

    @Override
    public String generateText(String prompt) {
        return "Dear Sir/Madam,\n" + prompt;
    }

}
