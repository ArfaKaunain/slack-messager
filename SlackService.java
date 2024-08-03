package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SlackService {

    @Value("${slack.webhook.url}")
    private String slackWebhookUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public void sendMessage(String message) {
        // Log message to verify what is being sent
        System.out.println("Sending message: " + message);

        // Construct JSON payload
        String payload = "{\"text\":\"" + message + "\"}";

        // Log payload to verify correctness
        System.out.println("Payload: " + payload);

        // Send POST request to Slack
        restTemplate.postForObject(slackWebhookUrl, payload, String.class);
    }
}
