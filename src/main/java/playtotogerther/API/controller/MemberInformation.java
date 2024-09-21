package playtotogerther.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import playtotogerther.API.model.MemberInfo;
import playtotogerther.API.repository.MemberInfoRepository;

import java.util.Optional;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class MemberInformation {

    @Autowired
    private MemberInfoRepository memberInfoRepository;

    @GetMapping("/Myroom")
    @ResponseBody

    public MemberInfo getMemberInfo(){
        Optional<MemberInfo> memberInfo = memberInfoRepository.findById(1);
        if(memberInfo.isPresent()){
            return memberInfo.get();
        }else {
            return  new MemberInfo(1,"없음","없음","없음","없음","없음","없음","없음",0,0,0,0);
        }
    }
}
