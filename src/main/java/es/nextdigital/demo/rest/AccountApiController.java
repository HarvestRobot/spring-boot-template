package es.nextdigital.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-08T19:41:47.671017400+02:00[Europe/Madrid]")

@Controller
@RequestMapping("${openapi.bankAccounting.base-path:}")
public class AccountApiController implements AccountApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
