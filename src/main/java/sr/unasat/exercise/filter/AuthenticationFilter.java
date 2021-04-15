package sr.unasat.exercise.filter;


import com.sun.jersey.core.util.Base64;

import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.StringTokenizer;


@Provider
@PreMatching

public class AuthenticationFilter implements ContainerRequestFilter {



    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
       if (!containerRequestContext.getUriInfo().getPath().equals("users/auth")){
           String authHeader = containerRequestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
           if (authHeader == null) throw new NotAuthorizedException("Not allowed");
           String authToken = authHeader.replaceFirst("Basic", "");
           String decodedString = Base64.base64Decode(authToken);
           StringTokenizer tokenizer = new StringTokenizer(decodedString, ":");
           String username = tokenizer.nextToken();


           if (!"user".equals(username)){
               throw new NotAuthorizedException("Not allowed");
           }
       }

    }


}
