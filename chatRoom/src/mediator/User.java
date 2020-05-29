package mediator;

public abstract class User {
	
	protected String username;
	protected UserType type;
	protected MsgMediator md;
	
	public User(String username, MsgMediator md) {
        this.username = username;
        this.md = md;
    }
	
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public abstract void send(String msg);

    public abstract void receive(String msg, String sender);
}
