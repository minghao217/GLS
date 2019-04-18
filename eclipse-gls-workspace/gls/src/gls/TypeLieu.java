package gls;

public enum TypeLieu {
	DEPART,NORMAL,FIN;
	
	public static String toString(TypeLieu typeLieu){
		if (typeLieu == TypeLieu.DEPART){
			return "depart";
		}
		else if(typeLieu == TypeLieu.NORMAL){
			return "normal";
		}
		else{
			return "fin";
		}
	}
}
