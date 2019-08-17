package com.techforce.memberservice;

import com.techforce.memberservice.model.Member;
import com.techforce.memberservice.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/members")
    public List<Member> getMembers(){
        return memberService.getMembers();
    }

    @GetMapping("/member/{mid}")
    public Member getMembers(@PathVariable String mid){
        return memberService.getMember(mid);
    }

}
