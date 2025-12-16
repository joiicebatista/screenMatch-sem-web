package br.com.jrbdeveng.screenmatch.service;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.chat.completions.ChatCompletion;
import com.openai.models.chat.completions.ChatCompletionCreateParams;

import java.util.Optional;

public class ConsultaChatGPT {

    // Carrega OPENAI_API_KEY do ambiente
    private static final OpenAIClient client = OpenAIOkHttpClient.fromEnv();

    private ConsultaChatGPT() { }

    public static Optional<String> obterTraducao(String texto) {
        ChatCompletionCreateParams params = ChatCompletionCreateParams.builder()
                .model("gpt-4o-mini")                // ou ChatModel.GPT_4_1
                .addUserMessage("Traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        // Executa a chamada
        ChatCompletion chatCompletion = client
                .chat()
                .completions()
                .create(params);

        return chatCompletion
                .choices()      // em vez de getChoices()
                .get(0)
                .message()      // em vez de getMessage()
                .content();      // em vez de getContent()
    }
}