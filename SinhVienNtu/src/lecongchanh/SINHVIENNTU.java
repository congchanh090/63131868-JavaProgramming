package lecongchanh;

public class SINHVIENNTU {
  String MSSV ;
  String Hoten ;
  public String getMSSV() {
	return MSSV;
}
public void setMSSV(String mSSV) {
	MSSV = mSSV;
}
public String getHoten() {
	return Hoten;
}
public void setHoten(String hoten) {
	Hoten = hoten;
}
public SINHVIENNTU(String mSSV, String hoten) {
	super();
	MSSV = mSSV;
	Hoten = hoten;
  }
 
}
