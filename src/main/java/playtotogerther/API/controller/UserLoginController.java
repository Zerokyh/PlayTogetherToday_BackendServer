package playtotogerther.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import playtotogerther.API.model.UserLogin;
import playtotogerther.API.service.UserLoginService;
import playtotogerther.API.util.ApiResponse;
import playtotogerther.API.util.Code;
import playtotogerther.API.util.ResponseMessage;
import playtotogerther.API.util.Status;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "https://victorious-pond-07ef29800.5.azurestaticapps.net")
@RequestMapping("/login")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @PostMapping
    public ApiResponse<UserLogin> getLogin(@RequestBody UserLogin userLogin) {
        System.out.println("받은 로그인 데이터: " + userLogin.getMemberEmail());
        System.out.println("받은 로그인 데이터: " + userLogin.getMemberPw());
//        boolean isLogin = userLoginService.login(userLogin.getMemberEmail(), userLogin.getMemberPw());
        UserLogin user = userLoginService.login(userLogin.getMemberEmail(), userLogin.getMemberPw());
        if (user != null) {
            return new ApiResponse<>(Status.OK, Code.SUCCESS, ResponseMessage.LOGIN_SUCCESS, user);
        } else {
            return new ApiResponse<>(Status.FAIL, Code.UNAUTHORIZED, ResponseMessage.LOGIN_FAILURE, null);
        }
    }
}
