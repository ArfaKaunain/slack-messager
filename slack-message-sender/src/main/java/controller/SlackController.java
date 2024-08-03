package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.SlackService;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class SlackController {

    @Autowired
    private SlackService slackService;

    @PostMapping("/sendSlackMessage")
    public void sendSlackMessage(@RequestBody Map<String, String> request) {
        String message = request.get("message");
        slackService.sendMessage(message);
    }
}
