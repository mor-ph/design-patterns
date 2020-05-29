import factory.ChatFactory;
import mediator.ChatMsgMediator;
import mediator.User;
import mediator.UserType;

public class Main {

	public static void main(String[] args) {
		ChatFactory factory = new ChatFactory();
		ChatMsgMediator md = new ChatMsgMediator();
		
		User well = factory.createNew("well", UserType.CHATUSER, md);
		User yknow = factory.createNew("yknow", UserType.CHATUSER, md);
		User heehee = factory.createNew("heehee", UserType.CHATUSER, md);
		
		well.send("addBot");
		well.send("how you doin");
		yknow.send("good, saw a cat today");
		well.send("shii");
		heehee.send("wew.. that was such a cat thing to do");
		well.send("......");
	}

}
