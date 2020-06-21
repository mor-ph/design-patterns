package observer;

import java.util.ArrayList;
import java.util.List;

import chainOfResponsibility.Package;

public class Client {
	
	private List<Package> packages = new ArrayList<Package>();

	public List<Package> getPackages() {
		return packages;
	}

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}
	
	public void sendPackage(Package pack) {
		
	}
}

