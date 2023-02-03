package com.dailycodebuffer.UserService.controller;

import com.dailycodebuffer.CommonService.model.User;
import com.dailycodebuffer.CommonService.queries.GetUserPaymentDetailsQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    private transient QueryGateway queryGateway;

    public UserController(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    @GetMapping("{userId}")
    public User getUserPaymentDetails(@PathVariable String userId){
        GetUserPaymentDetailsQuery getUserPaymentDetailsQuery
                = new GetUserPaymentDetailsQuery(userId);
        User user =
                queryGateway.query(getUserPaymentDetailsQuery,
                        ResponseTypes.instanceOf(User.class)).join();

        return user;
    }

}
