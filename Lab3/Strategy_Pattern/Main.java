public class Main {
    public static void main(String[] args) {
        LanguageModel model = new LanguageModel(new FormalTextStrategy());

        String prompt = "Could you please provide more information?";
        String formalResponse = model.generateResponse(prompt);
        System.out.println("Formal Response: " + formalResponse);

        model.setTextGenerationStrategy(new CasualTextStrategy());
        String casualResponse = model.generateResponse(prompt);
        System.out.println("Casual Response: " + casualResponse);
    }
}
