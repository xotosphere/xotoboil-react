package com.boilerplate.databaseservice.config;

import com.boilerplate.databaseservice.model.UserAccess;
import com.boilerplate.databaseservice.repository.UserAccessRepository;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

@Component
public class RequestFilter implements Filter {

    private final UserAccessRepository userAccessRepository;

    public RequestFilter(UserAccessRepository userAccessRepository) {
        this.userAccessRepository = userAccessRepository;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String host = request.getRemoteHost();
        String time = new Date().toString();

        UserAccess userAccess = new UserAccess();
        userAccess.setId(UUID.randomUUID().toString());
        userAccess.setType("filter");
        userAccess.setHost(host);
        userAccess.setTime(time);
        userAccessRepository.save(userAccess);

        chain.doFilter(request, response);
    }
}
