package mediator;


public interface MsgMediator {
	void send(String msg, User user);
	void addUser(User user);
	void removeUser(String username);
}
