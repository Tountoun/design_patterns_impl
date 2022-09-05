package behavioural.observer;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Message {
    private String code;
    private String subject;
    private String content;

    public Message(String code, String subject, String content){
        this.code = code;
        this.subject = subject;
        this.content = content;
    }
    public Message(String subject, String content){
        this.code = randomCode();
        this.subject = subject;
        this.content = content;
    }

    private String randomCode() {
        AtomicReference<String> randCode = new AtomicReference<>("");
        List<Character> chars = new ArrayList<>();
        String lowercase_letters = "abcdefghijklmnopqrstuvwxyz";
        String uppercase_letters = "ABCDEFGHIJKLMNOPQRSTUUVXYZ";
        String numerical = "0123456789";
        Random random = new Random();
        for(int i=0; i<3; i++){
            chars.add(lowercase_letters.charAt(random.nextInt(26)));
            chars.add(uppercase_letters.charAt(random.nextInt(26)));
            chars.add(numerical.charAt(random.nextInt(10)));
        }
        Collections.shuffle(chars);
        chars.stream().forEach(character -> randCode.updateAndGet(v -> v + character));
        return randCode.get();
    }

    public String getCode() {
        return code;
    }
    public String getSubject() {
        return subject;
    }
    public String getContent() {
        return content;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code='" + code + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
