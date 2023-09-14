public class LanguageModel {
    private TextGenerationStrategy textGenerationStrategy;

    public LanguageModel(TextGenerationStrategy textGenerationStrategy) {
        this.textGenerationStrategy = textGenerationStrategy;
    }

    public void setTextGenerationStrategy(TextGenerationStrategy textGenerationStrategy) {
        this.textGenerationStrategy = textGenerationStrategy;
    }

    public String generateResponse(String prompt) {
        return textGenerationStrategy.generateText(prompt);
    }   
}
