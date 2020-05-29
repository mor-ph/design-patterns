package factory;

import mediator.MsgMediator;
import mediator.User;
import mediator.UserType;

public class ChatUser extends User{

	public ChatUser(String username, MsgMediator md) {
		super(username, md);
		this.type = UserType.CHATUSER;
		md.addUser(this);
	}

	@Override
	public void send(String msg) {
		System.out.println("+ " + this.username + ": " + msg);
		md.send(msg, this);
		if(msg == "addBot") {
			ChatFactory factory = new ChatFactory();
			factory.createNew("bot", UserType.BOT, md);
		}
	}

	@Override
	public void receive(String msg, String sender) {
		System.out.println("\t -> " + this.username + " received '" + msg + "'\n");
	}
	
	
	
}
