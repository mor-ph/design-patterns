package factory;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import mediator.MsgMediator;
import mediator.User;
import mediator.UserType;

public class Bot extends User{

	public Bot(String username, MsgMediator md) {
		super(username, md);
		this.type = UserType.BOT;
		md.addUser(this);
	}

	@Override
	public void send(String msg) {
		System.out.println("+ " + this.username + ": " + msg);
		md.send(msg, this);
	}

	@Override
	public void receive(String msg, String sender) {
		System.out.println("\t -> " + this.username + " received '" + msg + "'\n");
		String regex = "([^a-zA-Z']+)'*\\1*";
		String[] words = msg.split(regex);
		List<String> wordList = new ArrayList<String>();
		wordList = Arrays.asList(words);
		if(wordList.contains("cat")) {
			md.removeUser(sender);
			send("We don't mention no \"CaT\"s in here!!!");
		}
	}

}
