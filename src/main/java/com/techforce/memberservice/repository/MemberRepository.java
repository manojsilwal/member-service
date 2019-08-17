package com.techforce.memberservice.repository;

import com.techforce.memberservice.model.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberRepository {
    private Map<Integer, Member> members = new HashMap<Integer, Member>(){{
        put(1, Member.builder().mid(1).name("Manoj").build());
        put(2, Member.builder().mid(2).name("Shyam").build());
    }};

    public void addMember(Member member){
        members.put(member.getMid(), member);
    }

    public List<Member> getMembers(){
        return new ArrayList<>(members.values());
    }
    public Member getMember(String mid){
        return members.get(mid);
    }
}
