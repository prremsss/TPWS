package ws;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWs")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt ){
        return mt*10.6;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") long code){
        return new Compte(code,Math.random()*1000,new Date());

    }
    @WebMethod
    public List <Compte> listComptes(){
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1l,Math.random()*1000,new Date()));
        comptes.add(new Compte(2l,Math.random()*1000,new Date()));
        comptes.add(new Compte(3l,Math.random()*1000,new Date()));
        return comptes;
    }
}
