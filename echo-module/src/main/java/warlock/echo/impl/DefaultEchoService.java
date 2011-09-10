package warlock.echo.impl;

import warlock.echo.EchoService;

public class DefaultEchoService implements EchoService {    
    
    public String echo(String param) {       
        return param;
    }
        
}
