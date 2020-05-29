package factory;

import mediator.MsgMediator;
import mediator.User;
import mediator.UserType;

public class ChatFactory {
	
	public User createNew(String username, UserType type, MsgMediator md) {
		
		User user = null;
		
		switch(type) {
			case CHATUSER: 
				user = new ChatUser(username, md);
				break;
			case BOT:
				user = new Bot(username, md);
				break;
			default: break;
		}
		
		return user;
	}
}
