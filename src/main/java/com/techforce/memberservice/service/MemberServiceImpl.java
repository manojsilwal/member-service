package com.techforce.memberservice.service;

import com.techforce.memberservice.model.Member;
import com.techforce.memberservice.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<Member> getMembers() {
        return memberRepository.getMembers();
    }

    @Override
    public Member getMember(String mid) {
        return memberRepository.getMember(mid);
    }
}
