package main;

import core.services.BankService;
import core.services.ClientService;
import core.services.ProviderService;
import core.services.StoreService;

public class Main {

	public static void main(String[] args) {
		ProviderService prov = new ProviderService();
		BankService bank = new BankService();
		StoreService store = new StoreService(prov,bank);
		ClientService cl = new ClientService(store);
		
		cl.run();

	}

}
