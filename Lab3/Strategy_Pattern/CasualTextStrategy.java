public class CasualTextStrategy implements TextGenerationStrategy {
   
    @Override
    public String generateText(String prompt) {
        return "Hey there! " + prompt;
    }

}
