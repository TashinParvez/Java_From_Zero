package Exception.P_406;

public class DataFetcher {
    public String fetchUrl(String url) throws CheckedException {
        if (url == null)
            throw new CheckedException("Url not Found");
        String data = null;
        return data;
    }
}
