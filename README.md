Spring Boot Slack Message Application

This Spring Boot application sends a message to a Slack channel using Slack's Incoming Webhooks. The application is designed to demonstrate how to integrate Slack notifications into a Spring Boot application.

Project Structure

src/main/java/com/example/slackmessage: Contains the main application code.

SlackMessageApplication.java: The main entry point for the Spring Boot application.

SlackController.java: A REST controller that handles the endpoint for sending slack messages.

SlackService.java: A service class responsible for managing slack messaging logic.

SlackConfig.java: A configuration class used to set slack incoming webhook URL.

src/main/resources: Contains application properties and other resources.

application.properties: Workspace configurations of the app.
Prerequisites

Java version seventeen

Maven

Slack Workspace with Incoming Webhooks set up

Git

Setup Instructions
Clone the Repository
git clone https://github.com/ArfaKaunain/slack-messager.git
cd slack-messager

User guide to set up Slack incoming webhook;

Go to your slack workspace

Navigate to settings & administration > manage apps

Look for incoming webhooks and add it to your workspace.

Create a new webhook and choose the channel you would like messages to be posted in.

Copy the generated webhook URL.

Setting up Application Properties

Edit file src/main/resources/application.properties and add Slack Incoming Webhook URL:

slack.webhook.url=https://hooks.slack.com/services/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

The application will start on http://localhost:8080.

Sending a Slack Message

To post a message into slack channel, make POST request at /api/slack/message endpoint as shown below;

bash

Copy code

POST http://localhost:8080/api/slack/message

Content-Type: application/json

{

"text": "Your message here"

}

Development Choices

Spring Boot: Picked for its simplicity of configuration and robust ecosystem.

Slack Incoming Webhooks: Allows easy posting of messages from external sources into slack.

REST Controller: Provides an intuitive HTTP interface for sending messages.

Include the line that follows together with your webhook URL:

https://newworkspace-lx69380.slack.com/apps/A07F5FS8BM3-slack-messager

Pointers

Check that your Slack channel is correctly set to receive messages from the webhook.

Rest Controller: This application employs a REST controller to manage incoming requests and transmit messages to Slack.

License

This project is licensed under the MIT License. See the LICENSE file for details.
