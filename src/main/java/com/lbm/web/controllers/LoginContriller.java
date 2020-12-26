package com.lbm.web.controllers;

import com.lbm.web.model.LoginRequest;
import com.lbm.web.model.RegistrationRequest;
import com.lbm.web.model.RequestContext;
import com.lbm.web.model.UserRequest;
import com.lbm.web.model.UserResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginContriller {

  @GetMapping(value = "/")
  public String getWelcomePage() {
    return "welcome";
  }

  @GetMapping("/register")
  public ModelAndView register() {
    return new ModelAndView("register", "userRequest", new UserRequest());
  }

  @PostMapping("/register")
  public ModelAndView save(@ModelAttribute("userRequest") UserRequest userRequest) {

    RestTemplate restTemplate = new RestTemplate();
    RegistrationRequest registrationRequest = new RegistrationRequest();
    String url = "http://localhost:9002/lbmanagerservice/rest/entering/saveUser";
    HttpHeaders headers = new HttpHeaders();
    RequestContext requestContext = new RequestContext();
    requestContext.setRequestId("web123");
    registrationRequest.setRequestContext(requestContext);

    registrationRequest.setEmail(userRequest.getEmail());
    registrationRequest.setPassword(userRequest.getPassword());
    registrationRequest.setPhNumber(userRequest.getPhNumber());
    registrationRequest.setUserName(userRequest.getUserName());

    headers.add("Content-Type", "application/json");
    HttpEntity<UserRequest> entity = new HttpEntity<UserRequest>(userRequest, headers);
    UserResponse userResponse = restTemplate.exchange(url, HttpMethod.POST, entity, UserResponse.class).getBody();
    return new ModelAndView("home");
  }
  
  @GetMapping("/login")
  public ModelAndView login() {
    return new ModelAndView("login", "loginRequest", new LoginRequest());
  }
  
  @PostMapping("/login")
  public ModelAndView login(@ModelAttribute("loginRequest") LoginRequest loginRequest) {
    if (loginRequest.equals(null)) {
      return new ModelAndView("login");
    }
//    RestTemplate restTemplate = new RestTemplate();
//    RegistrationRequest registrationRequest = new RegistrationRequest();
//    String url = "http://localhost:9002/lbmanagerservice/rest/entering/login";
//    HttpHeaders headers = new HttpHeaders();
//
//
//    headers.add("Content-Type", "application/json");
////    HttpEntity<UserRequest> entity = new HttpEntity<UserRequest>(userRequest, headers);
//    UserResponse userResponse = restTemplate.exchange(url, HttpMethod.POST, entity, UserResponse.class).getBody();
    
    return new ModelAndView("home");
  }
}
