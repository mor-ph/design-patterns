import chainOfResponsibility.Scope;

import java.util.ArrayList;
import java.util.List;

import chainOfResponsibility.DlvrWorker;
import chainOfResponsibility.ObsrvWorker;
import chainOfResponsibility.Package;
import observer.Client;

public class Main {
	private static DlvrWorker assembleChain() {
		DlvrWorker pv = new DlvrWorker("Gosho PV", Scope.PV);
		DlvrWorker bg = new DlvrWorker("Gosho BG", Scope.BG);
		DlvrWorker intern = new DlvrWorker("Gosho International", Scope.INTERNATIONAL);
	
		pv.setNextDlvrWorker(bg);
		bg.setNextDlvrWorker(intern);
		
		return pv;
	}

	public static void main(String[] args) {
		ObsrvWorker observer = new ObsrvWorker("observer");
		
		Client client = new Client();

		List<Package> forSending = new ArrayList<Package>(client.getPackages());
		Package p1 = new Package("Delivery for Plovdiv", Scope.PV);
		Package p2 = new Package("Delivery for Fiji", Scope.INTERNATIONAL);
		Package p3 = new Package("Delivery for Varna", Scope.BG);
		forSending.add(p1);
		forSending.add(p2);
		forSending.add(p3);
		
		DlvrWorker chain = assembleChain();
		
		for(Package p : forSending) {
			chain.subscribe(observer);
			chain.processPackage(p);
		}
		
	}

}
