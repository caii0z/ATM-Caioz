package atm.oc.test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import atm.oc.model.MyFirstClass;
import atm.oc.rmi.IRMII;


public class ClienteTeste {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		IRMII testejpa = (IRMII)Naming.lookup("rmi://127.1.1.1/rmi");
		
		MyFirstClass obj = new MyFirstClass();
		obj.setNumero(123);
		obj.setTexto("Teste");
		
		testejpa.salvar(obj);
		
		
	}
}
