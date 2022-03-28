package man;

import man.models.Caunt;

public class Man {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caunt cc = new Caunt(Caunt.caunt.CAUNT_CHAIN);
		Caunt cp = new Caunt(Caunt.caunt.CAUNT_SANVINGS);
		cc.deposit(200);
        System.out.println(cc);
        System.out.println(cp);
        cc.transfer(100, cp);
        System.out.println(cc);
        System.out.println(cp);
        System.out.println();
	}

}
