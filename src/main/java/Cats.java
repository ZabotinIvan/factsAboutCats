import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {

    private String id;
    private String text;
    private String type;
    private String user;
    private String upvotes;

   public Cats(
           @JsonProperty String id,
           @JsonProperty String text,
           @JsonProperty String type,
           @JsonProperty String user,
           @JsonProperty String upvotes) {
       this.id = id;
       this.text = text;
       this.type = type;
       this.user = user;
       this.upvotes = upvotes;
   }
   public Cats(){}

   public String getId(){
       return id;
   }
   public String getUpvotes(){
       return upvotes;
   }
   public String getText(){
       return text;
   }
   public String getType() {
       return type;
    }
    public String getUser(){
       return user;
    }
    @Override
    public String toString() {
        return "Post" +
                "\n  id=" + id +
                "\n  text=" + text +
                "\n  type=" + type +
                "\n  user=" + user +
                "\n  upvotes=" + upvotes;
    }
}
