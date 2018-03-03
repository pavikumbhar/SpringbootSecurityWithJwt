package com.pavikumbhar.javaheart.profile.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavikumbhar.javaheart.security.auth.JwtAuthenticationToken;
import com.pavikumbhar.javaheart.security.model.UserContext;

/**
 * End-point for retrieving logged-in user details.
 * 
 * @author pavi kumbhar
 *
 * 
 */
@RestController
public class ProfileEndpoint {
    @RequestMapping(value="/api/me", method=RequestMethod.GET)
    public @ResponseBody UserContext get(JwtAuthenticationToken token) {
        return (UserContext) token.getPrincipal();
    }
}
