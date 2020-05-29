package mediator;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChatMsgMediator implements MsgMediator{
	
    private List<User> users;

    public ChatMsgMediator() {
        this.users = new CopyOnWriteArrayList<>();
    }

    @Override
    public void addUser(User user) {
        System.out.println(user.getUsername() + " joined chat\n");
    	if(!users.stream().anyMatch(p -> p.getUsername().equals(user.getUsername()))) {
            this.users.add(user);
    	}
    }

	@Override
	public void send(String msg, User user) {
		for (User u : users) {
            if (u != user) {
                u.receive(msg, user.getUsername());
            }
        }		
	}

	@Override
	public void removeUser(String username) {
		this.users.remove(users.stream()
				.filter(p -> p.getUsername() == username)
				.findFirst().get());	
		System.out.println(username + " was removed from this chat.\n");
	}
}
