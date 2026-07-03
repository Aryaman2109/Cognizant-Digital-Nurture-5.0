import java.util.List;

public class Service {

    private ExternalAPI externalAPI;

    public Service(ExternalAPI externalAPI){
        this.externalAPI = externalAPI;
    }

    public String fetchData(){
        return externalAPI.getData();
    }

}