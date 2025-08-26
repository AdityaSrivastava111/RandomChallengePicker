import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

public class RandomChallengesApp extends Application {

    ArrayList<String> challenges = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        addDefaultChallenges();

        Label titleLabel = new Label("Random Challenges for Friends");
        titleLabel.setFont(Font.font("Arial", 24));
        titleLabel.setTextFill(Color.DARKBLUE);

        Label infoLabel = new Label("Click button to get a random fun challenge!");
        infoLabel.setFont(Font.font("Arial", 14));

        Button getChallengeBtn = new Button("Get a Random Challenge");
        getChallengeBtn.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");
        getChallengeBtn.setFont(Font.font("Arial", 16));
        getChallengeBtn.setPrefWidth(220);

        Label challengeLabel = new Label("");
        challengeLabel.setFont(Font.font("Arial", 16));
        challengeLabel.setWrapText(true);
        challengeLabel.setMaxWidth(400);
        challengeLabel.setTextFill(Color.DARKRED);

        getChallengeBtn.setOnAction(e -> {
            if (challenges.isEmpty()) {
                challengeLabel.setText("No challenges available.");
                return;
            }
            Random rand = new Random();
            int index = rand.nextInt(challenges.size());
            challengeLabel.setText(challenges.get(index));
        });

        TextField newChallengeField = new TextField();
        newChallengeField.setPromptText("Add your own challenge");
        newChallengeField.setPrefWidth(300);
        newChallengeField.setFont(Font.font("Arial", 14));

        Button addChallengeBtn = new Button("Add Challenge");
        addChallengeBtn.setFont(Font.font("Arial", 14));
        addChallengeBtn.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white;");

        Label addStatus = new Label("");
        addStatus.setFont(Font.font("Arial", 12));
        addStatus.setTextFill(Color.FORESTGREEN);

        addChallengeBtn.setOnAction(e -> {
            String newChallenge = newChallengeField.getText().trim();
            if (!newChallenge.isEmpty()) {
                challenges.add(newChallenge);
                addStatus.setText("Challenge added!");
                newChallengeField.clear();
            } else {
                addStatus.setText("Please enter a challenge to add.");
                addStatus.setTextFill(Color.RED);
            }
        });

        VBox challengeBox = new VBox(10, infoLabel, getChallengeBtn, challengeLabel);
        challengeBox.setAlignment(Pos.CENTER);

        HBox addChallengeBox = new HBox(10, newChallengeField, addChallengeBtn);
        addChallengeBox.setAlignment(Pos.CENTER);

        VBox root = new VBox(20, titleLabel, challengeBox, addChallengeBox, addStatus);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #F0F8FF;");

        Scene scene = new Scene(root, 500, 350);

        primaryStage.setTitle("Random Challenges Generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addDefaultChallenges() {
        String[] defaultChallenges = {
            "Sing a song loudly in public",
            "Do 10 jumping jacks",
            "Take a funny selfie and share it",
            "Try to juggle 3 objects",
            "Write a poem about your friend",
            "Do 15 push-ups",
            "Dance for 30 seconds without music",
            "Make a funny face and hold it",
            "Compliment a stranger today",
            "Eat something you’ve never tried before",
            "Do your best celebrity impression",
            "Balance on one leg for 1 minute",
            "Share a joke that makes everyone laugh",
            "Do a random act of kindness",
            "Say hello to 5 people you don’t know",
            "Wear your clothes inside out for an hour",
            "Draw a quick portrait of your friend",
            "Try to whistle your favorite tune",
            "Tell an embarrassing story confidently",
            "Make a breakfast smoothie with three ingredients",
            "Write a short story starting with 'Once upon a time…'",
            "Take a 10-minute walk without your phone",
            "Build a paper airplane and fly it",
            "Make a paper hat and wear it",
            "Name 5 countries in 10 seconds",
            "Do a silly dance move",
            "Talk in a funny accent for 5 minutes",
            "Create a secret handshake with your friend",
            "Say a tongue twister three times fast",
            "Do 20 sit-ups",
            "Write a funny limerick",
            "Invent a new game and explain the rules",
            "Call a friend and tell a funny story",
            "Taste test three different snacks blindfolded",
            "Make a paper boat and float it in water",
            "Give a sincere compliment to everyone in the room",
            "Try yoga for 5 minutes",
            "Sing the chorus of a popular song",
            "Do 10 squats",
            "Recite the alphabet backwards",
            "Create a 30-second rap",
            "Make a funny face selfie",
            "Say 'hello' in 5 different languages",
            "Draw your favorite animal in 1 minute",
            "Do a handstand against a wall",
            "Clean your room for 10 minutes",
            "Write a thank-you note to someone",
            "Make a funny video and share it",
            "Try to balance a book on your head",
            "Tell a scary story with a serious face",
            "Do a plank for 1 minute",
            "Say the names of all your classmates",
            "Pretend to be a news reporter",
            "Mimic your favorite movie character",
            "Make a paper snowflake",
            "Do 5 cartwheels",
            "Try a new food recipe",
            "Share a childhood memory",
            "Make up a funny song about your day",
            "Do a silly walk around the room",
            "Tell a joke without laughing",
            "Draw a comic strip",
            "Make a birthday card for someone",
            "Name 3 movies you love",
            "Do a 1-minute meditation",
            "Write a letter to your future self",
            "Make a tower with blocks or cards",
            "Act like your favorite animal",
            "Guess a friend's favorite color",
            "Draw a map of your dream vacation",
            "Make a list of 10 things you love",
            "Try balancing on tiptoes for 30 seconds",
            "Say a poem aloud",
            "Try to solve a Rubik’s cube",
            "Do 15 jumping jacks",
            "Tell your funniest joke",
            "Make shadow puppets",
            "Take a funny group photo",
            "Play rock-paper-scissors best of 3",
            "Build a fort with pillows",
            "Give a 2-minute talk about your hobby",
            "Say a quote you like",
            "Try to touch your nose with your tongue",
            "Make up a secret code",
            "Do a silly dance challenge",
            "Write a haiku",
            "Pretend you’re a chef cooking a fancy meal",
            "Make a hand-drawn map of your neighborhood",
            "Give a high five to everyone near you",
            "Try a new hairstyle",
            "Draw your dream house",
            "Tell a story using only sounds",
            "Make a list of your favorite foods",
            "Try to do a magic trick",
            "Balance an object on your head",
            "Make a funny face selfie with a friend",
            "Name 5 animals that start with 'S'",
            "Write a short riddle and ask your friends",
            "Act like a robot for 1 minute",
            "Do a dramatic reading of a comic strip"
        };

        for (String challenge : defaultChallenges) {
            challenges.add(challenge);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
