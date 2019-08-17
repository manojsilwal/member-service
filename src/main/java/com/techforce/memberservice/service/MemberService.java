package com.techforce.memberservice.service;

import com.techforce.memberservice.model.Member;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface MemberService {
    List<Member> getMembers();

    Member getMember(String mid);
}
