import com.googlecode.utterlyidle.HttpHandler;
import com.googlecode.utterlyidle.Request;
import com.googlecode.utterlyidle.Response;
import com.googlecode.utterlyidle.handlers.ClientHttpHandler;

import static com.googlecode.totallylazy.Uri.uri;
import static com.googlecode.utterlyidle.RequestBuilder.get;

public class ClientAPITest {
    public static void main(String[] args) throws Exception {
        HttpHandler httpClient = new ClientHttpHandler(2000);
        Request request = get(uri("http://localhost:8000/myapp/resourcePath")).build();
        Response response = httpClient.handle(request);
        System.out.println(response);
    }
}