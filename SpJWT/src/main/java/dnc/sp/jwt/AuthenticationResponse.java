package dnc.sp.jwt;

public class AuthenticationResponse {
	String jwt;
	
	
	

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}




	public String getJwt() {
		return jwt;
	}
	
	

}
