package calculator;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class CalculatorResource {
	
	@POST
    @Path("/add")
    @Produces({ "application/json" })
	@Consumes({"application/json"})
    public Integer addNumbers(UserInput input) {
        return input.getNumber1()+input.getNumber2();

    }
	
	@POST
    @Path("/subtract")
    @Produces({ "application/json" })
	@Consumes({"application/json"})
    public Integer subtractNumbers(UserInput input) {
        return input.getNumber1()-input.getNumber2();
    }
	
	@POST
    @Path("/multiply")
    @Produces({ "application/json" })
	@Consumes({"application/json"})
    public Integer multiplyNumbers(UserInput input) {
        return input.getNumber1()*input.getNumber2();
    }
	
	@POST
    @Path("/divide")
    @Produces({ "application/json" })
	@Consumes({"application/json"})
    public Integer divideNumbers(UserInput input) {
		if(!input.getNumber2().equals(0)) {
			return (input.getNumber1())/(input.getNumber2());
		}
		else {
			System.out.println("Invalid input: cannot divide by 0.");
			return null;
		}
        
    }
}
