
package wsbank;

import javax.ejb.Local;

@Local
public interface ClientManagerLocal {
    Client obtemClient(String username, String Password)   
}
